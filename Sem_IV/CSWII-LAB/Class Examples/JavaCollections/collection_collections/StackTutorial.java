package com.csw2.collection_collections;

import java.util.Stack;

public class StackTutorial {

	public static void main(String[] args) {
		Stack<String> st = new Stack<String>();
		st.push("A");
		st.push("B");
		st.push("C");
		st.pop();
		st.push("D");
		System.out.println(st.peek());
		System.out.println(st.search("B"));
		System.out.println(st);
		System.out.println(st.empty());
	}

}
