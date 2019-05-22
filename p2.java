import java.util.*;
public class p2 {
public static void main(String[] args) {
int n,i,j,k,l,min,temp;
Scanner in=new Scanner(System.in);
n=in.nextInt();
int arr[]=new int[n];
for(i=0;i<n;i++) {
arr[i]=in.nextInt();
}
for(j=0;j<n;j++) {
for(k=j+1;k<n;k++) {
if(arr[j]>arr[k]) {
temp=arr[j];
arr[j]=arr[k];
arr[k]=temp;
}
}
}
min=arr[1]-arr[0];

for(l=1;l<n - 1;l++) {
if(min>arr[l+1]-arr[l]) {
min=arr[l+1]-arr[l];
}
}
System.out.println(min);
}
}