package classAPI;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class Pr23_sysProperty2 {

	public static void main(String[] args) {
		String osname = System.getProperty("os.name");
		String username = System.getProperty("user.name");
		String userHome = System.getProperty("user.home");

		System.out.println("운영체제 이름: " + osname);
		System.out.println("사용자 이름: " + username);
		System.out.println("사용자 홈디렉토리" + userHome);

		System.out.println("--------------------------------------");
		System.out.println(" [key] value");
		System.out.println("--------------------------------------");

		Properties props = System.getProperties();
		Set keys = props.keySet();

		for (Object objKey : keys) {
			String key = (String) objKey;
			String value = System.getProperty(key);
			System.out.println("[ " + key + " ]  " + value);
		}

	}

}
