import java.util.*;
import java.io.File;
import java.util.regex.*;
import java.io.FileInputStream;

public class TestMain {

	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		NoteReader nr = new NoteReader();
		scanner.reset();
		
		System.out.println("Please specify the folder path: ");
		String dir = scanner.nextLine();
		scanner.reset();
		
		boolean truth = true;
		
		while(truth != false) {
		System.out.println();	
		System.out.println("Please choose from the following options: ");
		System.out.println("Include operators when necessary (!, @, #)");
		System.out.println("Enter '1' to generate a report of all notes containing selected identifier.");
		System.out.println("Enter '2' to generate a report of all notes containing mentions.");
		System.out.println("Enter '3' to generate a report of all notes organized by mention.");
		System.out.println("Enter '4' to generate a report of all keywords.");
		System.out.println("Enter '5' to generate a report of all notes organized by keyword.");
		System.out.println("Enter '6' to generate a report of all notes containing selected keyword or mention.");
		System.out.println("Enter '7' to generate a report of all notes in topographical order.");
		System.out.println("Enter '8' to terminate the program.");
    	int num = scanner.nextInt();
    	scanner.nextLine();
    	scanner.reset();
    	System.out.println();	
    	
    	if(num == 8) System.exit(0);
    	
    switch (num) {
        case 1:
        	System.out.println("Please enter your desired id: ");
    	    String kw7 = scanner.nextLine();
    	    System.out.println();
            nr.reader(dir, kw7);
            break;
        case 2:
        	System.out.println();
            nr.reader4(dir);
            break;
        case 3:
            System.out.println("Please enter your desired mention: ");
        	String kw2 = scanner.nextLine();
        	System.out.println();
            nr.reader2(dir, kw2);
            break;
        case 4:
        	System.out.println();
            nr.reader5(dir);
            break;
        case 5:
            System.out.println("Please enter your desired keyword: ");
    	    String kw4 = scanner.nextLine();
    	    System.out.println();
            nr.reader2(dir, kw4);
            break;
        case 6:
            System.out.println("Please enter your desired mention/keyword: ");
    	    String kw5 = scanner.nextLine();
            nr.reader(dir, kw5);
            break;
        case 7:
        	System.out.println();
            nr.reader3(dir);
            break;
        default:
            System.out.println("Invalid Input.");
    }
		}
	}
}
