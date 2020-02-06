import java.io.*;
import java.net.*;
public class Pingdemo {
	public static void main(String[] args) 
	{
		BufferedReader in;
		try
		{
			Runtime r=Runtime.getRuntime();
			Process p=r.exec("Ping www.gmail.com");
			if(p==null)
				System.out.println("Could not connect");
			in=new BufferedReader(new InputStreamReader(p.getInputStream()));
			String line;
			while((line=in.readLine())!=null)
			{
				if(line.startsWith("reply"))
					System.out.println("This is reply");
				else if(line.startsWith("request"))
					System.out.println("there is no reply");
				else if(line.startsWith("destinator"))
					System.out.println("destinator host unreachable");
				else
					System.out.println(line);
			}System.out.println(in.readLine());
			in.close();
		}
		catch(IOException e)
		{
			System.out.println(e.toString());
		}
	}

}