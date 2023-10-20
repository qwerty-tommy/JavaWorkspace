package week02;

public class Main {
	void run() {
		Department department=new Department();
		department.readAll();
		department.printAll();
		department.search();
	}

	public static void main(String args[]) {
		Main main=new Main();
		main.run();
	}
}
