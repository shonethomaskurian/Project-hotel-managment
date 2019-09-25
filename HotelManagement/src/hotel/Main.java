package hotel;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import allbook.Allbook;
import book.Book;
import checkstatus.Check;
import emailupdation.Email;
import registration.Registration;
import allcustomers.Allcustom;

public class Main {

		String name;
		String address;
		String contactNumber;
		String email;
		String proofType;
		String proofID;
		static String i;
		static String h;
		static String[] arr1= new String[20];
		static int x=0;
		static int regid=0;
		static int roomno=1;
		static String t;
		static String w1;
		//static int regarr[]=new int[25];
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String name;
		String address;
		String contactNumber;
		String email;
		String proofType;
		String proofID;
		//Booking bk=new Booking();
		int choice = 0;
		Object w;
		Registration r=new Registration();
		Book bv=new Book();
		do
		{
		System.out.println("enter your choice:\n1:Registration\n2:book\n3:Check Status\n4:Email Updation\n5:All bookings\n6:All Customers\n7:Quit");
		Scanner s=new Scanner(System.in);
		choice=s.nextInt();
		switch(choice)
		{
		case 1:
		{
			
			
			r.reg();
			System.out.println("do you want to continue(yes/no)");
			BufferedReader t=new BufferedReader(new InputStreamReader(System.in));
		  w1=t.readLine();
		  
			break;		
		}
		case 2:
		{
			
			
			
			bv.book();
			break;
		}
		case 3:
		{
			Check cv=new Check();
			cv.che();	
			break;
			}
		case 4:
		{
			Email n=new Email();
			n.mail();
			break;
		}
		case 5:
		{
			Allbook al=new Allbook();
			//int indx = 0;
			
			al.allbook(r.regarr,r.indx,bv.roomarray);
			break;
		}
		case 6:
		{
			Allcustom ac=new Allcustom();
			ac.custom();
			break;
		}
		case 7:
		{
			System.exit(0);
		}

}
}while(w1.equals("yes"));
	}
}