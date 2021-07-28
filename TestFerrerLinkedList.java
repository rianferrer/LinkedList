import java.util.Scanner;
public class TestFerrerLinkedList {

public static void main(String args[]) {
		
		Scanner s = new Scanner(System.in); 
        System.out.println("Welcome to Rian's Linked List Operation Program!\n");
        
        //FERRER, MARION CARYL R.
        //2ITF
       
        FerrerLinkedList<Integer> slist = new FerrerLinkedList<Integer>(); 
              
        char ch;
        do {
        	System.out.println("\nLinked List Operations: \n"
            		+ "A. isEmpty \n" 
            		+ "B. Add to Head \n"
            		+ "C. Add to Tail \n"
            		+ "D. Delete from Head \n"
            		+ "E. Delete from Tail \n"
            		+ "F. Find \n"
            		+ "G. toString \n");
            System.out.print("Pick a letter of your chosen operation: ");
            char x = s.next().charAt(0);
            
            switch(x)
            {
            case 'A':
    		case 'a': System.out.println("Is list empty?: " + slist.isEmpty());
            	break;
    			
    		case 'B':
            case 'b': System.out.print("Enter a number: " );
				try
				{
					slist.addToHead(s.nextInt());
	            }
	            catch(Exception e)
	            {
	                System.out.println("Error: " + e.getMessage());
	            }  
	            break;
	            
            case 'C':
            case 'c': System.out.print("Enter a number: " );
				try
				{
	            	slist.addToTail(s.nextInt());
	            }
	            catch(Exception e)
	            {
	                System.out.println("Error: " + e.getMessage());
	            }  
	            break;
                
            case 'D':
            case 'd': 
				try
				{
	            	System.out.println(slist.deleteFromHead());
	            }
	            catch(Exception e)
	            {
	                System.out.println("Error: " + e.getMessage());
	            }  
	            break;
                
            case 'E':
            case 'e':
				try
				{
					System.out.println(slist.deleteFromTail());
	            }
	            catch(Exception e)
	            {
	                System.out.println("Error: " + e.getMessage());
	            }  
	            break;
                
              //FERRER, MARION CARYL R.
              //2ITF
    			
    		case 'F':
    		case 'f':
    			slist.find(s.nextInt());
    			break;
    			
    		case 'G':
    		case 'g': 
    			try
				{
					System.out.println(slist.toString());
	            }
	            catch(Exception e)
	            {
	                System.out.println("Error: " + e.getMessage());
	            }
    			break;
            }
            
            slist.display();            
            System.out.print("\nAnother operation to perform? (Y/N) ");
            ch = s.next().charAt(0);
 
        } while (ch == 'Y'|| ch == 'y');
    s.close();
    }
}
