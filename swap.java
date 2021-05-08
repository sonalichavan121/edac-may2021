
/*15. Write a Java program to swap two variables.*/

import java.util.Scanner;
class swap
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the value of a and b:");
int a=sc.nextInt();
int b=sc.nextInt();
int temp;
System.out.println("a :"+a);
System.out.println("b :"+b);
temp =a;
a =b;
b =temp;
System.out.println("after swapping");
System.out.println("a :"+a);
System.out.println("b :"+b);

}
}