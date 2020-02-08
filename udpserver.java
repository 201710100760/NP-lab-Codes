package abc;


import java.net.*;
import java.io.*;
public class datagramserver {

	public static DatagramSocket ds;				
	public static int clientport=1782, serverport=1786;			

	public static void main(String args[]) throws Exception
	{
		byte buffer[]=new byte[1024];
	
		ds=new DatagramSocket(serverport);			
		BufferedReader breader=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Server is waiting for input");
		System.out.println();
		while(true)
		{	String str=breader.readLine();
			if(str==null || str.equals("End"))
				break;
			buffer=str.getBytes();
			ds.send(new DatagramPacket(buffer, str.length(), InetAddress.getLocalHost(),clientport));	
		}
	}
}
