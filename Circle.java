class Circle
{
 void area()
{
int r=10;
 double pi=3.142;

double result=pi*r*r;
System.out.println(result);
return;
}
public static void main(String[]args)
{
System.out.println("main start");
new Circle().area();
System.out.println("main ends");
}
}
