package com.itranswarp.learnjava;

import java.lang.reflect.Method;

/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 */
public class Main {

	public static void main(String[] args) throws Exception {
		String name = "Xiao Ming";
		int age = 20;
		Person p = new Person();
		// TODO: 利用反射调用setName和setAge方法:
		Class c = p.getClass();
		Method m = c.getDeclaredMethod("setAge", int.class);
		m.invoke(p, 30);
		Method m2 = c.getDeclaredMethod("setName",String.class);
		m2.invoke(p,"Xiaohong");
		System.out.println(p.getName()); // "Xiao Ming""
		System.out.println(p.getAge()); // 20
	}
}
