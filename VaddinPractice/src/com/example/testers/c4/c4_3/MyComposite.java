package com.example.testers.c4.c4_3;

import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.HorizontalLayout;

public class MyComposite extends CustomComponent implements Button.ClickListener{

	private Button button;

	public MyComposite() {
		HorizontalLayout horizontalLayout = new HorizontalLayout();
		
		// Just a single component in this composition
		button = new Button("Do not push this");
		button.addClickListener(this);
		
		horizontalLayout.addComponent(button);
		
		setCompositionRoot(horizontalLayout);
	}

	@Override
	public void buttonClick(ClickEvent event) {
		button.setCaption("Do not push this again");
	}
}
