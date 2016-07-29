package com.hand;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {
		System.out.println("请输入工资");
		Scanner scanner = new Scanner(System.in);
		double a = scanner.nextInt();
		double b = 0;
		double c = 0;
		double d = 0;
		double e = 0;
		double f = 0;
		double g = 0;
		double h = 0;
	
		if (a < 3500) {
			b = 0;
		} else if (a >= 3500) {
			if ((a - 3500) > 0 && (a - 3500) <= 1500) {
				c = (a - 3500) * 0.03;
			} else if ((a - 5000) > 0 && (a - 5000) <= 3000) {
				d = (a - 5000) * 0.1;
			} else if ((a - 8000) > 0 && (a - 8000) <= 4500) {
				e = (a - 8000) * 0.2;
			} else if ((a - 12500) > 0 && (a - 12500) <= 26000) {
				f = (a - 12500) * 0.25;
			} else if ((a - 38500) > 0 && (a - 38500) <= 20000) {
				g = (a - 38500) * 0.3;
			} else if ((a - 58500) > 0 && (a - 58500) <= 25000) {
				h = (a - 58500) * 0.35;
			} else if ((a - 83500) > 0) {
				h = (a - 83500) * 0.45;
			}
			b = c + d + e + f + g + h;
		}
		System.out.println("所需要缴纳的税费为：" + b + "元");

	}

}
