import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListGraph extends MatrixGraph {

   private List<LinkedList<Edge>> adjacencyList;

   public ListGraph(int nv, boolean directed)
   {
       super(nv,directed);
       adjacencyList = new ArrayList<LinkedList<Edge>>(nv);

       for (int i = 0; i < nv; i++)
       {
           adjacencyList.add(new LinkedList<Edge>());
       }

   }

   public void display()
   {
       int numVertices = adjacencyList.size();
       for(int i = 0; i < numVertices; i++)
       {
         if(adjacencyList.size() > 0)
         {
             System.out.print("Vertex " + i + " connects to " );

            for(int j = 0; j < adjacencyList.size(); j++)
            {
                System.out.print(adjacencyList.get(j) + " ");
            }

            System.out.println();
         }

       }
   }

    public void breadthFirstTraversal(int start){
        //Output the vertices in breadth first order



            }


}
