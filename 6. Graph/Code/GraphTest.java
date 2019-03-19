public class GraphTest {

    public static void main(String[] args) {


        MatrixGraph mg = new MatrixGraph(0,false);
        System.out.println("Directed graph: " + mg.isDirected());



        MatrixGraph matrixGraphD = new MatrixGraph(5,true);
        System.out.println("\nDirected graph for 2nd graph: " + matrixGraphD.isDirected());

        System.out.println("\nNumber of matrices is: " + matrixGraphD.getNumVertices());



        Edge edge = new Edge(0,1);
        matrixGraphD.insert(edge);


        if (matrixGraphD.isEdge(0,1))
        {
            System.out.println("The selected edge is " + matrixGraphD.isEdge(0,1));
        }

        Edge edge2 = new Edge(0,2);
        matrixGraphD.insert(edge2);

        Edge edge3 = new Edge(1,2);
        matrixGraphD.insert(edge3);

        Edge edge4 = new Edge(0,3);
        matrixGraphD.insert(edge4);

        Edge edge5 = new Edge(2,4);
        matrixGraphD.insert(edge5);

        System.out.println("\n" + matrixGraphD.getNumVertices());

        /*matrixGraphD.remove(edge5);

          if(!matrixGraphD.isEdge(2,4))
          {
           System.out.println("\nEdge is removed. " + matrixGraphD.getNumVertices() + " vertices remain");
           }*/


        System.out.println("\n");

         matrixGraphD.display();

        matrixGraphD.traverseGraph();

         matrixGraphD.dfs();






       MatrixGraph matrixGraph = new MatrixGraph(5,false);

        System.out.println("\nNumber of matrices is: " + matrixGraph.getNumVertices());

       Edge e = new Edge(0,1);
       matrixGraph.insert(e);

        Edge e2 = new Edge(0,2);
        matrixGraph.insert(e2);

        Edge e3 = new Edge(1,2);
        matrixGraph.insert(e3);

        Edge e4 = new Edge(0,3);
        matrixGraph.insert(e4);

        Edge e5 = new Edge(2,4);
        matrixGraph.insert(e5);


        System.out.println("\n");


        matrixGraph.display();

        matrixGraph.traverseGraph();



        matrixGraph.dfs();





        ListGraph listGraph = new ListGraph(5,true);

        listGraph.insert(edge);
        listGraph.insert(edge2);
        listGraph.insert(edge3);
        listGraph.insert(edge4);
        listGraph.insert(edge5);

        System.out.println("\n");

        listGraph.display();





        ListGraph listGraphFalse = new ListGraph(5,false);

        listGraphFalse.insert(e);
        listGraphFalse.insert(e2);
        listGraphFalse.insert(e3);
        listGraphFalse.insert(e4);
        listGraphFalse.insert(e5);

        System.out.println("\n");

        listGraphFalse.display();

    }
}
