package classAPI;

import java.io.UnsupportedEncodingException;

public class Pr25_endecoding_actually2 {

	public static void main(String[] args) throws Exception {
		String name="ȫ�浿";
		String encodedName=null;
		try {
			encodedName=new String(name.getBytes("utf-8"),"latin1");
		} catch (UnsupportedEncodingException e) {
			// TODO: handle exception
		}
		System.out.println(encodedName);
		
		String decodedName=null;
		try {
			decodedName=new String(encodedName.getBytes("utf-8"),"latin1");
		} catch (UnsupportedEncodingException e) {
			// TODO: handle exception
		}
		System.out.println(decodedName);
		
	}

}
