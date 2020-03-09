import java.util.Scanner;

import ciic4020.stack.ArrayStack;
import ciic4020.stack.Stack;

public class Fully_Paren {
	
	public static void fullyParen() {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int inLen = input.length();
		Stack<Integer> operand = new ArrayStack<Integer>(inLen);
		Stack<String> operator = new ArrayStack<String>(inLen);
		Stack<String> parenthesis = new ArrayStack<String>(inLen);
		
		
	}
}
