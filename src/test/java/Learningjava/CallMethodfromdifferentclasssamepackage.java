package Learningjava;

public class CallMethodfromdifferentclasssamepackage {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methods me1=new Methods();
		int c=me1.addnumber(5, 6);                        //Calling method from different class and same package
		System.out.println(c);
		CallMethodfromdifferentclasssamepackage m2=new CallMethodfromdifferentclasssamepackage();
		m2.call();

	}
	public void call()
	{
		Methods me2=new Methods();
		
		me2.login();
	
	}
	public void call2()
	{
		
	}

}
