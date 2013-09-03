package com.example.testers.c5.c5_7;

import com.example.testers.Tester;
import com.vaadin.server.ExternalResource;
import com.vaadin.server.ThemeResource;
import com.vaadin.shared.ui.BorderStyle;
import com.vaadin.ui.Link;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

public class LinkFeatures extends Tester {

	public LinkFeatures(UI ui) {
		super(ui);
	}

	@Override
	public void test() {
		VerticalLayout layout = new VerticalLayout();

		// Textual link
		Link link = new Link("Click Me!", new ExternalResource("http://vaadin.com/"));
		link.setIcon(new ThemeResource("img/Switch.png"));
		// Open the URL in a popup
		link.setTargetName("_blank");
		link.setTargetBorder(BorderStyle.NONE);
		link.setTargetHeight(300);
		link.setTargetWidth(400);
		layout.addComponent(link);

		ui.setContent(layout);
	}

}
