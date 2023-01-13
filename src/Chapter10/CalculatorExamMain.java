package Chapter10;

import java.util.Scanner;

public class CalculatorExamMain {

	public static void main(String[] args) {
		/*
		 //방법 1
		Scanner scan= new Scanner(System.in);
		CalculatorExam[] Calculators= {new CalPlus(), new CalMinus()};
		System.out.println("정수 a를 입력하세요 : ");
		int a = scan.nextInt();
		System.out.println("정수 b를 입력하세요 : ");
		int b= scan.nextInt();
		//getClass().getSimpleName() :클래스명 가져오기
		for(CalculatorExam ce : Calculators) {
			System.out.println(ce.getClass().getSimpleName() + " : " +ce.getResult(a, b));
		}
		*/
	
	
		//방법2
		
		//CalculatorExam a=new CalPlus();
		Scanner scan= new Scanner(System.in);
		System.out.println("정수 a를 입력하세요 : ");
		int a = scan.nextInt();
		System.out.println("정수 b를 입력하세요 : ");
		int b= scan.nextInt();
		
		
		int plus = calc(new CalcPlus(), a ,b);
		System.out.println("두 수의 합 :" + plus);
		int minus = calc(new CalcMinus(), a ,b);
		System.out.println("두 수의 합 :" + minus);
		/*
		//방법3
		System.out.println("두 수의 합 : " + calc(new CalcPlus(),a,b));
		System.out.println("두 수의 차 : " + calc(new CalcMinus(),a,b));
		*/
	}	
	public static int calc(CalculatorExam c1, int a, int b) {
		return c1.getResult(a, b);
	}

}
