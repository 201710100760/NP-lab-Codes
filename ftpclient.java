import java.io.*;
import java.net.*;
public class ftpclient {
	public static void main(String a[]) throws IOException
	{
	    Socket s=new Socket(InetAddress.getLocalHost(),5555);
	    DataInputStream s1=new DataInputStream(s.getInputStream());
	    DataInputStream inp=new DataInputStream(System.in);
	    DataOutputStream so=new DataOutputStream(s.getOutputStream());
	    System.out.println("/n enter file path");
	    String str =inp.readLine();
	    so.writeBytes(str);
	    so.writeBytes("/n");
	    FileOutputStream fos=new FileOutputStream("output.txt");
	    int str1;
	    while((str1=s1.read())!=-1)
	    	fos.write((char)str1);
	    System.out.println("/n file success");
	    s1.close();
	    so.close();
	}
}
