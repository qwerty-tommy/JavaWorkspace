package classAPI;

public class Pr24_sysEnv {		//실행 결과 오류..?

	public static void main(String[] args) {
		String javaHome=System.getenv("JAVA_HOME");
		System.out.println("[JAVA_HOME]  "+javaHome);
	}

}
