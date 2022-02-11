
import java.util.Scanner;


public class elseif {
public static void main(String[] args){

System.out.println("fine for fees delay\n" +
"1-10 days - 100rs\n" +
"11-20 days - 200rs\n" +
"21-31 days - 300rs\n" +
"more than 31 days -500rs");

System.out.println("enter the days of delay");
Scanner in=new Scanner(System.in);
int days=in.nextInt();
if(1<=days && days<=10)
{
System.out.println("fine amount : RS-100");
}
else if(11<=days && days<=20)
{
System.out.println("fine amount : RS-200");
}
else if(21<=days && days<=31)
{
System.out.println("fine amount : RS-300");
}
else 
{
System.out.println("fine amount : RS-500");
}

}    

}
