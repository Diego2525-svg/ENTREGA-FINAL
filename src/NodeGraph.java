import java.util.ArrayList;
import java.util.List;

public class NodeGraph {
    private User user;
    private List<NodeGraph> connections;

    public NodeGraph(User user) {
        this.user = user;
        this.connections = new ArrayList<>();
    }

    public User getUser() {
        return user;
    }

    public List<NodeGraph> getConnections() {
        return connections;
    }

    public void addConnection(NodeGraph node) {
        connections.add(node);
    }

    public void removeConnection(NodeGraph node) {
        connections.remove(node);
    }


   
}
