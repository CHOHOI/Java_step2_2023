package Chapter10;

import java.util.Scanner;

public class CalculatorExamMain {

	public static void main(String[] args) {
		/*
		 //��� 1
		Scanner scan= new Scanner(System.in);
		CalculatorExam[] Calculators= {new CalPlus(), new CalMinus()};
		System.out.println("���� a�� �Է��ϼ��� : ");
		int a = scan.nextInt();
		System.out.println("���� b�� �Է��ϼ��� : ");
		int b= scan.nextInt();
		//getClass().getSimpleName() :Ŭ������ ��������
		for(CalculatorExam ce : Calculators) {
			System.out.println(ce.getClass().getSimpleName() + " : " +ce.getResult(a, b));
		}
		*/
	
	
		//���2
		
		//CalculatorExam a=new CalPlus();
		Scanner scan= new Scanner(System.in);
		System.out.println("���� a�� �Է��ϼ��� : ");
		int a = scan.nextInt();
		System.out.println("���� b�� �Է��ϼ��� : ");
		int b= scan.nextInt();
		
		
		int plus = calc(new CalcPlus(), a ,b);
		System.out.println("�� ���� �� :" + plus);
		int minus = calc(new CalcMinus(), a ,b);
		System.out.println("�� ���� �� :" + minus);
		/*
		//���3
		System.out.println("�� ���� �� : " + calc(new CalcPlus(),a,b));
		System.out.println("�� ���� �� : " + calc(new CalcMinus(),a,b));
		*/
	}	
	public static int calc(CalculatorExam c1, int a, int b) {
		return c1.getResult(a, b);
	}

}
