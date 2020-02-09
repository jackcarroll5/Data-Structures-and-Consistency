package graph;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MatrixGraphTest {

    @Test
    void getAdjacentVertices() {
        MatrixGraph graph = new MatrixGraph(5, true);
        graph.insert(new Edge(0,1));
        graph.insert(new Edge(0,2));
        graph.insert(new Edge(0,3));
        graph.insert(new Edge(2,3));
        graph.insert(new Edge(3,1));
        graph.insert(new Edge(3,4));

        ArrayList<Integer> list = graph.getAdjacentVertices(3);
        ArrayList<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(4);

        assertEquals(list, expected);

        list = graph.getAdjacentVertices(1);
        expected = new ArrayList<Integer>();

        assertEquals(list, expected);


    }
}