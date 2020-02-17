import java.util.*;
public class uncheckedException {

	public static void main(String[] args) {
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("enter number");
		try
		{
			n=Integer.parseInt(s.nextLine());
		}
		catch(NumberFormatException ex)
		{
			System.out.println("error occured.."+ex);
		}
		finally {
			System.out.println("error handled");
		}
		
		
		
		System.out.println("completed");
	}
}