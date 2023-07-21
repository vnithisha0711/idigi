import java.lang.*;
import java.util.*;
class NetSalary{
public static void main(String args[]){
Scanner sc=new scanner(System.in);
System.out.println("enter employee code");
int empid=sc.next();
System.out.println("enter salary");
int NetSalary=sc.next();
System.out.println("enter dept code");
int deptcode=sc.next(System.in);
double allowance=0;

if(salary>50000){
 if(deptcode==2){
allowance=0.02*salary;
}

else if(deptcode==4){
allowance=0.04*salary;
}
}
else{
netsalary=salary+allowance;
System.out.println("salary=NetSalary");
}
}
}