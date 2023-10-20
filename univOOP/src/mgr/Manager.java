package mgr;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Manager<T extends Manageable> {
	public ArrayList<T> mList = new ArrayList<>();

	Scanner openFile(String filename) {
		Scanner filein = null;
		try {
			filein = new Scanner(new File(filename));
		} catch (IOException e) {
			System.out.println("파일 입력 오류");
			System.exit(0);
		}
		return filein;
	}

	public void readAll(String filename, Factory<T> fac) {
		Scanner filein = openFile(filename);
		T st = null;
		while (filein.hasNext()) {
			st = fac.create();
			st.read(filein);
			mList.add(st);
		}
		filein.close();
	}

	public void printAll() {
		// TODO Auto-generated method stub
		for (T m : mList) {
			m.print();
		}
	}

	public void search(Scanner scan) {
		String name = null;
		while (true) {
			System.out.print("키워드:");
			name = scan.next();
			if (name.equals("end"))
				break;
			for (T m : mList) {
				if (m.matches(name))
					m.print();
			}
		}
	}

	public T find(String kwd) {
		// TODO Auto-generated method stub
		for (T m : mList) {
			if (m.matches(kwd))
				return m;
		}
		return null;
	}
}
