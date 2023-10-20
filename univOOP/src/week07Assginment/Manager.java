package week07Assginment;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Manager {

	private ArrayList<Calory> calories = new ArrayList<>();

	public static Scanner openFile(String filename) {
		Scanner filein = null;
		try {
			filein = new Scanner(new File(filename));
		} catch (IOException e) {
			System.out.println("파일 입력 오류" + e.getMessage());
			System.exit(0);
		}
		return filein;
	}

	public void readAll(Scanner filein, Factory factory) {	//프로그램 구조상 파일 이름이 아닌 파일 스트림으로 처리하는게 용이
		Calory m = null;
		while (filein.hasNext()) {
			m = factory.create();
			m.read(filein);
			calories.add(m);
		}
		// filein.close();	//다음 데이터를 읽기 위해 close를 하지 않음
	}

	void printAll() {
		for (Calory m : calories) {
			System.out.println(m);
		}
	}

	public ArrayList<Calory> getCalories() {
		return calories;
	}
}
