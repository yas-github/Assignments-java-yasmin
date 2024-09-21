package AssignmentsWeek1;
public class FindDups {
	public static void main(String[] args) {
	int[] array= {11,23,11,34,45,34,56,56,43,12,56};
	System.out.println("The dupicate values:");
	for(int i=0;i<array.length;i++) {
		for(int j=i+1;j<array.length;j++) {
			if(array[i]==array[j]) {
				System.out.println(array[j]);}
			}
		
	}}}

