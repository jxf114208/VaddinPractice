package com.example.testers.c4.c4_4;

import sun.awt.VerticalBagLayout;

import com.example.testers.c4.Tester;
import com.vaadin.server.StreamResource;
import com.vaadin.ui.Image;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

public class StreamResources extends Tester {

	public StreamResources(UI ui) {
		super(ui);
	}

	@Override
	public void test() {
		VerticalLayout layout = new VerticalLayout();
		// Create an instance of our stream source.
		MyImageSource myImageSource = new MyImageSource();
		
		// Create a resource that uses the stream source and give it a name.
		// The constructor will automatically register the resource in
		// the application.
		StreamResource streamResource = new StreamResource(myImageSource,"myimage.png");
		layout.addComponent(new Image("随机图片",streamResource));
		
		ui.setContent(layout);
	}

}
