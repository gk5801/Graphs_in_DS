package Graph;
import java.util.*;

public class GreedyAlgorithmDijkstra 
{
		static int findMinVertex(int distance[],boolean visited[])
		{	
					int minVertex = -1;
					int v = distance.length;
					for(int i=0;i<v;i++)
					{
							 if(!visited[v] && (minVertex == -1 || distance[i]<distance[minVertex]))
							{
								 		minVertex = i;
							}
					}
					return minVertex;
		}
		static void dijkstras(int adjMatrix[][],int src)
		{
				int i;
				int v = adjMatrix.length;
				boolean visited[] = new boolean[v];
				int distance[] = new int[v];
				distance[src] = 0;
				for(i=0;i<distance.length;i++)
				{
					distance[i] = Integer.MAX_VALUE;
				}
				for(i=0;i<v-1;i++)
				{
						int minVertex = findMinVertex(distance,visited);	// to find the min vertexthat has not been visited.
						visited[minVertex] = true;
						for(i=0;i<v;i++)						// neighbour traversing
						{
							 if(adjMatrix[minVertex][i]!=0 && !visited[i])
							 {
								 	int newDistance = distance[minVertex] + adjMatrix[minVertex][i];
								 	if(newDistance < distance[i])
								 	{
								 				distance[i] = newDistance;
								 	}
							 }
						}
				}
				System.out.print("Shortest path from source "+src+" are: ");
				for(i=0;i<v;i++)
				{
					System.out.print(distance[i]+" ");
				}
				System.out.println();
		}
		public static void main(String[] args) 
		{
				int v,e,i,j;
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the no. of vertices : ");
				v = sc.nextInt();
				System.out.println("Enter the no. of edges : ");
				e = sc.nextInt();
				int adjMatrix[][] = new int[v][v];
				for(i=0;i<e;i++)
				{
						int	v1 = sc.nextInt();
						int	v2 = sc.nextInt();
						int	w = sc.nextInt();
						adjMatrix[v1][v2] = w;
						adjMatrix[v2][v1] = w;
				}
				System.out.println("Enter the source  : ");
				int src = sc.nextInt();
				dijkstras(adjMatrix,src);
		}
}
