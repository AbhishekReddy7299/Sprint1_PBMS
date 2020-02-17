import java.util.*;
public class EmployeeManagement {
	public static void main(String[]args) {
		Scanner in=new Scanner(System.in);
		int id;
		String nam;
		long salary;
		Employee []arr=new Employee[3];
		try {
		for(int i=0;i<3;i++) {
			System.out.println("enter details");
			id=in.nextInt();
			nam=in.next()+in.nextLine();
			
			if(nam.length()<3)
			{
				throw new Exception("please check the name");
			}
			salary=in.nextLong();
			if(salary<10000)
			{
				throw new Exception("enter valid amount");
			}
		Employee name=new Employee(id,nam,salary);
//		Employee name2=new Employee(102,"abhishek",34000);
//		Employee name3=new Employee(103,"abhiReddy",43000);
		//Employee []arr=new Employee[3];
//		arr[0]=name1;
//		arr[1]=name2;
		arr[i]=name;
		}
		}
		catch(Exception ex)
		{
			System.out.println("error in details"+ex);
		}
		
		for(Employee e:arr) {

			System.out.println(e);
		}
		
	}
	
}
