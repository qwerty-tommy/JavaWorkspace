package classAPI;

import java.util.HashMap;

class Student {
	private int student_id;
	private String name;
	private String major;

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public boolean equals(Object o) {
		Student s = (Student) o;
		if (student_id == s.getStudent_id() && name.equals(s.getName()) && major.equals(s.getMajor())) {
			return true;
		} else {
			return false;
		}
	}

//	@Override
//	public int hashCode() {
//		String s = " " + student_id + name + major;
//		return s.hashCode();
//	}

}

public class Pr04_hashcode2 {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setStudent_id(20100823);
		s1.setName("ȫ�浿");
		s1.setMajor("����Ʈ����");

		Student s2 = new Student();
		s2.setStudent_id(20100823);
		s2.setName("ȫ�浿");
		s2.setMajor("����Ʈ����");

		if (s1.equals(s2)) {
			System.out.println("�� ��ü�� �����ϴ�.");
		} else {
			System.out.println("�� ��ü�� �ٸ��ϴ�.");
		}

		HashMap<Student, String> advisors = new HashMap<Student, String>();
		advisors.put(s1, "���");
		System.out.println(advisors.get(s2));	//��������..?

	}

}
