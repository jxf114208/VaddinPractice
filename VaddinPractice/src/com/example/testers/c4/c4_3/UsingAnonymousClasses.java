package com.example.testers.c4.c4_3;


import com.example.testers.Tester;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.UI;

public class UsingAnonymousClasses extends Tester {

	public UsingAnonymousClasses(UI ui) {
		super(ui);
	}

	@Override
	public void test() {
		final Button button = new Button("Click It!", new Button.ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {
				event.getButton().setCaption("Done!");
			}
		});
		
		ui.setContent(button);
	}

}
