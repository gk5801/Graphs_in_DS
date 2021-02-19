package Graph;
import java.util.*;

class graphs
{
		HashMap<Integer,HashSet<Integer>> graph = new HashMap<>();
		
		void addVertex(int data)
		{
			if(graph.containsKey(data))
			{
				System.out.println("Error ! Vertex already exists  ! ");
				return;
			}
			 graph.put(data, new HashSet<>());
		}
		void addEdge(int a,int b)
		{
			graph.get(a).add(b);
		}
		void print()
		{
			System.out.println("Vertices are : " + graph.keySet() + " ");
			System.out.println();
			for(Integer x : graph.keySet())
			{
				System.out.print("Neightbours of  " + x + " are : - "  );
				System.out.println(graph.get(x));
			}
		}
}
public class GraphSetMap 
{
	public static void main(String[] args) 
	{
			graphs g = new graphs();
			g.addVertex(0);
			g.addVertex(1);
			g.addVertex(2);
			g.addVertex(3);
			g.addVertex(4);
			
			g.addEdge(0, 1);
			g.addEdge(0, 2);
			g.addEdge(0, 3);
			g.addEdge(1, 4);
			g.addEdge(2, 1);
			g.addEdge(2, 3);
			g.addEdge(3, 4);
			g.addEdge(4, 1);
			
			g.print();
			g.addVertex(4);
			
	}

}
