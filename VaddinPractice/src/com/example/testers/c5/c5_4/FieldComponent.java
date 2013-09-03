package com.example.testers.c5.c5_4;


import com.example.testers.Tester;
import com.google.gwt.layout.client.Layout;
import com.vaadin.data.validator.StringLengthValidator;
import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Button.ClickEvent;

public class FieldComponent extends Tester {

	public FieldComponent(UI ui) {
		super(ui);
	}

	@Override
	public void test() {
		VerticalLayout verticalLayout = new VerticalLayout();
		
		final TextField field = new TextField("Name");
		field.addValidator(new StringLengthValidator(
			    "The name must be 1-10 letters (was {0})",
			    1, 10, true));
		verticalLayout.addComponent(field);
		field.setValidationVisible(false);
		field.setImmediate(true);
		
		final Button button = new Button("Validate");
		button.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				field.setValidationVisible(false);
				try {
					field.validate();
				} catch (Exception e) {
					field.setValidationVisible(true);
					Notification.show(e.getMessage());
				}
			}
		});
		
		verticalLayout.addComponent(button);
		
		ui.setContent(verticalLayout);
	}

}
