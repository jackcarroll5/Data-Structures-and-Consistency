import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixGraphTest {

    private Graph graph;


    @BeforeEach
    public void setUp()
    {
      graph = new MatrixGraph(5,false); //Undirected Graph

    }

    @Test
    void isEdgeSource() {
        Edge edge = new Edge(0,1);

        graph.insert(edge);

        assertEquals(edge.getSource(),edge.getSource());

        System.out.println("The source of the edge is " + edge.getSource());

    }

    @Test
    void isEdgeDest() {
        Edge edge = new Edge(0,1);

        graph.insert(edge);

        assertEquals(edge.getDestination(),edge.getDestination());

        System.out.println("The destination of the edge is " + edge.getDestination());

    }


    @Test
    void isEdge() {
        Edge edge = new Edge(0,1);

        graph.insert(edge);

      assertTrue(graph.isEdge(0,1));

    }

    @Test
    void numVertices() {
        Edge edge = new Edge(0,2);

        graph.insert(edge);

        assertEquals(graph.getNumVertices(),graph.getNumVertices());

        System.out.println(graph.getNumVertices());

    }

    @Test
    void insertUndirected() {
        Edge edge = new Edge(2,4);
        graph.insert(edge);

        assertTrue(graph.isEdge(2,4));
        assertTrue(graph.isEdge(4,2));

    }

    @Test
    void remove() {
        Edge edge = new Edge(1,2);

       graph.insert(edge);
       graph.remove(edge);

        assertTrue(graph.isEdge(1,2));


    }

    @Test
    void breadthFirstTraversal() {


    }



    @Test
    void depthFirstTraversal() {


    }


}