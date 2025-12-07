package com.technoelevate.multiplayerr.dao;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JOptionPane;

import com.technoelevate.multiplayerr.pojo.Multimedia;

public class MultiplayerClass {
	static EntityManagerFactory createEntityManagerFactory = null;
	static EntityManager createEntityManager = null;
	static EntityTransaction transaction = null;
	static Multimedia multimedia = null;
	static Scanner scanner = new Scanner(System.in);

	public static void hibernate() {
		try {
			createEntityManagerFactory = Persistence.createEntityManagerFactory("hibernate");
			createEntityManager = createEntityManagerFactory.createEntityManager();
			transaction = createEntityManager.getTransaction();

		} catch (Exception e) {
			System.out.println("connection fail!!!!!!!!!!!!!!!");
		}

	}

	public static void QueryList() {
		Query createQuery = createEntityManager.createQuery("from Multimedia");

		@SuppressWarnings("rawtypes")
		List resultList = createQuery.getResultList();
		for (Object object : resultList) {
			System.out.println(object);
		}
	}

	public static void UpdateQuery() {

		transaction.begin();
		System.out.println("enter song name do you want to add");
		String b = scanner.next();
		multimedia.setSname(b);
		createEntityManager.persist(multimedia);

		System.out.println("enter song id");
		int c = scanner.nextInt();
		@SuppressWarnings("unused")
		Multimedia find = createEntityManager.find(Multimedia.class, c);
		transaction.commit();
	}

	public static void deleteAQuery() {
    MultiplayerClass.hibernate();
		transaction.begin();
		System.out.println("enter song id to delete");
		int a = scanner.nextInt();
		Query createQuery = createEntityManager.createQuery("delete from Multimedia where sid="+a);
		int executeUpdate = createQuery.executeUpdate();
		transaction.commit();
		  System.out.println("song deleted succesfully");
	}

	public static void playSong() {
		// MultiplayerClass.hibernate();
		System.out.println("play a song");
		System.err.println("please 🙏🙏🙏🙏 choose a option  ");
		// JOptionPane.showInputDialog(null,"1)play all songs\n2)play a random
		// song\n3)play a particular song");
		System.out.println("1)play all songs\n2)play a random song\n3)play a particular song ");
		int c = scanner.nextInt();
		if (c == 1) {
			MultiplayerClass.playAllSongs();
		} else if (c == 2) {
			MultiplayerClass.randomAccess();
		} else if (c == 3) {
			MultiplayerClass.playParticularSong();

		} else {
			MultiplayerClass.exit();
		}

	}

	public static void playAllSongs() {
		System.out.println("play all the songs");
		MultiplayerClass.hibernate();
		MultiplayerClass.QueryList();

		System.out.println("choose an option\n1)menu\n2)exit");
		int b = scanner.nextInt();

		if (b == 1) {
			MultiplayerClass.playSong();

		} else {
			MultiplayerClass.exit();
		}
	}

	public static void addSongs() {
		System.out.println("add the songs");
     
	}
	

	public static void searchASong() {
		System.out.println("search a song");
		MultiplayerClass.hibernate();
		System.out.println("enter song id");
		int a=scanner.nextInt();
		multimedia=createEntityManager.find(Multimedia.class, a);
		System.out.println(multimedia);
		System.out.println("choose an option\n 1)menu\n2)exit");
		int b = scanner.nextInt();

		if (b == 1) {
			MultiplayerClass.playSong();

		} else {
			MultiplayerClass.exit();
		}
	
	}

	public static void manipulateASong() {

		System.out.println("manipulate a song\nenter the input\n1)update a song2)delete a song");
		int i = scanner.nextInt();
		if (i == 1) {
			MultiplayerClass.hibernate();
			MultiplayerClass.UpdateQuery();
		} else if (i == 2) {
			MultiplayerClass.hibernate();
			MultiplayerClass.deleteAQuery();
		} else {
			MultiplayerClass.exit();
		}

	}

	public static void randomAccess() {
		System.out.println("play a random song");
		MultiplayerClass.hibernate();
		int random = (int) (Math.random()*10);
		Query createQuery = createEntityManager.createQuery("select sname from Multimedia where sid="+random);
		List resultList = createQuery.getResultList();
		for (Object object : resultList) {
			System.out.println(object);
		}
		System.out.println("choose an option\n1)menu\n2)exit");
		int b = scanner.nextInt();

		if (b == 1) {
			MultiplayerClass.playSong();

		} else {
			MultiplayerClass.exit();
		}
		
   
	}

	public static void playParticularSong() {
		System.out.println("what song you want");
         MultiplayerClass.hibernate();
         System.out.println("enter song id to delete");
         int b=scanner.nextInt();
         Query createQuery = createEntityManager.createQuery("select sname from Multimedia where sid ="+b);

 		@SuppressWarnings("rawtypes")
		List resultList = createQuery.getResultList();
 		for (Object object : resultList) {
 			System.out.println(object);
 			System.out.println("enter the options\n1)main menu\n2)exit");
 			int i =scanner.nextInt();
 			if(i==1) {
 				MultiplayerClass.playSong();
 			}
 			if(i==2) {
 				MultiplayerClass.exit();
 			}
 		}
	}

	public static void exit() {
		JOptionPane.showMessageDialog(null, "thankyou 🙏🙏🙏🙏🙏🙏🙏🙏🙏");

	}

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "WELCOME TO MUSIC PLAYER 🙌🙌");
		System.err.println("please choose the options 🙏🙏🙏🙏🙏🙏🙏🙏");
		System.out.println("1)play a song \n2)search a song\n3)manipulate a song");
		int a = scanner.nextInt();
		if (a == 1) {
			MultiplayerClass.playSong();

		} else if (a == 2) {
			MultiplayerClass.searchASong();
		} else if (a == 3) {
			MultiplayerClass.manipulateASong();
		} else {
			MultiplayerClass.exit();
		}

	}

}
