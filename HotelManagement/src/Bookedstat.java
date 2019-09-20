import java.io.BufferedReader;
import java.util.*;
import java.io.IOException;
import java.io.InputStreamReader;
public class Bookedstat {
	String ac;
	String cot;
	String cable;
	String wifi;
	String laundry;
	static int roomnum=0;
	int booked[]=new int [25];
	int c[]=new int[25];
	int a,x=0;;
	
	public void swit() throws IOException
	{
		
		/*for(int k=0;k<25;k++)
		{
			booked[k]=0;
		}
		*/
		Scanner sc=new Scanner(System.in);
	do{System.out.println("Menu"+"\n"+"1:Book"+"\n"+"2:Check Status"+"\n"+"3:Exit");
	BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
	a=Integer.parseInt(b.readLine()); 
	switch(a)
	{
	case 1:{
		System.out.println("Book");
		String ac;
		String cot;
		String cable;
		String wifi;
		String laundry;
		  String r;
		int i,s,d,e,f;
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		do
		{
		System.out.println("you want ac(yes/no)");
		ac=b.readLine();
		System.out.println("you want cot(s/d)");
		cot=b.readLine();
		System.out.println("you want cable(yes/no)");
		cable=b.readLine();
		System.out.println("you want wifi(yes/no)");
		wifi=b.readLine();
		System.out.println("you want laundry(yes/no)");
		laundry=b.readLine();
		if(ac.equals("yes"))
		i=1000;
		else 
			i=750;
		if(cot.equals("s"))
				s=0;
		else
			s=350;
		if(cable.equals("yes"))
			d=50;
		else
			d=0;
		if(wifi.equals("yes"))
			e=200;
		else
			e=0;
		if(laundry.equals("yes"))
			f=100;
		else
			f=0;
		int sum=i+s+d+e+f;
		
		System.out.println("total price="+sum);
		System.out.println("you are enable services");
		if(ac.equals("yes"))
			System.out.println("single coat ac room");
			else 
				System.out.println("non ac room");
			if(cot.equals("s"))
				System.out.println("single cot enable");
			else
				System.out.println("double cot enable");
			if(cable.equals("yes"))
				System.out.println("cable enabled");
			else
				System.out.println("cable not enabled");
			if(wifi.equals("yes"))
				System.out.println("wifi enabled");
			else
				System.out.println("wifi not enabled");
			if(laundry.equals("yes"))
				System.out.println("laundry available");
			else
				System.out.println("laundary not available");
		System.out.println("Is it fine for you(yes/no)");
		r=b.readLine();
		while(r.equals("no"));
		if(r.equals("yes"))
			System.out.println("Thank you for booking.....your room no is = "+ ++roomnum);
		booked[roomnum]=1;
		//System.out.println(roomno+" ,"+booked[roomno]+" in array first");
		break;
		}while(true);
		
	}break;
		
	
		
	
		
	
		
		
	case 2:{
		System.out.println("Check status");
		//System.out.println(roomnum+" ,"+booked[roomnum]+" in array");
		checkStatus();
	
		break;
	}
	case 3:
		System.exit(0);
	
	}
	}while(true);
	
}

	
/////////////////////////////////////////////////////////////////////////

	void checkStatus() throws  IOException {
		// TODO Auto-generated method stub

		int v;
		System.out.println("Enter the room no");
		//BufferedReader rt=new BufferedReader(new InputStreamReader(System.in));
		Scanner sc=new Scanner(System.in);
		v=sc.nextInt();
		
		if(booked[v]==1)
		{
			
				System.out.println("roomno "+v+" booked");
		}
			else
			{
				System.out.println("roomsno "+v+" not booked");
			}

	}
	

}
	
