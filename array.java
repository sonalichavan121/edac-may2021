import java.util.Scanner;
class array
{
   public static void main(String []args)
    {
	    Scanner sc=new Scanner(System.in);
        int a[]=new int [5];
        System.out.println("enter  size of array elements");
        int size=sc.nextInt();
	    for( int i=0;i<5;i++)
	      {
		       System.out.print("enter array element :");
	           a[i]=sc.nextInt();
	           }
	           for(int i=0;i<5;i++)
	           {
	            System.out.println(" value at array index "+i+" is :"+a[i]);
		  }  
	}
}






