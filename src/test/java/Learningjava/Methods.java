package Learningjava;

import java.util.Scanner;

public class Methods {

	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a=ob.nextInt();
		int b=ob.nextInt();
		// TODO Auto-generated method stub
		Methods me=new Methods();
		//login();           //static methods can call static methods without object
		//me.logout();       //static methods can't call non static methods without object
		//login();           
		//me.logout();
		int c=me.addnumber(a,b);
		System.out.println(c);
		

	}
	public int addnumber(int x, int y)
	{
		int z=x+y;
		return z;
	}
	public static void login()
	{
		System.out.println("Login successful");
	}
	public void logout()
	{
		System.out.println("Logout successful");
		login();
	}
	

}
