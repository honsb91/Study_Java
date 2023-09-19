package pack01.exif;

public class Test03_If {
	public static void main(String[] args) {
		
		char booldType= 'A';
		
		if(booldType == 'A') {
			System.out.println("A형 : 조금소심");
		}else if(booldType == 'B') {
			System.out.println("B형 : 조금활발");
		}else if(booldType == 'O') {
			System.out.println("O형 : 조금 깐깐");
		}else {
			System.out.println("AB형 또는 잘못입력");
		}
	}
}
