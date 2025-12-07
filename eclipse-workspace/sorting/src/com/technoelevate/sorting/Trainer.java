
package com.technoelevate.sorting;

public class Trainer implements Comparable<Trainer>{
	int id;
	String name;
	String exp;
	public Trainer(String exp, String name, int id) {
		this.id = id;
		this.name = name;
		this.exp = exp;
	}
	@Override
	public String toString() {
		return "Trainer [id=" + id + ", name=" + name + ", exp=" + exp + "]";
	}
	@Override
	public int compareTo(Trainer o) {
		return this.exp.compareTo(o.exp);
	}
	

}
