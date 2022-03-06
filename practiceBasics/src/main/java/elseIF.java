import java.util.Scanner;
public class elseIF {
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
System.out.println("ENTER YOUR AGE : ");
int n=in.nextInt();
if(n>=10 && n<=17)
{
System.out.println("U R KID.");
}
else if(n>=18 && n<=30)
{
System.out.println("U R ADULT MEN.");
}
else if(n>=31 && n<=59)
{
System.out.println("U R FAMILY MEN.");
}
else if(n>=60)
{
System.out.println("U R SENIOR CITIZEN.");
}

}
    
}


