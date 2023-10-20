package exceptionHandling;

import java.util.Scanner;

public class Ex05_averageArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] list=null;
		int sum = 0, count;

		try {
			System.out.print("������ ���� : ");
			count = sc.nextInt();
			//list = new int[count];

			for (int i = 0; i < count; i++) {
				System.out.print("������ �Է��ϼ��� : ");
				list[i] = sc.nextInt();
			}

			for (int i = 0; i < count; i++) {
				sum += list[i];
			}
			System.out.println("��� : " + sum / count);
			
			sc.close();
		} catch (ArithmeticException e) {
			System.out.println("0���� ������ ����");
		} catch (NegativeArraySizeException e) {
			System.out.println("���� �迭 ����");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭 ���� ����");
		} catch (NullPointerException e) {
			System.out.println("null ���� ����");
		}
			
	}

}
