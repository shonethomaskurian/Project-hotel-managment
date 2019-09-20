import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Customer {
	String name;
	String address;
	String contactNumber;
	String email;
	String proofType;
	String proofID;
	static int regid=0;
public Customer(String name,String address,String contactNumber,String email,String proofType,String proofID)
{
	this.name=name;
	this.address=address;
	this.contactNumber=contactNumber;
	this.email=email;
	this.proofType=proofType;
	this.proofID=proofID;
	}
	
	public void reg()
	{
		System.out.println("Name="+name);
		System.out.println("Address="+address);
		System.out.println("Contact Number="+contactNumber);
		System.out.println("Email="+email);
		System.out.println("proofType="+proofType);
		System.out.println("proofid="+proofID);
		System.out.println("regid="+ ++regid);
	}
		
		
		
		
		
		
	}
