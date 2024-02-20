package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class Graph {
    private HashMap<String, ArrayList<String>> adjList = new HashMap<>();

    public void printGraph() {
        System.out.println(adjList);
    }

    public Boolean addVertex(String  vertex) {
        if(Objects.equals(adjList.get(vertex), null)) {
            adjList.put(vertex, new ArrayList<>());
            return true;
        }
        return false;
    }

    public Boolean addEdge(String vertex1, String vertex2) {
        if(!Objects.equals(adjList.get(vertex1), null) && !Objects.equals(adjList.get(vertex2), null))  {
            adjList.get(vertex1).add(vertex2);
            adjList.get(vertex2).add(vertex1);
            return true;
        }
        return false;
    }

    public Boolean removeEdge(String vertex1, String vertex2) {
        if(!Objects.equals(adjList.get(vertex1), null) && !Objects.equals(adjList.get(vertex2), null))  {
            adjList.get(vertex1).remove(vertex2);
            adjList.get(vertex2).remove(vertex1);
            return true;
        }
        return false;
    }

    public Boolean removeVertex(String vertex) {
        if(!Objects.equals(adjList.get(vertex), null))  {
            for(String otherVertex :  adjList.get(vertex)) {
                adjList.get(otherVertex).remove(vertex);
            }
            adjList.remove(vertex);
            return true;
        }
        return false;
    }
}
