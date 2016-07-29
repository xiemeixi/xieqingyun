package com.hand;
/**
 * Hello world!
 *
 */
public class App 

public class App {
	public static void main(String[] args) {

		int sum = 0;

		int[] arr = new int[30];
		int f = 0;
		for (int i = 101; i < 201; i++) {
			boolean flag = true;
			for (int j = 2; j < Math.sqrt(i)+1; j++) {
				if (i % j == 0) {
					flag = false;
				}
			}
			if (flag) {

				arr[f] = i;
				f = f + 1;
				sum = sum + 1;
			}

		}
		System.out.println("101-200之间总共有" + sum + "个素数： ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0)
				continue;
			else
				System.out.print(arr[i] + " ");

		}
	}

}
