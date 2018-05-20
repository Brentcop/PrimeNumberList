package com.gc.prime;

import java.util.ArrayList;

/**
 * @author Brent Coppinger
 */
public class Prime {

	/**
	 * @param input
	 * @return
	 */
	public int prime(int input) {
	int num = 1;
	boolean prime = true;

		ArrayList<Integer> list = new ArrayList<>();

	do {
		num++;
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
				prime = false;
					break;
				} else {
				prime = true;
				}
			}
			if (prime) {
			list.add(num);
			}
		} while (list.size() < input);

		return num;
	}
}