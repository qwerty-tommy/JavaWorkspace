package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;



public class Server {
	private BufferedReader reader;
	private ServerSocket server=null;
	private Socket socket;
	
	public void start() {
		try {
			server=new ServerSocket(12345);
			System.out.println("서버가 활성화되었습니다.");
			while(true) {
				socket=server.accept();
				reader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
