import java.util.Scanner;
public class loopingg {
public static void main(String[] args)
{
//for loop

for(int i=1;i<=2;i++)
{
Scanner in=new Scanner(System.in);
System.out.println();
System.out.println("1.ADDITION");
System.out.println("2.SUBRACTION");
System.out.println("3.MULTIPLICATION");
System.out.println("4.DIVISION");
System.out.println();
int t=in.nextInt();
System.out.println();
System.out.println("ENTER 2 NOS");
int a=in.nextInt();
int b=in.nextInt();
switch(t)
{
case 1:
System.out.println("RESULT : " + (a+b));
break;

case 2:
System.out.println("RESULT : " + (a-b));
break;

case 3:
System.out.println("RESULT : " + (a*b));
break;

case 4:
System.out.println("RESULT : " + (a/b));
break;

default:
System.out.println("ERRORRRR");
}

}
}
    
}
