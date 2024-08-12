package Learningjava;

public class breakcontinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
         for(i=1;i<=10;i++)
         {
        	 if(i==7)
        		 continue;
        	 System.out.println(i);
         }
         System.out.println("Final value "+i);
	}

}
