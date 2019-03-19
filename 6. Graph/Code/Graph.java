/*****************************************************
*    Title: Graph.java
*    Author: Koffman and Wolfgang
*    Site owner/sponsor: wiley.com
*    Date: 21/04/2010
*    Code version:
*    Availability: http://eu.wiley.com/WileyCDA/WileyTitle/productCd-EHEP001607.html(Accessed November 2014)- Only available to Instructors
*    Modified:  No
*****************************************************/

public interface Graph {
    //returns the number of vertices
    int getNumVertices(); 
    
    // determine if this is a directed graph
    boolean isDirected(); 
    
   // determine if an edge exists between source and destination
    boolean isEdge(int source, int dest);
    
    void insert(Edge edge);
    
    void remove(Edge edge);
}