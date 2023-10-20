package exceptionHandling;

import java.io.File;

public class Pr17_tryCatchInMethod {	//run->run configuration->arguments���� args��? ���� �� ����

	public static void main(String[] args) {
		File f = createFile(args[0]);
		System.out.println(f.getName() + "������ ���������� �����Ǿ����ϴ�.");
	}

	static File createFile(String fileName) {
		try {
			if (fileName == null || fileName.equals("")) {
				throw new Exception("�����̸��� ��ȿ���� �ʽ��ϴ�.");
			}
		} catch (Exception e) {
			// TODO: handle exception
			fileName = "�������.txt";
		} finally {
			File f = new File(fileName);
			createNewFile(f);
			return f;
		}
	}

	static void createNewFile(File f) {
		try {
			f.createNewFile();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
