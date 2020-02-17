
public class MultiCatchDemo {

	public static void main(String[] args) {
		int res=0;
		int[]a= {5,2,0,4,1,7};
		try {
			
		 res=a[5]/a[1];
		 Integer.parseInt("12");
		}
		catch(ArithmeticException ex)
		{
		System.out.println("not possible dividing by zero");
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("index exceeding limit");
		}
		
		catch(Exception ex)
		{
			System.out.println("Error:"+ex);
		}
		finally
		{
			System.out.println(res);
			System.out.println("done.");
			
		
		}
	}
}	
