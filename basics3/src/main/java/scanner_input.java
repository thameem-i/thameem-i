
import java.util.Scanner;


public class scanner_input {
public static void main(String args[]){
Scanner input=new Scanner(System.in);
// - a2+b2+2ab -
int a=input.nextInt();
int b=input.nextInt();
int c=(a*a)+(b*b)+(2*a*b);
System.out.print(c);
}
    
}
