package ex05;

import java.util.Scanner;

public class Department implements Factory {
	Scanner scan = new Scanner(System.in);
	Manager studentMgr = new Manager();
	static Manager msgMgr = new Manager();
	Manager lecMgr = new Manager();

	void run() {
		msgMgr.readAll("msg.txt", () -> new Message());
		msgMgr.printAll();
		studentMgr.readAll("student.txt", this);
		studentMgr.printAll();

		addLectures();
		lecMgr.printAll();
		// searchMsgs4Student();
	}

	void searchMsgs4Student() {
		String name = null;
		Student st = null;
		while (true) {
			name = scan.next();
			if (name.equals("end"))
				break;
			st = (Student) studentMgr.find(name);
			for (String code : st.registeredCodes) {
				System.out.println(((Message) msgMgr.find(code)).line);
			}
		}

	}

	void addLectures() {
		Message msg = null;
		for (Manageable m : msgMgr.mList) {
			msg = (Message) m;
			Lecture lecture = (Lecture) lecMgr.find(msg.code);
			if (lecture == null) {
				lecture = new Lecture(msg.code);
				lecMgr.addElement(lecture);
			}
			lecture.addMsg(msg);
		}
	}

	public Manageable create() {
		return new Student();
	}

	public static void main(String args[]) {
		Department my = new Department();
		my.run();
	}
}

class stdFacatory implements Factory {
	public Manageable create() {
		return new Student();
	}
}