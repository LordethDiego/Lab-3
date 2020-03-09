import java.util.Scanner;

import ciic4020.stack.ArrayStack;
import ciic4020.stack.Stack;

public class StackSort {
	
	public static void stackSort() {
		while (true) { //do an if to break the loop
			Scanner sc = new Scanner(System.in);
			int input = sc.nextInt();
			Stack<Integer> smol = new ArrayStack<Integer>(1);
			Stack<Integer> lorge = new ArrayStack<Integer>(1);
			int topSmol = -1;
			int topLorge = -1;
			int popped;
			
			if (smol.isEmpty()) {
				smol.push(input);
				topSmol = input;
			}
			else if (input < topSmol) {
				while (true) {
					popped = smol.pop();
					lorge.push(popped);
					topLorge = popped;
					//unifhsnied
				}
			}
		}
		//print stuff out here
	}
	
	public static void main(String[] args) {
		
	}
}
