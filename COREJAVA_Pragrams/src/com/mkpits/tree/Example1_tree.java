package com.mkpits.tree;

import java.util.ArrayList;

public class Example1_tree {

	
		String data;
		ArrayList<Example1_tree> children;
		
	public Example1_tree(String data) {
		this.data=data;
		this.children=new ArrayList<Example1_tree>();
		
		
	}
	public void addChild(Example1_tree node) {
		
		this.children.add(node);
	}
	public String print(int level) {
		String ret;
		ret = "  ".repeat(level) + data + "\n";
		for (Example1_tree node : children) {
			ret += node.print(level + 1);
		}
		return ret;
		
	}

	

}
