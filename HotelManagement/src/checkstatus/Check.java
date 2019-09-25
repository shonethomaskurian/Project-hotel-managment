package checkstatus;

import java.util.Scanner;
import hotel.Customer;
import registration.Registration;
import book.Book;
public class Check {
	//static String[] arr1= new String[20];
	static int x=0;
	Book bt=new Book();
	
	public void che() {
		// TODO Auto-generated method stub
		int v=0;
		System.out.println("enter your room no");
		Scanner sc=new Scanner(System.in);
		 v = sc.nextInt();
		
		if(bt.booked[v]==1)
		{
			
				System.out.println("roomno "+v+" booked");
		}
			else
			{
				System.out.println("roomsno "+v+" not booked");
			}
	}
	
	}


