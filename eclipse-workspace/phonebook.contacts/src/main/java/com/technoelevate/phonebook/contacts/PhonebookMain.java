package com.technoelevate.phonebook.contacts;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JOptionPane;

public class PhonebookMain {

	static EntityManagerFactory entityManagerFactory = null;
	static EntityManager entityManager = null;
	static EntityTransaction transaction = null;
	static Contacts contacts = null;
	static Scanner scanner = new Scanner(System.in);

	public static void hibernate() {
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("hibernate");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();

		} catch (Exception e) {
			System.err.println("connection fails...please check....");
		}

	}

	@SuppressWarnings("unchecked")
	public static void createQuery() {
		Query createQuery = entityManager.createQuery("from Contacts");
		@SuppressWarnings("rawtypes")
		List resultList = createQuery.getResultList();
		resultList.forEach(System.out::println);

	}

	public static void search() {
		System.out.println("enter your name of the contacts");
		String s = scanner.next();
		try {
			Query createQuery = entityManager
					.createQuery(" select contact_num from Contacts where contact_name='" + s + "'");
			long executeUpdate = (long) createQuery.getSingleResult();
			System.out.println(executeUpdate);
			boolean loop = true;
			while (loop) {
				System.out.println("select an option\n1)call\n2)text");
				int i = scanner.nextInt();
				if (i == 1) {
					System.out.println("calling .....");
				} else if (i == 2) {
					System.out.println("texting to....");
				} else {
					System.out.println("inc");
					loop = false;
				}
			}

		} catch (Exception e) {

			System.err.println("your entered input not matches with our database.......");
		}
	}

	public static void exit() {
		JOptionPane.showMessageDialog(null, "thankyou 🙏🙏🙏🙏🙏🙏🙏🙏🙏");
		System.out.println("thank u 🙏🙏🙏🙏🙏🙏💋💋💋");
		// System.exit(0);
	}

	public static void showAllContats() {
		hibernate();
		createQuery();

	}

	public static void searchContact() {
		hibernate();
		search();

	}

	public static void operateContact() {
		System.out.println("please select options\n1)add\n2)delete\n3)update");
		int i = scanner.nextInt();
		if (i == 1) {
			hibernate();
			add();
		} else if (i == 2) {
			hibernate();
			delete();

		} else if (i == 3) {
			hibernate();
			update();
		}

	}

	public static void add() {
		System.out.println("enter number,name,emailid");
		long i = scanner.nextLong();
		String s = scanner.next();
		String q = scanner.next();
		transaction.begin();
		Contacts contacts = new Contacts(i, s, q);
		entityManager.persist(contacts);

		transaction.commit();
		System.out.println("new contact added succesfully");

	}

	public static void delete() {
		System.out.println("enter number you want to delete");
		int i = scanner.nextInt();
		transaction.begin();
		Query createQuery = entityManager.createQuery("delete from Contact where contact_num= " + i);
		int executeUpdate = createQuery.executeUpdate();
		transaction.commit();
		System.out.println(executeUpdate + "deleted succesfully");
	}

	public static void update() {
		System.out.println("enter number you want to update");
		long i = scanner.nextLong();
		System.out.println("enter name");
		String s = scanner.next();
		transaction.begin();
		Query createQuery = entityManager
				.createQuery("update Contacts set contact_name='" + s + "' where contact_num=" + i);
		long executeUpdate = createQuery.executeUpdate();
		transaction.commit();
		System.out.println("updated succesfully");

	}

	public static void main(String[] args) {
		boolean loop = true;
		while (loop) {
			System.out.println("please enter an option\n1)show all contacts\n2)search contacts\n3)operate on contacts");
			int i = scanner.nextInt();

			if (i == 1) {
				showAllContats();

			} else if (i == 2) {
				searchContact();

			} else if (i == 3) {
				operateContact();
			} else {
				loop = false;

				System.err.println("thankyou 🙏🙏🙏🙏🙏🙏🙏💋💋💋💋💋💋");
			}

		}

	}

}
