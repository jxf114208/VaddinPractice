package com.example.testers.c5.c5_9;

import java.util.Date;

import com.example.testers.Tester;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.PopupDateField;
import com.vaadin.ui.RichTextArea;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.UI;

public class TextAreaFeatures extends Tester {

	public TextAreaFeatures(UI ui) {
		super(ui);
	}

	@Override
	public void test() {
		HorizontalLayout layout = new HorizontalLayout();

		TextArea area1 = new TextArea("Wrapping");
		area1.setWordwrap(true); // The default
		area1.setValue("A quick brown fox jumps over the lazy dog");

		TextArea area2 = new TextArea("Nonwrapping");
		area2.setWordwrap(false);
		area2.setValue("Victor jagt zw&ouml;lf Boxk&auml;mpfer quer " + "&uuml;ber den Sylter Deich");
		
		// Create a rich text area
		final RichTextArea rtarea = new RichTextArea();
		rtarea.setCaption("My Rich Text Area");

		// Set initial content as HTML
		rtarea.setValue("<h1>Hello</h1>\n" +
		    "<p>This rich text area contains some text.</p>");
		
		layout.addComponents(area1,area2,rtarea);
		
		// Create a DateField with the default style
		PopupDateField date = new PopupDateField();
		 
		// Set the date and time to present
//		date.setValue(new Date());
		date.setDateFormat("yyyy-MM-dd");
		
		// Set the prompt
		date.setInputPrompt("Select a date");
		        
		// Set width explicitly to accommodate the prompt
		date.setWidth("10em");
		
		layout.addComponent(date);

		ui.setContent(layout);
	}

}
