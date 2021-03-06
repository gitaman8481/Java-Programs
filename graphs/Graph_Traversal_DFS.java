package graphs;
import java.util.*;

public class Graph_Traversal_DFS{
	
	@SuppressWarnings("unused")
	private int v;
	private LinkedList<Integer> adj[];
	
	@SuppressWarnings("unchecked")
	public Graph_Traversal_DFS(int v){
		adj = new LinkedList[v];
		for(int i = 0 ; i < v ; ++i)
			adj[i] = new LinkedList<Integer>();	
	}
	
	void addEdge(int v, int w) {
		adj[v].add(w);
	}
	
	void DFSUtil(int v, boolean visited[]) {
		visited[v] = true;
		System.out.println(v + " ");
		
		Iterator<Integer> i = adj[v].listIterator();
		while(i.hasNext()) {
			int n = i.next();
			if(!visited[n])
				DFSUtil(n,visited);
		}	
	}
	
	void DFS(int v) {
		boolean visited[] = new boolean[v];
		DFSUtil(v,visited);
	}
	
	public static void main(String[] args) {

		Graph_Traversal_DFS d = new Graph_Traversal_DFS(4);
 
        d.addEdge(0, 1);
        d.addEdge(0, 2);
        d.addEdge(1, 2);
        d.addEdge(2, 0);
        d.addEdge(2, 3);
        d.addEdge(3, 3);
 
        System.out.println(
            "Following is Depth First Traversal "
            + "(starting from vertex 2)");
 
        d.DFS(2);
		
	}

}
