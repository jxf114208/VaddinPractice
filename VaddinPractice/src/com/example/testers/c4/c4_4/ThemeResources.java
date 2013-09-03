package com.example.testers.c4.c4_4;

import com.example.testers.Tester;
import com.vaadin.server.ThemeResource;
import com.vaadin.ui.Image;
import com.vaadin.ui.Link;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

public class ThemeResources extends Tester {

	public ThemeResources(UI ui) {
		super(ui);
	}

	@Override
	public void test() {
		VerticalLayout verticalLayout = new VerticalLayout();
		
		// A theme resource in the current theme ("vaddinpractice")
		// Located in: VAADIN/themes/vaddinpractice/img/Switch.png
		ThemeResource resource = new ThemeResource("img/Switch.png");
		
		Image image = new Image("Switch.png",resource);
		
		Link link = new Link("Switch.png", resource);
		
		verticalLayout.addComponents(image,link);
		
		ui.setContent(verticalLayout);

	}

}
