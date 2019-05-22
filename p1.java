import java.util.*;
public class p1 {
public static void main(String[] args) {
int p,r,s,n,x,count=0,i,j,a;
Scanner in=new Scanner(System.in);
System.out.println("no of integer");
x=in.nextInt();

System.out.println("enter limits for above int");
r=in.nextInt();
s=in.nextInt();
p=r+1;
for(j=p;j<s;j++) {
while(j!=0) {
a=j%10;
j=j/10;
if(a==x) {
count++;
}
}
p++;
j=p;
}
System.out.println(count); 

}
}
