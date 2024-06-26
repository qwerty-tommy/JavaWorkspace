package exceptionHandling;

import java.io.File;

public class Pr17_tryCatchInMethod {	//run->run configuration->arguments에서 args값? 넣을 수 있음

	public static void main(String[] args) {
		File f = createFile(args[0]);
		System.out.println(f.getName() + "파일이 성공적으로 생성되었습니다.");
	}

	static File createFile(String fileName) {
		try {
			if (fileName == null || fileName.equals("")) {
				throw new Exception("파일이름이 유효하지 않습니다.");
			}
		} catch (Exception e) {
			// TODO: handle exception
			fileName = "제목없음.txt";
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
