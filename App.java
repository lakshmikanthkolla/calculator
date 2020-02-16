import java.io.*;
import java.util.Scanner;
class App
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n1,n2,o;
System.out.println("Enter number 1");
n1=s.nextInt();
System.out.println("Enter number 2");
n2=s.nextInt();
System.out.println("1.Add 2.Sub 3.Mul 4.Division");
System.out.println("Enter operation");
o=s.nextInt();
if(o==1)
System.out.println(n1+n2);
else if(o==2)
System.out.println(n1-n2);
else if(o==3)
System.out.println(n1*n2);
else if(o==4)
System.out.println(n1/n2);
else
System.out.println("Invalid operation");
}
}