package emailupdation;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//import hotel.Customer;
import registration.Registration;
public class Email 
{
public  void mail() throws IOException
{
	int c,g;
	String q;
	Registration re=new Registration();
	BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("enter your customer id");
	g=Integer.parseInt(b.readLine());
	c=--g;
	re.getRegid();
	System.out.println("enter your new email");
	q=b.readLine();
	Registration.emailarr[c]=q;
	re.setEmail(q);
	//Registration Ma=new Registration();
	//Ma.reg();
	Registration Main1=new Registration();
	Main1.Id(1);
	System.out.println("email updated");
}
}


