//���ÿͻ���
package function;

import java.net.Socket;

public class Client {
	private String name;
	private Socket socket;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Socket getSocket() {
		return socket;
	}

	public void setSocket(Socket socket) {
		this.socket = socket;
	}
}
