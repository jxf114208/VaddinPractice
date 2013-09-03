package com.example.testers;

import com.vaadin.ui.UI;

public abstract class Tester {

	protected UI ui;

	public Tester(UI ui) {
		super();
		this.ui = ui;
	}
	
	public abstract void test();
}
