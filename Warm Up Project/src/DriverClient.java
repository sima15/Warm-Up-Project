import java.io.IOException;

public class DriverClient 
{
	public static void main(String[] args) throws IOException
	{
		UDPClient client = new UDPClient(args[0], Integer.parseInt(args[1]));
		
		client.SendFile(args[2]);
		
	}
	
	
}
