 /*3. Write a Java program to divide two numbers and print on the screen.
Test Data : 50/3
Expected Output : 16 */


class  divide
{
public static void main(String args[])
{
String s1=args[0];
String s2=args[1];

int i =Integer.parseInt (s1);
int j =Integer.parseInt (s2); 
int k =i/j;

System.out.println("first argument :" +i);
System.out.println("second argument:" +j);
System.out.println("third argument:" +k);

}

}