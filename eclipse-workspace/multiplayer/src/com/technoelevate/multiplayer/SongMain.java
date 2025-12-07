package com.technoelevate.multiplayer;

import java.util.ArrayList;
import java.util.Scanner;

public class SongMain {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>(8);
		arrayList.add("1.NATU NATU ");
		arrayList.add("2.LEHARAYI");
		arrayList.add("3.DOSTIII");
		arrayList.add("4.BUTTA BOMMA");
		arrayList.add("5.GEETHA GOVINDAM");
		arrayList.add("6.JWALA REDDY");
		arrayList.add("7.MANASA MANASA");
		arrayList.add("8.ESWARA");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("multiplayer options\n1.play a song\n2.search a song\n3.operate on multiplayer");
		int input = scan.nextInt();
		if (input == 1) {
			System.out.println(
					"play the song\nselect the options below\n1.play all songs\n2.play a random song\n3.play a particular song");
			int i = scan.nextInt();
			if (i == 1) {
				System.out.println("wait for some time songs are comming for u !!!!!!!!!!!!!");
				for (String string : arrayList) {
					System.out.println(string);

				}

			} else if (i == 2) {
				System.out.println("playing!!!!!!!!!!!!");
				System.out.println(arrayList.get((int) Math.random()));

			} else if (i == 3) {
				System.out.println("which song u want");
			}

		}

		if (input == 2) {
			System.out.println("search for the song");

		} else if (input == 3) {
			System.out.println("");
			System.out.println("here you can add or delete a song\n1.add a song\n2.delete a song");
			int j = scan.nextInt();
			if (j == 1) {
				System.out.println("please add the song");
				//arrayList.add("")

			}

		} else {
			//System.out.println("enter a correct input bugger!!!!!!!!!!!");

		}
	}
}
