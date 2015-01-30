import java.io.IOException;


public class DriverServer {
	public static void main(String[] args) throws IOException
	{
		UDPServer server = new UDPServer(args[0], Integer.parseInt(args[1]));
		server.receiveFile();
	}
}
