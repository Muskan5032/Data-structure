import java.util.*;

public class PercyPeacock {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
      
        int numberOfQueries = 10;
        String input = scanner.nextLine();
        
       
        Stack<String> featherStack = new Stack<>();
        
       
        String[] queries = input.split(", ");
      
        for (String query : queries) {
            if (query.startsWith("buy_")) {
                
                String color = query.substring(4); // Extract color name
                featherStack.push(color);
            } else if (query.equals("fetch")) {
                
                if (!featherStack.isEmpty()) {
               
                    String bottomFeather = featherStack.firstElement();
                    System.out.println(bottomFeather);
                    
              
                    featherStack.removeElementAt(0);
                    
                    featherStack.push(bottomFeather);
                } else {
                    System.out.println("No feathers available");
                }
            }
        }
        
        // Close the scanner
        scanner.close();
    }
}
