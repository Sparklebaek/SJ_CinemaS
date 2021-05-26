package com.sparklebaek.cinema;

import java.util.Arrays;
import java.util.Scanner;

public class CinemaS {

	public static void main(String[] args) {
		/**
		 * stringbuilder ==> stringbuffer로
		 */
		MovieName movie = MovieName.배트맨;
		System.out.println("SJ 시네마에 오신것을 환영합니다");
		MovieName movieNames[] = MovieName.values();
		
		/**
		 * 나중에 Enum to List 사용하여 깔금하게 정리
		 */
		String menu = String.join("/", 
				MovieName.그린랜턴.toString(),
				MovieName.배트맨.toString(),
				MovieName.슈퍼맨.toString(),
				MovieName.아쿠아맨.toString() );
		
		System.out.println(menu);
		System.out.println("시청할 영화 입력: ");
		Scanner scanner = new Scanner(System.in);
		int 영화이름 = scanner.nextInt();
		System.out.println("영화 " + 영화이름 + "를 선택하셨습니다.");
		scanner.close();
		
		String[] menus = menu.split("/");
		return ;
	}

}
