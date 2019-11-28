package com.tyss.didemo;

import com.tyss.didemo.dao.I;
import com.tyss.didemo.util.Manager;

public class MainClass {

	public MainClass() {
		
		Manager manager = new Manager();
		I i = manager.getI();
		i.m1();
		i.m2();
		
	}
}
