package Learningjava;

public class Multidimensionarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[][] multiarray=new int[2][3];
        int[][] multiarray2= {{2,3,4},{6,7,8}};
        
        for(int i=0;i<multiarray2.length;i++)
        {
        	for(int j=0;j<multiarray2[i].length;j++)
        	{
        		System.out.print(multiarray2[i][j]);
        	}
        	System.out.println();
        }
	}

}
