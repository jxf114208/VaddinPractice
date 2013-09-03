package com.example.testers.c5.c5_5;

import java.awt.TextField;

import com.example.testers.Tester;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

public class ComponentExtensions extends Tester {

	public ComponentExtensions(UI ui) {
		super(ui);
	}

	@Override
	public void test() {
		VerticalLayout verticalLayout = new VerticalLayout();
		
		TextField textField = new TextField();
		
		// Add a simple extension
//		new CapsLockWarning().extend(textField);
		
		// Add an extension that requires some parameters
//		CSValidator validator = new CSValidator();
//		validator.setRegExp("[0-9]*");
//		validator.setErrorMessage("Must be a number");
//		validator.extend(tf);
		
		ui.setContent(verticalLayout);
	}

}
