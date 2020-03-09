import java.util.Scanner;

import ciic4020.queue.DoublyLinkedQueue;
import ciic4020.queue.Queue;
import ciic4020.stack.ArrayStack;
import ciic4020.stack.Stack;

public class Palindrome {

	public static String isPalindrome() {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String noSpace = input.replaceAll("[\\W]", "");
		
		Stack<String> stack = new ArrayStack<String>(noSpace.length());
		Queue<String> queue = new DoublyLinkedQueue<String>();
		
		for (char c : noSpace.toCharArray()) {
			stack.push(Character.toString(c).toLowerCase());
			queue.enqueue(Character.toString(c).toLowerCase());
		}
		int i = noSpace.length();
		while (i >= noSpace.length() / 2) {
			String x = stack.pop();
			String y = queue.dequeue();
			if (!x.equals(y)) {
				return "Not a Palindrome";
			}
			i--;
		}
		
		return "Palindrome";
	}
	
	public static void main(String[] args) {
		System.out.println(isPalindrome());
	}
	
}
