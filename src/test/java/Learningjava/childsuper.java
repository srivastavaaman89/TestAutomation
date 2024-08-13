package Learningjava;

public class childsuper extends parentsuper{
	int eno=44;
	String ename="Sona";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		childsuper c=new childsuper();
		c.getdetails();

	}
	public childsuper()
	{
		super(5);
	}
public void getdetails()
{
	System.out.println(super.ename);
	System.out.println(ename);
	System.out.println(super.eno);
	System.out.println(eno);
	
}
}
