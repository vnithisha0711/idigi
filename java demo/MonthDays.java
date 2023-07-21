import java.lang.*;
import java.util.*;
class MonthDays{
public static void main(String args[]){
int month;
Scanner sc=new Scanner(System.in);
System.out.println("enter month numfrom 1 to 12:");
month=sc.nextInt();
switch(month){
case 1:
case 3:
case 5:
case 7:
case 8:
case 10:
case 12:
System.out.println("\n 31 days in this month");
break;
case 4:
case 6:
case 9:
case 11:
System.out.println("\n 30 days in this month");
break;
case 2:
System.out.println("\n either 28 or 29 days in this month");
break;
default:
System.out.println("\n enter valid num between 1 to 12");
}
}
}