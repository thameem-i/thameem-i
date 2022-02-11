
import java.util.Scanner;


public class switchh {
public static void main(String[]args){
System.out.println("1.addition\n"+"2.subraction\n"+"3.multiplication\n"+"4.division\n");
Scanner in=new Scanner(System.in);
int n=in.nextInt();
System.out.println("ENTER 2 NOS");
int a=in.nextInt();
int b=in.nextInt();
switch(n)
{
case 1:
System.out.println("1.addition");
System.out.println(a+b);
break;
case 2:
System.out.println("2.subraction");
System.out.println(a-b);
break;
case 3:
System.out.println("3.multiplictaion");
System.out.println(a*b);
break;
case 4:
System.out.println("4.division");
System.out.println(a/b);
break;
default:
System.out.println("ERROR 007");
break;

}
}
    
}
