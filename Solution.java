import java.util.*;
public class Hello {

    public static void main(String[] args) {
	
	    Scanner sc = new Scanner(System.in);
	    String input = sc.next();
	    //split string with @ or .
	    String[] temp = input.split("@|\\.");
	    
	    System.out.println(temp[2]);
	    System.out.println(temp[1]);
	    System.out.println(temp[0]);
        
	}
}
