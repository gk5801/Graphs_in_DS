package Graph;
import java.util.*;
class graphG
{
		HashMap<Integer,HashSet<Integer>> as = new HashMap<>();
		void addVertex(int data)
		{
			if(as.containsKey(data))
			{
				System.out.println("Error !");
					return ;
			}
			 as.put(data,new HashSet<>());
		}
		void addEdge(int a,int b)
		{
				as.get(a).add(b);
		}
		void DFS(int s)
		{
				HashSet<Integer> visited = new HashSet<>();
				DFSUtility(s,visited);
				System.out.println();
		}
		void DFSUtility(int s,HashSet<Integer>visited)
		{
				visited.add(s);
				System.out.print(s+ " ");
				for(Integer x : as.get(s))
				{
						if(!visited.contains(x))
						{
								DFSUtility(x,visited);
						}
				}
		}
}
public class GraphSetMapsDFS 
{
	public static void main(String[] args) 
	{
		graphG g = new graphG();
		g.addVertex(0);
		g.addVertex(1);
		g.addVertex(2);
		g.addVertex(3);
		g.addVertex(4);

		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(0, 3);
		g.addEdge(1, 3);
		g.addEdge(2, 4);
		g.addEdge(3,4);

		g.DFS(0);
		g.DFS(1);
		g.DFS(2);
		g.DFS(3);
		g.DFS(4);	
	}
}
