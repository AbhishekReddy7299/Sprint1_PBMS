import java.io.*;
public class checkedException {
	public static void main(String[] args)throws Exception{
		try {
		FileReader in=new FileReader("checkedException.java");
		int c;
		while((c=in.read())!=-1) {
			System.out.println((char)c);
		}
		}
		catch(Exception Ex) {
			System.out.println("Error: "+Ex);
		}
		finally {
			System.out.println("error handled");
		}
		System.out.println("execution done.");
	}
}

