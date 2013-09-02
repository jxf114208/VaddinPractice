package com.example.testers.c4.c4_4;

import java.io.File;

import com.example.testers.c4.Tester;
import com.vaadin.server.FileResource;
import com.vaadin.server.VaadinService;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Image;
import com.vaadin.ui.Link;
import com.vaadin.ui.UI;

public class FileResources extends Tester {

	public FileResources(UI ui) {
		super(ui);
	}

	@Override
	public void test() {
		
		HorizontalLayout horizontalLayout = new HorizontalLayout();
		
		// Find the application directory
		String basepath = VaadinService.getCurrent().getBaseDirectory().getAbsolutePath();

		// Image as a file resource
		FileResource resource = new FileResource(new File(basepath + "/WEB-INF/images/1.png"));
		
		// Show the image in the application
		Image image = new Image("Image from file", resource);
		horizontalLayout.addComponent(image);
		
		// Let the user view the file in browser or download it
		Link link = new Link("Link to the image file", resource);
		horizontalLayout.addComponent(link);
		
		ui.setContent(horizontalLayout);
		
	}

}
