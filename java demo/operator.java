import java.lang.*;
import java.util.*;
class opertaor{
public static void main(String args[]){
char operator;
Scanner sc=new scanner(System.in);
operator=sc.next();
System.out.println("Choose an operator:+,-,*,/");
operator=sc.nextInt();
System.out.println("enter first number");
num1=sc.nextInt();
System.out.println("enter second number");
num2=sc.nextInt();

switch(operator){

case '+':result=num1+num2;
System.out.println("sum");
break;
case '-':result=num1-num2;
System.out.println("subtract");
break;
case '*':result=num1*num2;
System.out.println("mutliply");
break;
case '/':result=num1/num2;
System.out.println("divide");
break;
default:
System.out.println("invalid");
break;
}
}
}