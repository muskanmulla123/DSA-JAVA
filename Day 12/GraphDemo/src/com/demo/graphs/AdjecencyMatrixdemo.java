package com.demo.graphs;

import java.util.Scanner;

public class AdjecencyMatrixdemo {
	int[][] graph;
    public AdjecencyMatrixdemo(int v) {
    	graph=new int[v][v];
    }
    
     public void addGraph() {
    	 Scanner sc=new Scanner(System.in);
    	 for(int i=0;i<graph.length;i++) {
    		 for(int j=0;j<graph[i].length;j++) {
    			 System.out.println("edge"+i+"---->"+j+" :");
    			 graph[i][j]=sc.nextInt();
    		 }
    	 }
     }
     
     public void displayGraph() {
    	 for(int i=0;i<graph.length;i++) {
    		 for(int j=0;j<graph[i].length;j++) {
    			 System.out.print(graph[i][j]+"\t");
    			 
    		 }
    		 System.out.println();
    	 }
     }
}
