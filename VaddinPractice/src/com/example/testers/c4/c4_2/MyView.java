package com.example.testers.c4.c4_2;

import com.vaadin.ui.Button;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

public class MyView extends CustomComponent {
	
	private TextField entry = new TextField("Enter this");
	private Label display = new Label("See this");
	private Button click = new Button("Click this");
	
	
	public MyView() {
		VerticalLayout verticalLayout = new VerticalLayout();
		
		verticalLayout.addComponents(entry,display,click);
		
		setCompositionRoot(verticalLayout);
		
		setSizeFull();
	}
}
