import javax.swing.plaf.nimbus.State;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


/*****************************************************
*    Title: MatrixGraph.java
*    Author: Koffman and Wolfgang
*    Site owner/sponsor: wiley.com
*    Date: 21/04/2010
*    Code version:
*    Availability: http://eu.wiley.com/WileyCDA/WileyTitle/productCd-EHEP001607.html(Accessed November 2014)- Only available to Instructors
*    Modified:  No
*****************************************************/

public class MatrixGraph extends AbstractGraph {
    //entries in matrix are 1.0 or 0.0
    //1.0 indicates an edge.
    //0.0 indicates no edge
    
    private double[][] matrix;


    public MatrixGraph(int nV, boolean direct){
        super(nV, direct);
        matrix = new double[nV][nV];
        for (int row = 0; row < nV; row++)
            for (int col = 0; col < nV; col++)
                    matrix[row][col] = 0.0;        
    }


    public boolean isEdge(int source, int dest) {
        //complete this method
        if(matrix[source][dest] == 1.0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void insert(Edge edge) {
        //complete this method
        // if graph is undirected, insert two edges
        // otherwise, insert just one edge

        matrix[edge.getSource()][edge.getDestination()] = 1.0;

        if(!isDirected())
        {
           matrix[edge.getDestination()][edge.getSource()] = 1.0;
        }
    }

    public void remove(Edge edge) {
        //complete this method
        // as for insert method

        matrix[edge.getSource()][edge.getDestination()] = 0.0;

        if(!isDirected())
        {
            matrix[edge.getDestination()][edge.getSource()] = 0.0;
        }

    }
    


    public void display()
    {
        int v = matrix.length;

        System.out.println("\n\nRow (Y) Column (X)");
        for (int i = 0; i < v; i++)
        {
            System.out.print(i + "   ");
            for (int j = 0; j < v; j++) {

                System.out.print(matrix[i][j] + " " );
            }
            System.out.print("\n" + " ");
        }

    }

    public void traverseGraph() {

        int v = matrix.length;
        VertexState[] states = new VertexState[v];

        System.out.println("Using BFS Traversing the graph");


        for (int i = 0; i < v; i++) {
            if (states[i] != VertexState.VISITED) {
                breadthFirstTraversal(i);
            }
        }
    }

    public void breadthFirstTraversal(int start){
        //Output the vertices in breadth first order

        int v = matrix.length;
        VertexState[] states = new VertexState[v];
        states[start] = VertexState.WAITING;

        System.out.println("\nStart: " + start);

        System.out.println("\nStart State: " + states[start]);

        Queue<Integer> queue = new LinkedList<Integer>();

        ((LinkedList<Integer>) queue).addLast(start);

        System.out.println("Queue List : " + queue);

          while (!queue.isEmpty())
           {
            int visitedVertices = ((LinkedList<Integer>) queue).removeFirst();
            states[visitedVertices] = VertexState.VISITED;
            System.out.print("Vertex visited: " + visitedVertices + " \n" + states[visitedVertices] + "\n");

                    for (int k = 0; k < v; k++) {
                        if(matrix[visitedVertices][k] != 0)
                        {
                        if (isEdge(start,k) && states[k] == VertexState.NOT_VISITED)
                          {
                            queue.add((k + 1));
                            states[k] = VertexState.WAITING;
                          }
                        }
                        System.out.print("       " + k + " " + states[k] + "   " + queue +  "\n");
                    }
            }
    }
    
    public void depthFirstTraversalRecursion(int start){
        //Output the vertices in depth first order
        int v = matrix.length;
        VertexState[] states = new VertexState[v];

       //depthFirstTraversalRecursion(start);

        states[start] = VertexState.WAITING;

        System.out.println("\n\nStart State: " + states[start]);

        System.out.println("\nStart No: " + start);

       for (int w = 0; w < v; w++)
       {
           if(isEdge(start,w) && states[w] == VertexState.NOT_VISITED)
           {
               depthFirstTraversalRecursion(w);
           }

       }
        states[start] = VertexState.VISITED;
        System.out.print("Current State: " + states[start]);
    }

    public void dfs() {
        int v = matrix.length;
        VertexState[] states = new VertexState[v];

        System.out.println("\nUsing DFS Traversing the graph");

        for (int i = 0; i < v; i++) {
            if (states[i] != VertexState.VISITED) {
                depthFirstTraversalRecursion(i);
            }


        }
    }
}
