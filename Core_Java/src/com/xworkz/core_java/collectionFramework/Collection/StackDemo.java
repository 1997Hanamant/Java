package com.xworkz.core_java.collectionFramework.Collection;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(10);
		System.out.println(stack);
		System.out.println("*************");
		System.out.println(stack.search(2));
		System.out.println(stack.pop());
		System.out.println( stack.peek());
		System.out.println(stack.pop());
		System.out.println( stack.peek());
		System.out.println(stack.pop());
		System.out.println( stack.peek());



	}

}
