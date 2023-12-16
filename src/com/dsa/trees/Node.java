package com.dsa.trees;

public class Node {
    int val;
    Node rightChild;
    Node leftChild;
    Node parent;
    Node (int val){
    	this.val=val;
    	this.rightChild = null;
    	this.parent = null;
    	this.leftChild =null;
    	
    }
}
