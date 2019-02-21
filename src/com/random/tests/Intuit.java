package com.random.tests;

import java.util.ArrayList;

public class Intuit {
    public class Solution {
        private class Node {
            String value;
            Node parent;
            ArrayList<Node> parentList;
            public Node(String key){
                this.value = key;
                this.parent = null;
            }
        }

        ArrayList<Node>getParentlist(Node node){
            return node.parentList;
        }
        
        boolean shareAncestor(String[] idPair, String[][] dataset) {

            ArrayList<Node>nodeList = new ArrayList<>();
            for (int i = 0; i < dataset.length - 1; i++) {
                    if(!dataset[i][1].equals(dataset[i+1][1])){
                        Node node = new Node(dataset[i][1]);
                        nodeList.add(node);
                        node.parentList.add(new Node(dataset[i][0]));
                    }else{
                        Node node = new Node(dataset[i][1]);
                        nodeList.add(node);
                        node.parentList.add(new Node(dataset[i][0]));
                        node.parentList.add(new Node(dataset[i+1][0]));
                        i++;
                    }
                }
            
            ArrayList<ArrayList<Node>> resultList = new ArrayList<>();
            for (int i = 0; i < nodeList.size(); i++) {
                for (int j = 0; j < idPair.length; j++) {
                    if(nodeList.get(i).value == idPair[j]){
                        while(nodeList.get(i).parentList != null){
                            resultList.add(nodeList.get(i).parentList);
                        }
                    }
                }
            }
            
            int common = 0;
            for (int i = 0; i < resultList.size(); i++) {
                for (int j = 0; j < resultList.get(i).size(); j++) {
                    if(resultList.get(i).get(j).value == resultList.get(i+1).get(j).value){
                        common++;
                    }
                }
            }

            return common != 0;


            }
        }
    }