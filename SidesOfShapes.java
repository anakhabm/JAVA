import java.util.Scanner;

abstract class Shape
{
abstract void noOfSides();
}

class Triangle extends Shape
{
void noOfSides()
{
System.out.println("Sides = 3");
}
}

class Rectangle extends Shape
{
void noOfSides()
{
System.out.println("Sides = 4");
}
}

class Hexagon extends Shape
{
void noOfSides()
{
System.out.println("Sides = 6");
}
}

class Demo
{
public static void main(String args[])
{
Triangle t = new Triangle();
Rectangle r = new Rectangle();
Hexagon h = new Hexagon();
Scanner sc = new Scanner(System.in);

System.out.println("Shapes:\n1.Triangle\n2.Rectangle\n3.Hexagon\nEnter Choice:");
int ch = sc.nextInt();

switch(ch) {
case 1:t.noOfSides();
break;
case 2:r.noOfSides();
break;
case 3:h.noOfSides();
break;
default:System.out.println("Incorrect choice!");
break;
}
}
}
