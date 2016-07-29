package com.hand;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
		System.out.print("请输入日期：");
		Scanner scanner = new Scanner(System.in);
		String date = scanner.nextLine();
		String[] time = date.split("-");
		int[] sum = new int[12];
		int year = Integer.parseInt(time[0]);
		int month = Integer.parseInt(time[1]);
		int day = Integer.parseInt(time[2]);
		int count = 0;
		for (int i = 0; i < month - 1; i++) {
			switch (i + 1) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				count += 31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				count += 30;
				break;

			default:
				if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
					count += 29;
				} else {
					count += 28;
				}
				break;
			}
		}
		count = count + day;

		System.out.println(count);
	}

}
