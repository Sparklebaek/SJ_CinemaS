package com.sparklebaek.cinema;

import java.util.Arrays;
import java.util.Scanner;

public class CinemaS {

	public static void main(String[] args) {
		/**
		 * stringbuilder ==> stringbuffer��
		 */
		MovieName movie = MovieName.��Ʈ��;
		System.out.println("SJ �ó׸��� ���Ű��� ȯ���մϴ�");
		MovieName movieNames[] = MovieName.values();
		
		/**
		 * ���߿� Enum to List ����Ͽ� ����ϰ� ����
		 */
		String menu = String.join("/", 
				MovieName.�׸�����.toString(),
				MovieName.��Ʈ��.toString(),
				MovieName.���۸�.toString(),
				MovieName.����Ƹ�.toString() );
		
		System.out.println(menu);
		System.out.println("��û�� ��ȭ �Է�: ");
		Scanner scanner = new Scanner(System.in);
		int ��ȭ�̸� = scanner.nextInt();
		System.out.println("��ȭ " + ��ȭ�̸� + "�� �����ϼ̽��ϴ�.");
		scanner.close();
		
		String[] menus = menu.split("/");
		return ;
	}

}
