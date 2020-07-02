/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 */
package com.itranswarp.learnjava;
public class Calculator {

	private long n = 0;

	public long add(long x) {
		n = n + x;
		return n;
	}

	public long sub(long x) {
		n = n - x;
		return n;
	}
}
