import java.util.Scanner;
class rect
{
int length,breadth;
public void CalculateArea(int length,int breadth)
{
int area;
area=length*breadth;
System.out.println("Area of Rectangle is :" + area);
}
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int l=s.nextInt();
int b=s.nextInt();
rect r=new rect();
r.CalculateArea(l,b);
}
}


