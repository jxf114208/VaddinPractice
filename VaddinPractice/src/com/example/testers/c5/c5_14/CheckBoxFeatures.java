package com.example.testers.c5.c5_14;

import com.example.testers.Tester;
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.data.Property.ValueChangeListener;
import com.vaadin.ui.CheckBox;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

public class CheckBoxFeatures extends Tester {

	public CheckBoxFeatures(UI ui) {
		super(ui);
	}

	@Override
	public void test() {
		VerticalLayout layout = new VerticalLayout();

		// A check box with default state (not checked, false).
		final CheckBox checkbox1 = new CheckBox("My CheckBox");
		layout.addComponent(checkbox1);

		// Another check box with explicitly set checked state.
		final CheckBox checkbox2 = new CheckBox("Checked CheckBox");
		checkbox2.setValue(true);
		layout.addComponent(checkbox2);

		// Make some application logic. We use anonymous listener
		// classes here. The above references were defined as final
		// to allow accessing them from inside anonymous classes.
		checkbox1.addValueChangeListener(new ValueChangeListener() {

			@Override
			public void valueChange(ValueChangeEvent event) {
				// Copy the value to the other checkbox.
				checkbox2.setValue(checkbox1.getValue());
			}
		});

		checkbox2.addValueChangeListener(new ValueChangeListener() {

			@Override
			public void valueChange(ValueChangeEvent event) {
				// Copy the value to the other checkbox.
		        checkbox1.setValue(checkbox2.getValue());
			}
		});

		ui.setContent(layout);
	}

}
