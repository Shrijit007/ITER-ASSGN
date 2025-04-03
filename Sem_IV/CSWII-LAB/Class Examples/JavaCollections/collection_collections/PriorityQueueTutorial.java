package com.csw2.collection_collections;
import java.util.*;

public class PriorityQueueTutorial {
//	PriorityQueue<Integer> p = new PQ<>(INT INITIAL CAPACITY);
//							   new PQ<>(INT INITIAL CAPACITY, COMPARATOR C);
//							   new PQ<>(SORTED SET);
//							   new PQ<>(COLLECTION C);
	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.offer(12);
		pq.offer(2);
		pq.offer(4);
		pq.offer(17);
		pq.offer(20);
		pq.offer(1);
		System.out.println(pq);
		System.out.println(pq.peek());
		System.out.println(pq.element());
		System.out.println(pq.poll());
		System.out.println(pq.remove());
		System.out.println(pq);
	}
	
}
