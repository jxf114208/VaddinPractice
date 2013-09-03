package com.example.testers.c5.c5_3;


import java.util.Locale;

import com.example.testers.Tester;
import com.vaadin.server.ErrorMessage;
import com.vaadin.server.ThemeResource;
import com.vaadin.shared.ui.datefield.Resolution;
import com.vaadin.ui.Button;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.InlineDateField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

public class CommonComponentFeatures extends Tester {

	public CommonComponentFeatures(UI ui) {
		super(ui);
	}

	@Override
	public void test() {
		VerticalLayout layout = new VerticalLayout();
		
		//Caption
		TextField textField1 = new TextField("aaa");
		textField1.addStyleName("in-middle");
		
		// Caption with special Unicode characters
		TextField name = new TextField("\u00A9 Copyright");
		name.addStyleName("on-right");
		
		// Description and Tooltips
		Button button = new Button("I am a button");
		button.setComponentError(new ErrorMessage() {
			
			@Override
			public String getFormattedHtmlMessage() {
				return "aaaaaa";
			}
			
			@Override
			public ErrorLevel getErrorLevel() {
				return ErrorLevel.SYSTEMERROR;
			}
		});
		button.setDescription(
			    "<h2><img src=\"../VAADIN/themes/img/Switch.png\"/>"+
			    "A richtext tooltip</h2>"+
			    "<ul>"+
			    "  <li>Use rich formatting with XHTML</li>"+
			    "  <li>Include images from themes</li>"+
			    "  <li>etc.</li>"+
			    "</ul>");
		
		VerticalLayout layout2 = new VerticalLayout();
		layout2.addComponents(textField1,name,button);
		
		TextField textField2 = new TextField("bbb");
		FormLayout formLayout = new FormLayout();
		formLayout.addComponent(textField2);
		
		//Enabled
		Button button2 = new Button("Enabled");
		Button button3 = new Button("disabled");
		button3.setEnabled(false);
		layout.addComponents(button2,button3);
		
		// Component with an icon from a custom theme
		TextField iconField = new TextField("Icon");
		iconField.setIcon(new ThemeResource("img/Switch.png"));
		layout.addComponent(iconField);
		
		
		//Locale
		// Component for which the locale is meaningful
		InlineDateField date = new InlineDateField("Datum");
		// German language specified with ISO 639-1 language
		// code and ISO 3166-1 alpha-2 country code. 
		date.setLocale(Locale.GERMAN);
		date.setResolution(Resolution.HOUR);
		layout.addComponent(date);
		
		
		layout.addComponents(layout2,formLayout);
		
		ui.setContent(layout);
	}

}
