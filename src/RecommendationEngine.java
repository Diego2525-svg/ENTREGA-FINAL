import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.*;

public class RecommendationEngine {
    public List recommendFriends(NodeGraph node, Graph graph){
        List recommendations= new ArrayList<>();
        for(NodeGraph potentialFriendNode: graph.getNodes()){
            User potentialFriend=potentialFriendNode.getUser();
        
        if (!node.getConnections().contains(potentialFriend)&&!node.getUser().equals(potentialFriend)) {
            double similarity=calculeSimilarity(node.getUser(), potentialFriend);

            if (similarity>0.3){//Umbral de recomendacion
                recommendations.add(potentialFriend);
            }
        }
    }
    return recommendations;
    }

    private double calculeSimilarity(User user1, User user2){
        Set <String> interets1 = new HashSet<>(user1.getInterests());
        Set <String> interests2= new HashSet<>(user2.getInterests());
        Set <String> intersection= new HashSet<>(interets1);
        intersection.retainAll(interests2);//Solo se queda los que esten repetidos

        Set <String> union= new HashSet<>(interets1);
        union.addAll(interests2);//Te guarda los que no se repiten

        double resp=(double)intersection.size()/union.size();
        System.out.println("Valor "+resp);

        return resp;

    }
}
