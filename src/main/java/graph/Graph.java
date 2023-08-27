package graph;

import java.util.LinkedList;

public class Graph {
    String fileName = "";
    String title = "";
    public LinkedList<Values> values = new LinkedList<>();
    
    public Graph (String fileName, String title) {
        this.fileName = fileName;
        this.title = title;
    }

    
}
