package com.mkpits.tree;

public class TestTreeClass {

	public static void main(String[] args) {
		Example1_tree foods = new Example1_tree("Foods");
		Example1_tree starter = new Example1_tree("Starter");
		Example1_tree mainCours = new Example1_tree("Main Cours");
		
		foods.addChild(starter);
		foods.addChild(mainCours);
		
		Example1_tree starter1 = new Example1_tree("Masala Papad");
		Example1_tree starter2 = new Example1_tree("Chill Chicken");
		Example1_tree starter3 = new Example1_tree("Chill Paneer");
		Example1_tree starter4 = new Example1_tree("Kabab");
		starter.addChild(starter1);
		starter.addChild(starter2);
		starter.addChild(starter3);
		starter.addChild(starter4);
		
		Example1_tree mainCours1 = new Example1_tree("Masala Paneer");
		Example1_tree mainCours2 = new Example1_tree("Paneer Watana");
		Example1_tree mainCours3 = new Example1_tree("Shev Bhaji");
		Example1_tree mainCours4 = new Example1_tree("Muglai Mutton");
		Example1_tree mainCours5 = new Example1_tree("Khada Chicken Muglai");
		Example1_tree mainCours6 = new Example1_tree("Bhendi");
		mainCours.addChild(mainCours1);
		mainCours.addChild(mainCours2);
		mainCours.addChild(mainCours3);
		mainCours.addChild(mainCours4);
		mainCours.addChild(mainCours5);
		mainCours.addChild(mainCours6);
		
		
		
		System.out.println(foods.print(0));

	}

}
