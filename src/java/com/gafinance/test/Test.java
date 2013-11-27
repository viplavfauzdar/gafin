/**
 * 
 */
package com.gafinance.test;

import com.gafinance.db.*;
/**
 * @author Viplav
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProjectHome ph = new ProjectHome();		
		Project p = ph.findById(1);
		//Project p = new Project();
		//p.setName("My Project 5");
		//p.setDescription("new project 5!");
		//ph.attachDirty(p); //works
		//ph.attachClean(p); //doesn't work
		//ph.persist(p); //inserts a new row
		ph.delete(p); //works
		//Projects p1 = new Projects(5);
		//Projects p1 = ph.findById(5);
//		p1.setId(5);
		//p1.setName("Hello VIP");
		//p1.setDescription("Hello VIP LOVE!!");
		//ph.persist(p1);
	}

}
