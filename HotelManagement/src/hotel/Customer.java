package hotel;
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
	static int regid=1;
	static int x=0;
	

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

	public static int getRegid() {
		return regid;
	}

	public static void setRegid(int regid) {
		Customer.regid = regid;
	}

	public static int getX() {
		return x;
	}

	public static void setX(int x) {
		Customer.x = x;
	}
}



