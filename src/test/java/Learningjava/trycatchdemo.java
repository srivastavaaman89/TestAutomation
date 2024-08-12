package Learningjava;

public class trycatchdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		int i=10;
		System.out.println("Before divion");
		System.out.println(i/0);
		}
		catch(Throwable t) {
		}
		
		System.out.println("After division");
		

	}
}


