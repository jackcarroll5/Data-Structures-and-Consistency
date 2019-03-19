/*****************************************************
*    Title: Edge.java
*    Author: Koffman and Wolfgang
*    Site owner/sponsor: wiley.com
*    Date: 21/04/2010
*    Code version:
*    Availability: http://eu.wiley.com/WileyCDA/WileyTitle/productCd-EHEP001607.html(Accessed November 2014)- Only available to Instructors
*    Modified:  No
*****************************************************/


public class Edge {
    private int source;
    private int destination;
    
    public Edge(int s, int d){
        source = s;
        destination = d;        
    }
    
    public int getSource(){
        return source;
    }
    
    public int getDestination(){
        return destination;
    }
}
