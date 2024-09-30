package Accmod2;

import Accmod1.car;

public class truck {

	public static void main(String[] args) {
		
		car c = new car();
		
		c.price =15; // only public can access 
		//c.nam // default
		//c.colo //protected
		//c.chas // private  these 3 are we can't access different package with non subclass  we can access only public .
		
		
		
		// different package with non sub class
		
		//c.m1defau		
		c.m2Public(); // we can access only public methods only
		//c.m3protec
		//c.m4private // other package we can't access with non sub class all only public only access,.
		
		
	}

}
