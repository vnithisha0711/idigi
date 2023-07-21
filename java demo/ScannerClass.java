import java.lang.*;
import java.util.*;
class ScannerClass{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter product code:");
int pcode=sc.nextInt();
System.out.println("enter product name:");
String pname=sc.next();
System.out.println("enter quantities sold:");
int qty=sc.nextInt();
System.out.println("enter product price:");
double price=sc.nextDouble();
double bill_amt=qty*price;
System.out.println("\nCode:"+pcode+"\nName:"+pname+"\nquantity:"+qty+"\nprice:"+price+"\nbill amount:"+bill_amt);
}
} 