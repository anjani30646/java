import java.util.*;

class array_max
{
  public static void main(String args[])
    {
       	int max=-99;
       	int a[][] = new int[3][3];
	    int k=0; 
   	    for(int i=0;i<3;i++) 
    	    {
     		for(int j=0;j<3;j++)
		    {
			String x=args[k++];
       			a[i][j]=Integer.parseInt(x);
        		if(max<a[i][j])
			    {
         	        	max=a[i][j];
                	    }
                     }
             } 
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.print("\n");
        }
        System.out.println("The biggest number in the given array is "+max);
    }
}