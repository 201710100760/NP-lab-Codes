import java.io.*;
import java.net.*;
class rarpserver
{
 public static void main(String args[])throws IOException
 {
  ServerSocket ss=new ServerSocket(980);
  Socket s=ss.accept();
  DataInputStream in=new DataInputStream(s.getInputStream());
  DataOutputStream out=new DataOutputStream(s.getOutputStream());
  DataInputStream sysin=new DataInputStream(System.in);
  System.out.println("Enter an mac Address:");
  String str=sysin.readLine();
  out.writeBytes(str+"\n");
  System.out.println("The corresponding IP address"+in.readLine());
  }
}
