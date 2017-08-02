package com.datastructure.binarytree;

import java.util.*;

/**
 * Created by nanzhou on 2017/8/1.
 */
public class Tree {

    /**
     * 二叉树
     */
    private Node root;

    public Tree() {

        root = null;
    }

    public Node find(int key) {

        Node current = root;

        while (current.iData != key) {

            if (key < current.iData)
                current = current.leftChild;
            else
                current = current.rightChild;
            if (current == null) {

                return null;
            }
        }
        return current;
    }

    public void insert(int id, double dd) {

        Node newNode = new Node();
        newNode.iData = id;
        newNode.dData = dd;

        if (root == null) {

            root = newNode;
        } else {

            Node current = root;
            Node parent;
            while (true) {
                parent = current;

                if (id < current.iData) {

                    current = current.leftChild;
                    if (current == null) {

                        parent.leftChild = newNode;
                        return;
                    }
                } else {
                    current = current.rightChild;
                    if (current == null) {

                        parent.rightChild = newNode;
                        return;
                    }

                }
            }
        }
    }

    public boolean delete(int key) {

        Node current = root;

        Node parent = root;

        boolean isLeftChild = true;

        while (current.iData != key) { //search for node

            parent = current;
            if (key < current.iData) {

                isLeftChild = true;
                current = current.leftChild;// go right
            } else {

                isLeftChild = false;
                current = current.rightChild;
            }
            if (current == null) {

                return false; // cant find it
            }
        }

        //if no child .simply delete it
        if (current.rightChild == null && current.leftChild == null) {

            if (current == root)

                root = null;
            else if (isLeftChild)
                parent.leftChild = null;
            else
                parent.rightChild = null;
        }

        //if no right child ,replace with  left subtree
        else if (current.rightChild == null) {

            if (current == root)
                root = current.leftChild;
            else if (isLeftChild)
                parent.leftChild = current.leftChild;
            else
                parent.rightChild = current.leftChild;
        }

        //if no left chlid, replace with right subtree
        else if (current.leftChild == null) {

            if (current == root)
                root = current.rightChild;
            else if (isLeftChild)
                parent.leftChild = current.rightChild;
            else
                parent.rightChild = current.rightChild;
        }

        //to child ,replace with inorder successor
        else {
            //get successor of node to delete (current)

            Node successor = getSuccessor(current);

            //connect parent of current to successor instead
            if (current == root)
                root = successor;
            else if (isLeftChild)
                parent.leftChild = successor;
            else
                parent.rightChild = successor;

            //connect to successor to current's left child
            successor.leftChild = current.leftChild;

        }
        return true;
    }

    private Node getSuccessor(Node delNode) {

        Node successorParent = delNode;
        Node successor = delNode;

        Node current = delNode.rightChild;// go to right child no more so go to left child
        while (current != null) {

            successorParent = successor;
            successor = current;
            current = current.leftChild; // go  to left child
        }
        // if successor not right child ,make connections
        if (successor != delNode.rightChild) {

            successorParent.leftChild = successor.rightChild;
            successor.rightChild = delNode.rightChild;
        }

        return successor;

    }

    public void traverse(int traverseType) {

        switch (traverseType) {

            case 1:
                System.out.println("\n Preorder traversal");
                preOrder(root);
            case 2:
                System.out.println("\n Inorder traversal");
                inOrder(root);
            case 3:
                System.out.println("\n Postorder traversal");
                postOrder(root);
        }
        System.out.println(" ");
    }

    private void preOrder(Node localRoot) {

        if (localRoot != null) {

            System.out.println(localRoot.iData + " ");
            preOrder(localRoot.rightChild);
            preOrder(localRoot.leftChild);

        }

    }

    private void inOrder(Node localRoot) {

        if (localRoot != null) {

            inOrder(localRoot.rightChild);
            System.out.println(localRoot.iData + " ");
            inOrder(localRoot.leftChild);
        }
    }


    private void postOrder(Node localRoot) {

        if (localRoot != null) {


            postOrder(localRoot.rightChild);
            postOrder(localRoot.leftChild);
            System.out.println(localRoot.iData + " ");
        }
    }

    public void displayTree() {

        Stack globalStack = new Stack();
        globalStack.push(root);

        int nBlanks = 32;
        boolean isRowEmpty = false;

        System.out.println("--------------------------------");

        while (isRowEmpty == false) {

            Stack localStack = new Stack();
            isRowEmpty = true;
            for (int i = 0; i < nBlanks; i++)
                System.out.print(' ');

            while (globalStack.isEmpty() == false) {

                Node temp = (Node) globalStack.pop();

                if (temp != null) {

                    System.out.println(temp.iData);
                    localStack.push(temp.leftChild);
                    localStack.push(temp.rightChild);

                    if (temp.leftChild != null || temp.rightChild != null) {

                        isRowEmpty = false;
                    }
                } else {

                    System.out.print("--");
                    localStack.push(null);
                    localStack.push(null);
                }
                for (int j = 0; j < nBlanks * 2 - 2; j++)
                    System.out.print(' ');
            }
            System.out.println("");

            nBlanks /= 2;
            while (localStack.isEmpty() == false)
                globalStack.push(localStack.pop());
        }
    }
}
