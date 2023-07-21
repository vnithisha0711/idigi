import java.lang.*;
class DemoProg1{
public static void main(String args[]){
int num=123,digit,sum;
sum=0;
while(num>0){
digit=num%10;
sum=sum+digit;
num=num/10;
}
System.out.println("sum of digits:"+sum);
}
}
