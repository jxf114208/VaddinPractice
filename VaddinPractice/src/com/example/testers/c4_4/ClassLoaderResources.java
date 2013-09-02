package com.example.testers.c4_4;

import com.example.testers.Tester;
import com.vaadin.server.ClassResource;
import com.vaadin.ui.Image;
import com.vaadin.ui.Link;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

public class ClassLoaderResources extends Tester {

	public ClassLoaderResources(UI ui) {
		super(ui);
	}

	@Override
	public void test() {
		VerticalLayout verticalLayout = new VerticalLayout();
		
		ClassResource resource = new ClassResource("/router.png");
		
		Image image = new Image("router.png", resource);
		Link link = new Link("router.png", resource);
		
		verticalLayout.addComponents(image,link);
		ui.setContent(verticalLayout);
	}

}
