
public class typecasting {
public static void main(String[] args)
{
short s=44;
byte b=6;
int i=362787;
float f=7788.87f;
double d=865878.524525;


//widening casting


float ff=s;
int ii=b;

System.out.println(s);
System.out.println(ff);
System.out.println(b);
System.out.println(ii);

//narrowing casting

float g=(float) d;

System.out.println(d);
System.out.println(g);



}
    
}
