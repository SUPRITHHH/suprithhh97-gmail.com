package com.testyantra.sorting.list;

import java.util.LinkedList;

public class TestC {

	public static void main(String[] args) {
		
		LinkedList<Integer> l = new LinkedList<Integer>();
		
		l.add(12);
		l.add(23);
		l.add(34);
		l.add(25);
		
		Integer peekElement = l.peek();
		System.out.println("Peek Element "+peekElement);
		Integer peekFirstElement = l.peekFirst();
		System.out.println("Peek First Element "+peekFirstElement);
		Integer peekLastElement = l.peekLast();
		System.out.println("Peek Last Elemeny "+peekLastElement);
		System.out.println("After peek----------->");
		System.out.println(l);
		System.out.println("======================================");
		
		Integer pollElement = l.poll();
		System.out.println("Poll Element "+pollElement);
		Integer pollFirstElement = l.pollFirst();
		System.out.println("Poll First Element "+pollFirstElement);
		Integer PollLastElement = l.pollLast();
		System.out.println("Poll Last Element "+PollLastElement);
		System.out.println("After Poll ----------->");
		
		
		l.push(12);System.out.println("After Push----------->");
		Integer p = l.pop();
		System.out.println(p);
		System.out.println("After pop---------->"+l);
	}
}
