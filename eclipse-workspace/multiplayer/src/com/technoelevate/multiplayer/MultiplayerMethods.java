package com.technoelevate.multiplayer;

import java.util.Scanner;


public class MultiplayerMethods {
		Scanner scan=new Scanner(System.in);
	public void playASong() {
		int i=scan.nextInt();
		if(i==1) {
			System.out.println(
					"play the song\nselect the options below\n1.play all songs\n2.play a random song\n3.play a particular song");
			int j=scan.nextInt();
			if(j==1) {
				System.out.println("play all the songs");
				
				
			}
			
		}
	

}
}