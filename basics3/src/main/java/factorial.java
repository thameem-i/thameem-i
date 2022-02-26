import java.util.Scanner;
public class factorial {
public static void main(String args[]){

Scanner in=new Scanner(System.in);
int x=in.nextInt();
int f=1;
for(int i=1;i<=x;i++)//120*6
{
f=f*i;
}
System.out.print("FACTORIAL OF "+ x + " IS "+ f);

}
    
}
