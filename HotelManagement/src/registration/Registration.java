package registration;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import hotel.Customer;
public class Registration
{public static String name;
String address;
String contactNumber;
String email;
String proofType;
String proofID;
static String i;
static String h;
public static String[] arr1= new String[20];
static int x=0;
public static int indx=0;
public static int regid=0;
public static String emailarr[]=new String[25];
public static int ind=0;
	public static int regarr[]=new int[25];
	public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getAddress() {
	return address;
}


public void setAddress(String address) {
	this.address = address;
}


public String getContactNumber() {
	return contactNumber;
}


public void setContactNumber(String contactNumber) {
	this.contactNumber = contactNumber;
}


public String getEmail() {
	return email;
}


public void setEmail(String email) {
	this.email = email;
}


public String getProofType() {
	return proofType;
}


public void setProofType(String proofType) {
	this.proofType = proofType;
}


public String getProofID() {
	return proofID;
}


public void setProofID(String proofID) {
	this.proofID = proofID;
}


public static String getI() {
	return i;
}


public static void setI(String i) {
	Registration.i = i;
}


public static String getH() {
	return h;
}


public static void setH(String h) {
	Registration.h = h;
}



public static int getX() {
	return x;
}


public static void setX(int x) {
	Registration.x = x;
}


public static int getRegid() {
	return regid;
}


public static void setRegid(int regid) {
	Registration.regid = regid;
}


	public void reg() throws IOException
	{
	BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("enter your name:");
	 name = b.readLine();
	 arr1[x]=name;
		x++;
	System.out.println("enter your address:");
	 address = b.readLine();
	System.out.println("enter your contactNumber:");
	 contactNumber = b.readLine();
	System.out.println("enter your email:");
	 email = b.readLine();
	 emailarr[ind]=email;
	 ind++;
	System.out.println("enter your proofType:");
	 proofType = b.readLine();
	System.out.println("enter your proofID:");
	 proofID = b.readLine();
	 regarr[indx] = ++regid;
	 indx++;
	System.out.println("Name="+name);
	System.out.println("Address="+address);
	System.out.println("Contact Number="+contactNumber);
	System.out.println("Email="+email);
	System.out.println("proofType="+proofType);
	System.out.println("proofid="+proofID);
	System.out.println("regid="+ regid);
	}
	

	public void Id(int j) {
		int id = 0;
		// TODO Auto-generated method stub
		if(id==1)
			++regid;
	}
}
