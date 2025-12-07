package com.technoelevate.sorting;

public class FriendShip implements Comparable<FriendShip> {
String name;
String Relation;
int age;
public FriendShip(String name, String relation, int age) {
	this.name = name;
	Relation = relation;
	this.age = age;
}
@Override
public int compareTo(FriendShip o) {
	// TODO Auto-generated method stub
	return this.Relation.compareTo(o.Relation);
}
@Override
public String toString() {
	return "FriendShip [name=" + name + ", Relation=" + Relation + ", age=" + age + "]";
}


}
