package MyClass;

public class Iterator {
public static void main(String args[]) {
	// store value in sequential manner
	//make a colletion
	ArrayList<String>cars= new ArrayList<String>();
	cars.add("volvo");
	cars.add("BMW");
	cars.add("Ford");
	cars.add("Ford");
	Iterator<String> it= cars.iterator();
	System.out.println(it.next());
}
}
/*An iterator is an object that can be used to loop through collections ,
 * like Arraylist and Hashset.It is called an "iterator"because "iterating" is the technical term for looping 
 */

