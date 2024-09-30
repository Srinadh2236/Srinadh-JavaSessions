package Accmod2;

import Accmod1.car;

public class honda extends car { // accmod2 package car class not availble so it show the what are car class available to import to access the car properties.
	

	public static void main(String[] args) {
		
		//diffrent package with sub class of  accmod1 car is parent accmod2 honda is a child.
		
	// access the car class properties
		
		honda h = new honda();
		// i can access only public and protected .
		
		h.color="blue";  // only protected and public we can access child of diff package class parent properties.
		h.price=15;
		//h.nam  this is default we can't access 
		//h.chas  and this is also private 
		
		
		// different package with subclass  
				// child is honda and parent is accmod1 package car class is a parent.
		
		// h.m1defau // we cant acces in different package 
		h.m2Public();
		h.m3Protected();
		//h.m4priv   // private we cant access
		
		//car c = new car(); protected constructor in accmod2=1 car class
		
	}

}
