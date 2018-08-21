package com.jda.ds.util;

public class LinkedList<T> {
	Node head;
	class Node{
		T data;
		Node next;
		Node(T d){ data = d; next = null;}
	}
	public void add(T d){
		Node new_node = new Node(d);
		new_node.next = head;
		head = new_node;
	}
	public void remove(T d){
		Node current = head;
		while(current != null){
			if(current.data == d){
				current.data = current.next.data;
				current.next = current.next.next;
				break;
			}
			current = current.next;
		}
	}
	public boolean search(T d){
		Node current = head;
		while(current != null){
			if(current.data == d)
				return true;
			current = current.next;
		}
		return false;
	}
	public boolean isEmpty(){
		if(head == null)
			return true;
		return false;
	}
	public int size(){
		int count = 0;
		Node current = head;
		while(current != null){
			count++;
			current = current.next;
		}
		return count;
	}
	public void append(T d){
		this.add(d);
	}
	public int index(T d){
		int count = 0;
		Node current = head;
		while(current.data != d){
			count++;
			current = current.next;
		}
		return count;
	}
	
}
