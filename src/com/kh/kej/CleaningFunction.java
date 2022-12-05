package com.kh.kej;

import java.util.Scanner;

public class CleaningFunction {
	Customer[] customer;
	private int i;  // 
	
	public CleaningFunction() {
		customer = new Customer[3];
	}
	
	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===== ��Ź ���� ���α׷� =====");
		System.out.println("1. �� ���� �Է�");
		System.out.println("2. ��Ź ��Ź ���� �Է�");
		System.out.println("3. ���� ��Ź ���� �Է�");
		System.out.println("4. �ֹ� ���� Ȯ��");
		System.out.println("5. ���α׷� ����");
		System.out.print("6. �޴� ��ȣ �Է� : ");
		int menu = sc.nextInt();
		System.out.println("========================");
		System.out.println();
		return menu;
		
	}
	
	public void inputCustomer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===== �� ���� �Է� =====");
		for(int i = 0; i < customer.length; i++) {
			System.out.print("1. �̸� : ");
			String name = sc.next();
			System.out.print("2. ����ó ( - ���� ��ȣ�� �Է��ϼ���) : ");
			int phone = sc.nextInt();
			System.out.print("3. �ּ� : ");
			String address = sc.next();
			customer[i] = new Customer();
			customer[i].setName(name);
			customer[i].setPhone(phone);
			customer[i].setAddress(address);
			System.out.println("========================");
			System.out.println();
			break;
			
		}
		
	}
	
	public void inputCleaningOne() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===== ��Ź ��Ź ���� �Է� =====");
		System.out.println("1. ����(Ƽ����, ����, ���콺 ��)");
		System.out.println("2. ���� (����, ġ�� ��)");
		System.out.println("3. ���� (��Ʈ, �е� ��)");
		System.out.println("4. ħ����");
		System.out.println("5. ��Ÿ ǰ��");
		System.out.print("��Ͽ��� ��ȣ �ϳ��� ���ϼ���. : ");
		int one = sc.nextInt();
		System.out.println("========================");
		System.out.println();
	}
	
	public void inputCleaningTwo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===== ���� ��Ź ���� �Է� ===== ");
		System.out.print("1. ��Ź�� ���� ����� (01�� 01�� �������� �ۼ�) : ");
		String day = sc.nextLine(); 
		System.out.print("2. ��Ź�� ���� ����ð� (10�� ������ ���� �����ϸ�, 00�� 00�� �������� �ۼ��ϼ���.) : ");
		String time = sc.nextLine();
		System.out.print("3. ���� ��� ���� (ī��, ���� �� ���� ����) : ");
		String pay = sc.nextLine();
		System.out.println("========================");
		System.out.println();
		}
	
	public void printResult() {
		System.out.println("===== �ֹ� ���� Ȯ�� =====");
		System.out.println( customer[i].getName() + " ���� �ֹ� �����Դϴ�.");
		System.out.println("�Է��Ͻ� " + customer[i].getAddress() + "�ּҷ� " + customer[i].getDay() + customer[i].getTime() + "�� �湮 �����Դϴ�.");
		System.out.println();
	}
	
	public void endMsg() {
		System.out.println("��Ź ���� ���α׷��� ����Ǿ����ϴ�.");
		System.out.println("�̿��� �ּż� �����մϴ�.");
	}
	
	public void exceptionMsg() {
		System.out.println("1 ~ 5 ������ ��ȣ�� �Է��ϼ���.");
	}
	
}
