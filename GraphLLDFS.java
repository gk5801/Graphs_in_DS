package Graph;
import java.util.LinkedList;
import java.util.Queue;
class graphZ
{
	int v;
	LinkedList<Integer> arr[];
	graphZ(int v)
	{
		this.v = v;
	    arr = new LinkedList[v];
	    for(int i=0;i<v;i++)
		{
			arr[i] = new LinkedList<>();    // creating a linked list for every index in array.
		}
	}
	void addEdge(int a,int b)
	{
		arr[a].push(b);
		//arr[b].push(a);  for bidirectional graph,then both the statements are required.
	}
	void DFS(int s)
	{
			boolean visited[] = new boolean[v];
			DFSUtility(s,visited);
			System.out.println();
	}
	void DFSUtility(int s,boolean visited[])
	{
			visited[s]=true;
			System.out.print(s+" ");
			for(Integer x : arr[s])
			{
					if(!visited[x])
					{
							DFSUtility(x,visited);
					}
			}
	}
}
public class GraphLLDFS
{
	public static void main(String args[])
	{
		graphZ g = new graphZ(5);
		g.addEdge(0,1);
		g.addEdge(0,2);
		g.addEdge(0,3);
		g.addEdge(1,3);
		g.addEdge(2,4);
		g.addEdge(3,4);
		
		g.DFS(0);
		g.DFS(1);
		g.DFS(2);
	}
}
