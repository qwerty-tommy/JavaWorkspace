package week08;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import mgr.Factory;
import mgr.Manager;

public class Department {
	Scanner scan = new Scanner(System.in);
	// static ArrayList<Student> studentList = new ArrayList<>();
	// static ArrayList<Lecture> lectureList = new ArrayList<>();
	static Manager<Student> studentMgr = new Manager<Student>();
	static Manager<Lecture> lectureMgr = new Manager<Lecture>();

	void run() {
//		ArrayList<String> strList=new ArrayList<>();
//		String kwd;
//		
//		System.out.println("단어 여러개 입력");
//		while(true) {
//			kwd=scan.next();
//			if(kwd.contentEquals("end"))
//				break;
//			strList.add(kwd);
//		}
//		System.out.println(strList);
//		Collections.sort(strList);
//		System.out.println(strList);
//		
//		scan.next();

		lectureMgr.readAll("lecture.txt", new Factory<Lecture>() {
			public Lecture create() {
				return new Lecture();
			}
		});
		lectureMgr.printAll();
		System.out.println("==정렬된 강의 리스트==");
		// Collections.sort(lectureMgr.mList);
		Collections.sort(lectureMgr.mList, new Comparator<Lecture>() {
			@Override
			public int compare(Lecture o1, Lecture o2) {
				return o1.name.compareTo(o2.name);
			}

		});
		lectureMgr.printAll();
		studentMgr.readAll("student.txt", new StudentFac());
		studentMgr.printAll();
		searchMenu();
	}

	class StudentFac implements Factory<Student> {
		public Student create() {
			return new Student();
		}
	}

	void searchMenu() {
	}

	public static void main(String args[]) {
		Department my = new Department();
		my.run();
	}
}