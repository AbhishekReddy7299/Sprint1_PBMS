import java.util.*;
public class exampleFactorial {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int res=1;
		try
		{
			while(num!=0)
			if(num>0)
			{
				res=res*num;
				num--;
			}
		
			else
				throw new Exception("Not Valid number");
		}
			catch (Exception Ex)
			{
				if(num<0) {
					
					System.out.println("please check number.."+Ex);
				}
			}
		finally {
			System.out.println("done..execution");
		}
		
		System.out.println(res);
	}

}
