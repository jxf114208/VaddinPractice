package com.example.testers.c4.c4_2;

import com.example.testers.c4.Tester;
import com.vaadin.ui.UI;

public class CompositingComponents extends Tester {

	public CompositingComponents(UI ui) {
		super(ui);
	}

	@Override
	public void test() {
		MyView myView = new MyView();
		ui.setContent(myView);
	}

}
