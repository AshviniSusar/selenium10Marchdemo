package MyClass;


public class SingleDimensionalArray {
public static void main(String args[]) {
	
	//array declare
	int a[]= {10,20,30,40,50,60,70};
	
	System.out.println(a.length);//to find out the length
	
	System.out.println(a[4]);//accesing value of specific index
	
	//print the array using for loop
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]+" ");
	}
	
}
}
