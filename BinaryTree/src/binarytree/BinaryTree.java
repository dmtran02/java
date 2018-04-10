/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytree;

/**
 *
 * @author Enneacle
 */
public class BinaryTree {

    Node root;
    
    public void addNode(int key, String name){
        Node newNode = new Node(key, name);
        
        if(root == null){
            root = newNode;
        }
        else{
            Node focusNode = root;
            
            Node parent;
            
            while(true){
                parent = focusNode;
                
                if(key < focusNode.key){
                    focusNode = focusNode.left;
                    
                    if(focusNode == null){
                        parent.left = newNode;
                        return;
                    }
                }
                else{
                    focusNode = focusNode.right;
                    
                    if(focusNode == null){
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }
    
    public void inOrderTraverseTree(Node focusNode){
        if(focusNode != null){
            inOrderTraverseTree(focusNode.left);
            
            System.out.println(focusNode);
            
            inOrderTraverseTree(focusNode.right);
        }
    }
    
    public void preOrderTraverseTree(Node focusNode){
        if(focusNode != null){
            System.out.println(focusNode);
            
            preOrderTraverseTree(focusNode.left);
            
            preOrderTraverseTree(focusNode.right);
        }
    }
    
    public void postOrderTraverseTree(Node focusNode){
        if(focusNode != null){
            
            postOrderTraverseTree(focusNode.left);
            
            postOrderTraverseTree(focusNode.right);
            
            System.out.println(focusNode);
            
        }
    }
    
    public Node findNode(int key){
        Node focusNode = root;
        while(focusNode.key != key){
            if(key < focusNode.key){
                focusNode = focusNode.left;
            }
            else{
                focusNode = focusNode.right;
            }
        }
        if(focusNode == null){
            return null;
        }
        return focusNode;
    }
    
    /*public boolean remove(int key){
        Node focusNode = root;
        Node parent = root;
        
        boolean isItALeft = true;
        
        while(focusNode.key != key){
            parent = focusNode;
            
            if(key < focusNode.key){
                isItALeft = true;
                
                focusNode = focusNode.left;
            }
            else{
                isItALeft = false;
                
                focusNode = focusNode.right;
            }
            if(focusNode == null){
                return false;
            }
        }
        if(focusNode.left == null && focusNode.right == null){
            if(focusNode == root){
                root = null;
            }
            else if(isItALeft){
                parent.left = null;
            }
            else{
                parent.right = null;
            }
        }
        else if(focusNode.right == null){
            if(focusNode == root){
                root = focusNode.left;
            }
            else if(isItALeft){
                parent.left = focusNode.left;
            }
            else{
                parent.right = focusNode.left;
            }
        }
        else if(focusNode.left == null){
            if(focusNode == root){
                root = focusNode.right;
            }
            else if(isItALeft){
                parent.left = focusNode.right;
            }
            else{
                parent.right = focusNode.left;
            }
        }
        else{
            Node replacement = getReplacementNode(focusNode);
            
            if(focusNode == root){
                root = replacement;
            }
            else if(isItALeft){
                parent.left = replacement;
            }
            else{
                parent.right = replacement;
            }
            replacement.left = focusNode.left;
        }
        return true;
    }
    
    public Node getReplacementNode(Node replacedNode){
        Node replacementParent = replacedNode;
        Node replacement = replacedNode;
        
        Node focusNode = replacedNode.right;
        
        while(focusNode != null){
            replacementParent = replacement;
            
            replacement = focusNode;
            
            focusNode = focusNode.left;
        }
        
        if(replacement != replacedNode.right){
            replacementParent.left = replacement.right;
            replacement.right = replacedNode.right;
        }
        return replacement;
    }*/
    
    public static void main(String[] args){
        
        BinaryTree theTree = new BinaryTree();
        
        theTree.addNode(50, "Boss");
        theTree.addNode(25, "Vice President");
        theTree.addNode(15, "Office Manager");
        theTree.addNode(30, "Secretary");
        theTree.addNode(75, "Sales Manager");
        theTree.addNode(50, "Salesman 1");
        
        System.out.println("REMOVE KEY 25");
        
        //theTree.remove(25);
        
        theTree.inOrderTraverseTree(theTree.root);
    }
}

class Node{
    int key;
    String name;
    
    Node left;
    Node right;
    
    Node(int key, String name){
        this.key = key;
        this.name = name;
    }
    
    public String toString(){
        return name + " has a key " +key; 
    }
}
