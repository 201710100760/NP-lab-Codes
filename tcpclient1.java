package abc;
import java.io.*;
import java.net.*;
public class tcpclient1 {
	public static void main(String args[])throws IOException
	{
		Socket s =new Socket("localhost",62);
		DataInputStream in=new DataInputStream(s.getInputStream());
		DataOutputStream out=new DataOutputStream(s.getOutputStream());
		DataInputStream sysin=new DataInputStream(System.in);
		String str=in.readLine();
		System.out.println("the string from tcp server"+str);
		System.out.println("enter reply msg");
		String line=sysin.readLine();
		out.writeBytes(line);
		s.close();
	}
}
