package AssignmentsWeek1;

import java.util.Iterator;

public class MissingNumbers {

	public static void main(String[] args) {
		int sum=0,arrsum=0;
		int a[]= {1,4,3,2,8,6,7};
		System.out.print("\ngiven array:\n");
		for(int i=0;i<a.length;i++) 
			System.out.print(a[i]+" ");
		int temp=0;
		for(int i=1;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[i]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					}
				}		
	}
		System.out.println("\nsorted array:");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");

for(int k=1;k<=8;k++) {
	sum=sum+k;
}
for(int l=0;l<a.length;l++) {
	arrsum=arrsum+a[l];
}
int m=sum-arrsum;
System.out.println("\nmissing numbers: "+m);
	

}}
