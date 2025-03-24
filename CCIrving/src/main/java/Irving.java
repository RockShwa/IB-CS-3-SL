import java.util.*;
import java.io.File;

public class Irving {
    // dealing with stacks
    // stacks: way to organize information, but with a twist
        // twist: LIFO behavior, last one in is the first one out
        // add to end of array, take out of end of array

    // add, multiple items at the same time:
        // placed on stack in the exact order they were given 
        // (last item is the most recently added, at the top of the stack)

    // shuffle/move
        // transfer a specific number of items from the top of one stack to a different stack (on the top)
        // transfer happens one at a time (end up in reverse order from original)
    
    // remove
        // items removed in reverse order as they were put in (last in first to be removed)
        
    // Irving challenge
        // system keeps track of the order items were removed in
        // remembers the sequence

        // remove more items that in the stack?
            // Irving challenge: the entire operation fails
            // need to throw an exception, doesn't remove anything 

    // Irving gives specific scenario

    // put data into a stack?

    public static Stack<String> stack = new Stack<>();

    public static void main(String[] args) {
		Scanner fileInput = null;
		
		try {
			fileInput = new Scanner(new File("Irving.txt"));
			
		} catch (Exception e) {
			System.out.println("Couldn't find the file!");
			e.printStackTrace();
			System.exit(0); // exits the program & doesn't continue
		}

        ArrayList<Stack<String>> stacks = new ArrayList<>();

        while(!fileInput.hasNextInt()) {
            String l = fileInput.nextLine();
            String[] words = l.split(" ");
            
            for (int i = 0; i < words.length; i++) {
                Stack<String> stack = new Stack<>();
                stack.add(words[i]);
                stacks.add(stack);
            }
        }

        // for (int i = 0; i < stacks.size(); i++) {
        //     for (int j = 0; j < stacks.get(i).size() - 1; i++) {
        //         System.out.println(stacks.get(i).peek());
        //     }
        // }

        int numTestCases = fileInput.nextInt();
        fileInput.nextLine();
        // System.out.println(numTestCases);
        
        for (int i = 0; i < numTestCases; i++) {
            String[] testCase = fileInput.nextLine().split(" ");
            if (testCase[0].toLowerCase().equals("add")) {
                Stack<String> added = new Stack<>();
                for (int j = 1; j < testCase.length; j++) {
                    added.add(testCase[j]);
                }
                addAll(added);
            }

            if (testCase[0].toLowerCase().equals("remove")) {
                Stack<String> removed = new Stack<>();
                for (int j = 1; j < testCase.length; j++) {
                    removed.add(testCase[j]);
                }
                removeAll(removed);
                // keep?
                // Stack<String> justRemoved = removeAll(added);
            }

            if (testCase[0].toLowerCase().equals("move")) {
                int numItems = fileInput.nextInt();
                // gonna have to change signature to include passing og and dest stack if needed
                int ogStack = fileInput.nextInt();
                int destStack = fileInput.nextInt();

                Stack<String> destination = stacks.get(destStack - 1);

                move(numItems, destination);
            }
        }
    }  

    
    public static void addAll(Stack<String> added) {
        for (String s : added) {
            stack.add(s);
        }
    }

    // remove all occurances?
    public static Stack<String> removeAll(Stack<String> removeThese) {
        Stack<String> removed = new Stack<>();
        if (removeThese.size() > stack.size()) {
            throw new IllegalStateException(); 
        }
        for (String s : removeThese) {
            stack.remove(s);
            // return in reverse order of orignial order
            removed.add(s);
        }
        return removed;
    }

    // worry about removing too many items?
    public static void move(int numItems, Stack<String> destination) {
        for (int i = 0; i < numItems; i++) {
            destination.add(stack.pop());
        }
    }
    
    public static void printStack() {
        for (String s : stack) {
            System.out.println(s);
        }
    }
}   
