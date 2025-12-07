package com.technoelevate.java_revision.basics;
public class StringCompare {
	public static void main(java.lang.String[] args) {
		String s1 = "jAva";
		String s2 = new String("java");
		String s3=s1+" "+s2;
		if (s1.equalsIgnoreCase(s2)) {
			System.out.println("two strings are equal "+s3);
		} else {
			System.out.println("two are not equal");
		}
	}

}
