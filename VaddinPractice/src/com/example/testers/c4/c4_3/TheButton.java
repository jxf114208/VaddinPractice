package com.example.testers.c4.c4_3;

import com.vaadin.ui.Button;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.CustomComponent;

public class TheButton extends CustomComponent implements Button.ClickListener {

	private Button oneButton;
	private Button twoButton;

	public TheButton() {
		VerticalLayout verticalLayout = new VerticalLayout();

		oneButton = new Button("Button One", this);
		twoButton = new Button("A Button Too", this);

		verticalLayout.addComponents(oneButton, twoButton);
		setCompositionRoot(verticalLayout);
	}

	@Override
	public void buttonClick(ClickEvent event) {
		// Differentiate targets by event source
		if (event.getButton() == oneButton)
			oneButton.setCaption("Pushed one");
		else if (event.getButton() == twoButton)
			twoButton.setCaption("Pushed too");
	}

}
