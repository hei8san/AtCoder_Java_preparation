import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class BFS {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		int m = sc.nextInt();
		Graph g = new Graph(n);
		if (m == 0) {
			System.out.println(n);
			return;
		}

		for (int i = 0; i < m; i++) {
			int a1 = sc.nextInt();
			a1--;
			int a2 = sc.nextInt();
			a2--;
			g.addEdge(a1, a2);
		}
		Set<Set<Integer>> manage = new HashSet<>();
		for (int i = 0; i < n; i++) {
			Set<Integer> set = new TreeSet<>();
			ArrayList<Integer> arr = BFS(g, i);
			for(int e:arr) {
				set.add(e);
			}
			manage.add(set);
			
			
		}
		System.out.println(manage.size());
		

	}

	public static ArrayList<Integer> BFS(Graph g, int start) {
		Queue<Integer> queue = new LinkedList<>();
		ArrayList<Integer> visited = new ArrayList<>();
		queue.add(start);
		visited.add(start);

		while (!queue.isEmpty()) {
			int current = queue.remove();
//			System.out.println("At vertex " + current);
			LinkedList<Integer> list = g.getAdjList(current);
			if (!list.isEmpty()) {
				for (Integer i : list) {
					if (!visited.contains(i)) {
						queue.add(i);
						visited.add(i);
					}
				}
			}
			
		}
		return visited;
		
	}
}

class Graph {
	private int numberOfVertices;
	private LinkedList<Integer> adj[]; // adjacency list

	public Graph(int n) {
		numberOfVertices = n;
		adj = new LinkedList[numberOfVertices];
		// adj = new LinkedList<Integer>[];
		for (int i = 0; i < numberOfVertices; i++) {
			adj[i] = new LinkedList();
		}
	}

	public void addEdge(int v, int w) {
		adj[v].add(w);
		adj[w].add(v);
	}

	public LinkedList<Integer> getAdjList(int vertex) {
		return adj[vertex];
	}

	public int getNumberOfVertices() {
		return numberOfVertices;
	}
}
