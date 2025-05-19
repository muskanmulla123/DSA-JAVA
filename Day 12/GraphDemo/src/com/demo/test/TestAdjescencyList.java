package com.demo.test;

import com.demo.graphs.AdjescencyListDemo;

public class TestAdjescencyList {

	public static void main(String[] args) {
		AdjescencyListDemo ob=new AdjescencyListDemo(4);
		ob.addGraph();
		ob.displaydata();
		ob.dfsTraversal(0);
		ob.bfsTraversal(0);
	}

}
