
import java.util.Scanner;


public class nestedif {
public static void main(String[] args){

System.out.println("ENTER MARKS OF 3 SUBJECTS :");
Scanner in=new Scanner(System.in);
int m1=in.nextInt();
int m2=in.nextInt();
int m3=in.nextInt();
int total=m1+m2+m3;
float average=total/3;
System.out.println("TOTAL : "+total);
System.out.println("AVERAGE : "+average);

if(m1>=35 && m2>=35 && m3>=35)
{
System.out.println("RESULT : PASS");
if(average>=90 && average<=100)
{
System.out.println("GEADE : A");
}
else if(average>=80 && average<=89)
{
System.out.println("GEADE : B");
}
else if(average>=70 && average<=79)
{
System.out.println("GEADE : C");
}
else if(average>=35 && average<=69)
{
System.out.println("GEADE : D");
}
else
{
System.out.println("ERROR TYPE THE CORRECT MARKS");
}
}
else
{
System.out.println("RESULT : FAIL");
}
}   
}
