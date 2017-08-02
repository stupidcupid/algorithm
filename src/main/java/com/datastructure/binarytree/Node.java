package com.datastructure.binarytree;

/**
 * Created by nanzhou on 2017/8/1.
 */
public class Node {

    /**
     * 节点
     */
    public int iData;  //data item(key )

    public double dData; //data item

    public Node leftChild; //this node's left child

    public Node rightChild;// this node's right child

    public void dispalyNode() {

        System.out.print(" {  " + dData + " , " + iData + "} ");
    }



}
