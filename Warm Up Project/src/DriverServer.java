import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


public class DriverServer {
	public static void main(String[] args) throws IOException
	{    
		UDPServer server = new UDPServer(Integer.parseInt(args[0]));
		
		server.receiveFile();
	}
}
