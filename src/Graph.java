import java.util.ArrayList;
import java.util.List;

public class Graph {
    private List<NodeGraph> nodes;

    public Graph() {
        this.nodes = new ArrayList<>();
    }

    public void addNode(NodeGraph node) {
        nodes.add(node);
    }

    public void addConnection(NodeGraph node1, NodeGraph node2) {
        if (!nodes.contains(node1) || !nodes.contains(node2)) {
            throw new IllegalArgumentException("error");
        }
        node1.addConnection(node2);
        node2.addConnection(node1);
    }


    public List<NodeGraph> getNodes() {
        return nodes;
    }

    public void printGraph() {
        for (NodeGraph node : nodes) {
            System.out.print("Vertex: " + node.getUser().getName() + " - > ");
            for (NodeGraph neighbor : node.getConnections()) {
                System.out.print(neighbor.getUser().getName() + " ");
            }
            System.out.println();
        }
    }
}
