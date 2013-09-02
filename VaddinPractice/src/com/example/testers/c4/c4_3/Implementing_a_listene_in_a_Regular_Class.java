package com.example.testers.c4.c4_3;

import com.example.testers.c4.Tester;
import com.vaadin.ui.UI;

public class Implementing_a_listene_in_a_Regular_Class extends Tester {

	public Implementing_a_listene_in_a_Regular_Class(UI ui) {
		super(ui);
	}

	@Override
	public void test() {
		MyComposite myComposite = new MyComposite();
		ui.setContent(myComposite);
	}
}
