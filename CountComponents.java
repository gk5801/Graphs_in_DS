package Graph;
import java.util.*;
class graphB
{
	int v;
	LinkedList<Integer> arr[];
	graphB(int v)
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
	void DFSOverall(int s)
	{
			boolean visited[] = new boolean[v];
			int count = 0;
			for(int i=0;i<v;i++)
			{
					if(!visited[i])
					{
							DFSUtility(i,visited);
							System.out.println();
							count++;
					}
			}
			System.out.println("Total no. of components in the graph are : " + count);
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
public class CountComponents
{
	public static void main(String args[])
	{
		graphB g = new graphB(8);
		g.addEdge(0,1);
		g.addEdge(0,2);
		g.addEdge(0,3);
		g.addEdge(1,3);
		g.addEdge(2,4);
		g.addEdge(3,4);
		g.addEdge(5,6);
		g.DFSOverall(0);
		
		g.addEdge(7,8);
	}
}
