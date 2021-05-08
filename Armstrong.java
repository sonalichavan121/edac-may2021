import java.util.*;
class armstrong
{
       public static void main(String []args)
   {
  
   int n =1234;
   int x=n;
  int r,q=0;
  
   while(n>0)
     {  r =n%10;
        n =n/10;
        q =q+(r*r*r*r);
     }
    if (x==q)
     System.out.println("Armstrong no.");
   else
   System.out.println("not Armstrong no.");
}
}






