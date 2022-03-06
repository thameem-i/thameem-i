import java.util.Scanner;
public class nestEDif {

public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
System.out.println("QUALIFICATION FOR APPLYING SCHOLARSHIP");
System.out.println("1.AGE MUST BE 18 OR ABOVE.");
System.out.println("2.SUBMIT ANY ONE OF THE ID PROOF.");
System.out.println("    ");
System.out.println("ENTER YOUR AGE : ");
int n=in.nextInt();
if(n>=18)
{
System.out.println("DO U HAVE ANY ONE PROOF : ");
System.out.println("PRESS (YES or NO) ");
String s=in.next();
if(s.equals("YES") || s.equals("Yes") || s.equals("Yes"))
{
System.out.println("U R ELIGIBLE TO APPLY.");
System.out.println("VISIT OUR OFFICE ROOM ON WEEKDAYS.");
}
else
{
System.out.println("U R NOT ELIGIBLE TO APPLY.");
}
}
else
{
System.out.println("U R NOT ELIGIBLE TO APPLY.");
}
}

}
    

