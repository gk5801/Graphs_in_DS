package Graph;
import java.util.*;
class g
{
		int v;
		LinkedList<Integer> arr[];
		g(int v)
		{
				this.v = v;
				arr = new LinkedList[v];
				for(int i=0;i<v;i++)
				{
						arr[i] = new LinkedList<>();
				}
		}
		void addEdge(int a,int b)
		{
				arr[a].push(b);
		}
		void DFS(int s)
		{
				boolean visited[] = new boolean[v];
				DFSUtil(s,visited);
				System.out.println();
		}
		void DFSUtil(int s,boolean visited[])
		{
						visited[s] = true;
						System.out.print(s+" ");
						for(Integer x : arr[s])
						{
							if(!visited[x])
							{
									DFSUtil(x,visited);
							}
						}
		}
}
public class dfsLL 
{
	public static void main(String[] args) 
	{
				g obj = new g(5);
				obj.addEdge(0,1);
				obj.addEdge(0,2);
				obj.addEdge(0,3);
				obj.addEdge(1,3);
				obj.addEdge(2,4);
				obj.addEdge(3,4);				
				obj.DFS(0);
	}
}
