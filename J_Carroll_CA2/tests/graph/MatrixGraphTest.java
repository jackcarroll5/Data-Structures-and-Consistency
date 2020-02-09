package graph;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MatrixGraphTest {



    @Test
    void getVerticesThatVertexIsAdjacentTo() {
       MatrixGraph graph = new MatrixGraph(5,true);
        ArrayList<Integer> expRes = new ArrayList<Integer>();
        ArrayList<Integer> list = graph.getVerticesThatVertexIsAdjacentTo(3);


         Edge e = new Edge(0,1);
         graph.insert(e);

        Edge e1 = new Edge(0,2);
        graph.insert(e1);

        Edge e2 = new Edge(0,3);
        graph.insert(e2);

        Edge e3 = new Edge(2,3);
        graph.insert(e3);

        Edge e4 = new Edge(3,1);
        graph.insert(e4);

        Edge e5 = new Edge(3,4);
        graph.insert(e5);

        expRes.add(1);
        expRes.add(4);

        //expRes = graph.getVerticesThatVertexIsAdjacentTo(3);


        //System.out.println("\nChosen vertex of 3 adjacent to " + graph.getVerticesThatVertexIsAdjacentTo(3));


        assertEquals(expRes, list);


        list = graph.getVerticesThatVertexIsAdjacentTo(1);
        expRes = new ArrayList<Integer>();

        assertEquals(expRes,list);



    }

    @Test
    void breadthFirstTraversal() {



    }

    @Test
    void depthFirstTraversal() {



    }
}