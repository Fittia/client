import java.io.*;

import java.net.*;



public class server {


	public static void main(String[] args) throws IOException {

	 	
		ServerSocket fittia= new ServerSocket(2530);
	 	
		Socket syahirah = fittia.accept();
	 	
		System.out.println ("ni hao");
	 	
	 	
		InputStreamReader gt=new InputStreamReader(syahirah.getInputStream());
	 	
		BufferedReader ot =  new BufferedReader (gt);

	 	 
		PrintWriter rp = new PrintWriter(syahirah.getOutputStream());
	 	 
		rp.printIn("ni hao ma");
	 	 
		rp.flush();

	 	 
		String recvr = ot.readLine();
	 	 
		System.out.println (recvr);
	}
}
