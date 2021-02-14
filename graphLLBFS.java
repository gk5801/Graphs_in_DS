package Graph;
import java.util.*;
class graphL
{
		int v;
		LinkedList<Integer>arr[];
		public graphL(int v)
		{
			    this.v = v;
			    arr = new LinkedList[v];
				for(int i =0;i<v;i++)
				{
						arr[i] = new LinkedList<>();
				}
		}
		void addEdge(int a,int b)
		{
			arr[a].add(b);
		}
		void BFS(int s)
		{
			boolean visited[] = new boolean[v];
			Queue<Integer> q = new LinkedList<>();
			
				q.add(s);
				while(!q.isEmpty())
				{
					   int temp = q.poll();
					   System.out.print(temp + " ");
					   for(Integer x : arr[temp])
					   {
						    if(!visited[x])
						    {
						    		q.add(x);
						    		visited[x] = true;
						    }
					   }
				}
				System.out.println();
		}
		
}
public class graphLLBFS 
{
			public static void main(String args[])
			{			
			graphL graph = new graphL(5);
			graph.addEdge(0, 1);
			graph.addEdge(0, 2);
			graph.addEdge(0, 3);
			graph.addEdge(1, 3);
			graph.addEdge(2, 4);
			graph.addEdge(3, 4);
			graph.BFS(0);
			graph.BFS(1);
			graph.BFS(2);
			graph.BFS(3);
			}
}
