package Graph;
import java.util.*;
class graphI
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
		void BFS(int s)
		{
				HashSet<Integer> visited = new HashSet<>();
				Queue<Integer> q = new LinkedList<>();
				q.add(s);
				while(!q.isEmpty())
				{
					int temp = q.poll();
					System.out.print(temp + " ");
					for(Integer x : as.get(temp) )  //neighbours
					{
							if(!visited.contains(x))
							{
								q.add(x);
								visited.add(x);
							}
					}
				}
				System.out.println();
		}
}
public class GraphSetMapBFS 
{
	public static void main(String[] args) 
	{
		graphI g = new graphI();
		g.addVertex(0);
		g.addVertex(1);
		g.addVertex(2);
		g.addVertex(3);
		g.addVertex(4);

		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(0, 3);
		g.addEdge(1, 4);
		g.addEdge(2, 4);
		g.addEdge(3,4);

		g.BFS(0);
		g.BFS(1);
		g.BFS(2);
		g.BFS(3);
		g.BFS(4);	
	}
}
