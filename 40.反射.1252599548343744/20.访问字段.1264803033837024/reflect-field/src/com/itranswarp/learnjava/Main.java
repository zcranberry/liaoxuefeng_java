package com.itranswarp.learnjava;

import java.lang.reflect.Field;

/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 */
public class Main {

	public static void main(String[] args) {
		String name = "Xiao Ming";
		int age = 20;
		Person p = new Person();
		// TODO: 利用反射给name和age字段赋值:
		Class c = p.getClass();
		try {
			Field f = c.getDeclaredField("name");
			f.setAccessible(true);
			f.set(p,"Xiaohong");
		}catch (NoSuchFieldException e) {
			e.printStackTrace();
		}catch (IllegalArgumentException e){
			e.printStackTrace();
		}
		catch (IllegalAccessException e){
			e.printStackTrace();
		}

		System.out.println(p.getName()); // "Xiao Ming"
		System.out.println(p.getAge()); // 20
	}
}
