import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {	
	String name;
	String address;
	String contactNumber;
	String email;
	String proofType;
	String proofID;
	static String i;
	
	Main(String name,String address,String contactNumber,String email,String proofType,String proofID)
		{
		
		this.name=name;
		this.address=address;
		this.contactNumber=contactNumber;
		this.email=email;
		this.proofType=proofType;
		this.proofID=proofID;

	   }
	public static void main(String[] args) throws IOException {
		//Bookedstat cv=new Bookedstat();
		String name;
		String address;
		String contactNumber;
		String email;
		String proofType;
		String proofID;
		//Booking bk=new Booking();
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		do {
		System.out.println("enter your name:");
		name=b.readLine();
		System.out.println("enter your address:");
		address=b.readLine();
		System.out.println("enter your contactNumber:");
		contactNumber=b.readLine();
		System.out.println("enter your email:");
		email=b.readLine();
		System.out.println("enter your proofType:");
		proofType=b.readLine();
		System.out.println("enter your proofID:");
		proofID=b.readLine();
		
		Customer Main1=new Customer(name,address,contactNumber,email,proofType,proofID);
		Main1.reg();
		System.out.println("Do you want to register again (yes/No): ");
		i=b.readLine();
		}while(i.equals("yes"));
		if(i.contentEquals("no"))
		{
		Bookedstat cv=new Bookedstat();
		cv.swit();
		}
	}
	

}