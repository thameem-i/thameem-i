
import java.util.Scanner;
public class switch01 {
  public static void main(String args[]){
Scanner in=new Scanner(System.in);
int ch=in.nextInt();
System.out.println("ENTER 2 NOS : ");
int h=in.nextInt();
int c=in.nextInt();
switch(ch){
case 1:
System.out.println("ADD : "+(c+h));
break;

case 2:
System.out.println("MUL : "+(c*h));
break;

default:
System.out.println("ERROR 404-(@#$%^&)==-==--==-");
break;

}
}
}
