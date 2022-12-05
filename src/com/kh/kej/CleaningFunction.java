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
		System.out.println("===== 세탁 관리 프로그램 =====");
		System.out.println("1. 고객 정보 입력");
		System.out.println("2. 위탁 세탁 정보 입력");
		System.out.println("3. 수령 세탁 정보 입력");
		System.out.println("4. 주문 내역 확인");
		System.out.println("5. 프로그램 종료");
		System.out.print("6. 메뉴 번호 입력 : ");
		int menu = sc.nextInt();
		System.out.println("========================");
		System.out.println();
		return menu;
		
	}
	
	public void inputCustomer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===== 고객 정보 입력 =====");
		for(int i = 0; i < customer.length; i++) {
			System.out.print("1. 이름 : ");
			String name = sc.next();
			System.out.print("2. 연락처 ( - 없이 번호만 입력하세요) : ");
			int phone = sc.nextInt();
			System.out.print("3. 주소 : ");
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
		System.out.println("===== 위탁 세탁 정보 입력 =====");
		System.out.println("1. 상의(티셔츠, 셔츠, 블라우스 등)");
		System.out.println("2. 하의 (바지, 치마 등)");
		System.out.println("3. 외투 (코트, 패딩 등)");
		System.out.println("4. 침구류");
		System.out.println("5. 기타 품목");
		System.out.print("목록에서 번호 하나를 택하세요. : ");
		int one = sc.nextInt();
		System.out.println("========================");
		System.out.println();
	}
	
	public void inputCleaningTwo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===== 수령 세탁 정보 입력 ===== ");
		System.out.print("1. 세탁물 수령 희망일 (01월 01일 형식으로 작성) : ");
		String day = sc.nextLine(); 
		System.out.print("2. 세탁물 수령 희망시간 (10분 단위로 예약 가능하며, 00시 00분 형식으로 작성하세요.) : ");
		String time = sc.nextLine();
		System.out.print("3. 결제 방법 선택 (카드, 현금 중 선택 가능) : ");
		String pay = sc.nextLine();
		System.out.println("========================");
		System.out.println();
		}
	
	public void printResult() {
		System.out.println("===== 주문 내역 확인 =====");
		System.out.println( customer[i].getName() + " 님의 주문 내역입니다.");
		System.out.println("입력하신 " + customer[i].getAddress() + "주소로 " + customer[i].getDay() + customer[i].getTime() + "에 방문 예정입니다.");
		System.out.println();
	}
	
	public void endMsg() {
		System.out.println("세탁 서비스 프로그램이 종료되었습니다.");
		System.out.println("이용해 주셔서 감사합니다.");
	}
	
	public void exceptionMsg() {
		System.out.println("1 ~ 5 사이의 번호를 입력하세요.");
	}
	
}
