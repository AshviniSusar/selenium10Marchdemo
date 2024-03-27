package MyClass;

public class whileLoop {
public static void main(String args[]) {
        int count = 0;
        int num = 1;
        
        while (num <= 50) {
            if (num % 2 == 0) {
                count++;
            }
            num++;
        }
        
        System.out.println("Count of even numbers between 1 and 50: " + count);
    }
}
