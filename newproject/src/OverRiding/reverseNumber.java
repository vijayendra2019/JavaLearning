package OverRiding;

public class reverseNumber {
public long reverse(long num)
{
long temp=0;
while(num!=0)
{
temp=(temp*10)+(num%10);
//temp = num%10;
num=num/10;
}
return temp;
}
public static void main(String args[])
{
long n= 6251;
reverseNumber inp = new reverseNumber();
System.out.println("Given number is"+ n);
System.out.println("Reverse of given number is "+inp.reverse(n));
}
}