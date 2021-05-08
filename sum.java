/* 2. Write a Java program to print the sum of two numbers.
Test Data: 74 + 36 */


class sum
{
public static void main(String args[])
{
String s1 =args[0];
String s2 =args[1];

int i= Integer.parseInt(s1);
int j= Integer.parseInt(s2);
int k= i+j;

System.out.println("first argument:"+i);
System.out.println("second argument:"+j);
System.out.println("third argument:"+k);
}
}