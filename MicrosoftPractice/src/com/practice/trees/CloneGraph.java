package com.practice.trees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

//Definition for a Node.
class NodeTree {
 public int val;
 public List<NodeTree> neighbors;

 public NodeTree() {}

 public NodeTree(int _val,List<NodeTree> _neighbors) {
     val = _val;
     neighbors = _neighbors;
 }
};
public class CloneGraph {
	
	HashMap<NodeTree,NodeTree>  visited = new HashMap<NodeTree,NodeTree>();
	
	public NodeTree cloneGraph(NodeTree node) {
		
		if(node == null) {
			return node;
		}
		
		if(visited.containsKey(node)) {
			return node;
		}
		
		NodeTree cloneNode = new NodeTree(node.val,new ArrayList());		
		visited.put(node, cloneNode);
		
		for(NodeTree neighbour:node.neighbors) {
			cloneNode.neighbors.add(cloneGraph(neighbour));
		}
		
		return cloneNode;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
