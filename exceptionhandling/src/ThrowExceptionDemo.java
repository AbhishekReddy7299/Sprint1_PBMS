import java.io.FileReader;
import java.util.*;
public class ThrowExceptionDemo {
	public static void main(String[] args) {
		try {
				readName();
				openFile("ThrowExceptionDemo.java");
			}
			catch(Exception Ex) {
				System.out.println("Error:file not found "+Ex.getMessage());
			}
	}
public static void openFile(String fileName)throws Exception{
	FileReader in=new FileReader(fileName);
}
public static void readName()throws Exception{
	 Scanner in=new Scanner(System.in);
	 String name=in.nextLine();
	if(name.length()<4) {
		throw new Exception("Not Valid Name");
	}

}
}
