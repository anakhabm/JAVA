class Fact
{
public static void main(String args[])
{
int fact=1,i;
for(i=1;i<=(Integer.parseInt(args[0]));i++)
{
fact=fact*i;
}
System.out.println("Factorial="+fact);
}
}
