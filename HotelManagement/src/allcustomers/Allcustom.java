package allcustomers;
import registration.Registration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import book.Book;

public class Allcustom {
	Registration re=new Registration();
	Book br=new Book();
public void custom() throws IOException
{String v,x;
System.out.println("enter your Customer id");
//BufferedReader t=new BufferedReader(new InputStreamReader(System.in));
//v=t.readLine();
//int n;
//int regid=0;
String names[]=new String[100]; 
	names[re.regid-1]=Registration.name;
	System.out.println("Customer id  name");
	for(int z=0;z<re.indx;z++)
	{
	System.out.println(Registration.regarr[z]+"   "+Registration.arr1[z] );
	}
	
}
}
