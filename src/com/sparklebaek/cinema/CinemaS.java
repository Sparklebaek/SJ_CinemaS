package com.sparklebaek.cinema;

import java.util.Arrays;

public class CinemaS {

	public static void main(String[] args) {
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
		String[] menus = menu.split("/");
		return ;
	}

}
