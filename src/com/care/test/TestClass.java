package com.care.test;

public class TestClass {
	public static void main(String[] args) {
		int num = 100;	//변수 (첫글자가 소문자)
		MemberClass m = new MemberClass();	//객체 (첫글자가 대문자)
		m.name = "홍길동";
		m.age = 20;
		System.out.println("이름 : "+ m.name);
		System.out.println("나이 : "+ m.age);
	}
}
