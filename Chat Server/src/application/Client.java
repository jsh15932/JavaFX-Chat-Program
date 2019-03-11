package application;

import java.net.Socket;

public class Client {

	Socket socket;
	
	public Client(Socket socket) {
		this.socket = socket;
		receive();
	}
	
	public void receive() {
		
	}
	
	public void send(String message) {
		
	}
}
