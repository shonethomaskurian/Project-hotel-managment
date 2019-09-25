package allbook;
import registration.Registration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import book.Book;
import hotel.Customer;
public class Allbook {
	Registration re=new Registration();
	Book br=new Book();
	public void allbook(int regarr[],int indx,int roomarray[]) throws IOException
	{

		int x,v;
		System.out.println("enter your start date");
		BufferedReader t=new BufferedReader(new InputStreamReader(System.in));
		v=Integer.parseInt(t.readLine());
		System.out.println("enter your end date");
		x=Integer.parseInt(t.readLine());
		System.out.println(" Customer id and room no belong to the date between "+v +" and "+x+" :");
		System.out.println("Customer ID   "+"    Room No.");
		for(int f=0;f<br.q;f++)
		{
			if(Book.date[f]>=v&&Book.date[f]<=x)
			{
				
				System.out.println(regarr[f]+"           "+roomarray[f]);
			}
			else
				System.out.println("No Booking");
		}
		//int regid=0;
		//String names[]=new String[100]; 
			//names[re.regid-1]=Registration.name;
			
		}
	}


