package com.arjit.datastructure.model;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graph {

	private int vertices;
	private LinkedList<Integer> adJacencyList[];
	
	@SuppressWarnings("unchecked")
	public Graph(int numVertices) {
		this.vertices = numVertices;
		adJacencyList = new LinkedList[vertices];
		for(int i=0; i < this.vertices; i++) {
			adJacencyList[i] = new LinkedList<Integer>();
		}
	}
	
	public void addVertice(int startPont, int lastPoint) {
		adJacencyList[startPont].add(lastPoint);
	}
	
	public void printEdges() {
		for(int i=0; i< this.vertices; i++) {
			Iterator<Integer> iterator = adJacencyList[i].iterator();
			while(iterator.hasNext()) {
				System.out.println(i + "->" + iterator.next());
			}
		}
	}
	
	void BFS(int startingPoint) {
		boolean visited[] = new boolean[vertices];
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(startingPoint);
		
		while(!queue.isEmpty()) {
			int vertex = queue.poll();
			if (visited[vertex] != true) {
				System.out.println(vertex);
				visited[vertex] = true;
				Iterator<Integer> iterator = adJacencyList[vertex].iterator();
				while(iterator.hasNext()) {
					int edge = iterator.next();
					if (visited[edge] != true) {
						queue.add(edge);
					}
				}
			}
		}
	}
	
	void DFS() {
		boolean visited[] = new boolean[vertices];
		DFS(0, visited);
	}
	
	void DFS(int vertex, boolean []visited) {
		int v;
		visited[vertex] = true;
		if (visited[vertex] != true) {
			System.out.println(vertex);
			Iterator<Integer> iterator = adJacencyList[vertex].iterator();
			while(iterator.hasNext()) {
				v = iterator.next();
				if (visited[v] != true) {
					DFS(v, visited);
				}
			}
		}
	}
	
	void topologicalSort(int vertex, boolean visited[], Stack<Integer> stack) {
			visited[vertex] = true;
			Iterator<Integer> iterator = adJacencyList[vertex].iterator();
			while(iterator.hasNext()) {
				int v = iterator.next();
				if (visited[v] != true)
					topologicalSort(v, visited, stack);
			}
			
			stack.push(new Integer(vertex));
	}
	
	void topologicalSort() {
		boolean visited[] = new boolean[vertices];
		Stack<Integer> stack = new Stack<Integer>();
		for(int i = 0; i < vertices; i++) {
			if (visited[i] == false)
				topologicalSort(i, visited, stack);
		}
		
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}
	
	public static void main(String[] args) {
		Graph graph = new Graph(6);
		graph.addVertice(5, 2);
		graph.addVertice(5, 0);
		graph.addVertice(4, 0);
		graph.addVertice(4, 1);
		graph.addVertice(2, 3);
		graph.addVertice(3, 1);
		
		graph.topologicalSort();
	}
}
