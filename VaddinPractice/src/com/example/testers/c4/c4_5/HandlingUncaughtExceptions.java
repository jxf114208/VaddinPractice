package com.example.testers.c4.c4_5;

import javax.xml.transform.TransformerException;

import com.example.testers.Tester;
import com.vaadin.server.DefaultErrorHandler;
import com.vaadin.server.ErrorEvent;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Button.ClickEvent;

public class HandlingUncaughtExceptions extends Tester {

	public HandlingUncaughtExceptions(UI ui) {
		super(ui);
	}

	@Override
	public void test() {
		
		// Here's some code that produces an uncaught exception 
		final VerticalLayout layout = new VerticalLayout();
		final Button button = new Button("Click me", new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				((String)null).length();// Null-pointer exception
			}
		});
		layout.addComponent(button);
		
		// Configure the error handler for the UI
		UI.getCurrent().setErrorHandler(new DefaultErrorHandler(){
			@Override
			public void error(ErrorEvent event) {
				// Find the final cause
				String cause = "<b>The click failed because:</b><br/>";
				for (Throwable t = event.getThrowable();  t != null; t=t.getCause()) {
					if (t.getCause() != null) {// We're at final cause
						cause += t.getClass().getName() + "<br>";
					}
				}
				
				// Display the error message in a custom fashion
				layout.addComponent(new Label(cause,ContentMode.HTML));
				
				// Do the default error handling (optional)
				doDefault(event);
			}
		});
		layout.setSizeFull();
		ui.setContent(layout);
	}

}
