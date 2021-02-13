package Graph;
import java.util.LinkedList;
class graph
{
	int v;
	LinkedList<Integer> arr[];
	graph(int v)
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
	void printA()
	{
		for(int i=0;i<v;i++)
		{
			System.out.print("Neighbours of " + i + " are : ");
			for(Integer x : arr[i])  // x will store array values  // foreach loop.
			{
				System.out.print( x + " ");
			}
			System.out.println();
		}
		
	}
}
public class graphLL 
{
	public static void main(String args[])
	{
		graph g = new graph(5);
		g.addEdge(0,1);
		g.addEdge(0,2);
		g.addEdge(0,3);
		g.addEdge(1,3);
		g.addEdge(2,4);
		g.addEdge(3,4);
		g.printA();
	}
}
