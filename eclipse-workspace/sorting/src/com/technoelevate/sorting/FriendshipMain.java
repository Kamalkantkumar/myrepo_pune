package com.technoelevate.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class FriendshipMain {

	public static void main(String[] args) {
     ArrayList<FriendShip>arrayList=new ArrayList<FriendShip>();//list instance
     arrayList.add(new FriendShip("balla", "friend", 20));//constructor
     arrayList.add(new FriendShip("venkatesh", "just friend", 21));
     arrayList.add(new FriendShip("avi", "best frnd", 21));
     arrayList.add(new FriendShip("dhananjey", "friend", 22));
     arrayList.add(new FriendShip("avinash", "just friend", 20));
     arrayList.add(new FriendShip("madhu", "friend", 21));
     Collections.sort(arrayList);
    // System.out.println(arrayList);
     for(Object o:arrayList) {
    	 System.out.println(o);
     }
	}
}
