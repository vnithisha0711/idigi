import java.lang.*;

class DemoProg3{
public static void main(String args[]){
int a,num=123,arm=0;
while (num>0){
a=num%10;
arm=arm+(a*a*a);
num=num/10;
}

System.out.println(arm);


}
}
