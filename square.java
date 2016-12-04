import java.util.*;
import java.math.*;
class square
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a1,b1,a2,b2,a3,b3,a4,b4;
double d1,d2,d3,d4;
a1=sc.nextInt();
b1=sc.nextInt();
a2=sc.nextInt();
b2=sc.nextInt();
a3=sc.nextInt();
b3=sc.nextInt();
a4=sc.nextInt();
b4=sc.nextInt();
d1=finddistance(a1,b1,a2,b2);
d2=finddistance(a2,b2,a3,b3);
d3=finddistance(a3,b3,a4,b4);
d4=finddistance(a4,b4,a1,b1);
if((d1==d2)&&(d2==d3)&&(d3==d4)&&(d4==d1))
{
System.out.println("Square");
}
else
{
System.out.println("Not square");
}
}
static double finddistance(int a1,int b1,int a2,int b2)
{
double d;
d=Math.pow((a1-a2),2)+Math.pow((b1-b2),2);
return d;
}
}
