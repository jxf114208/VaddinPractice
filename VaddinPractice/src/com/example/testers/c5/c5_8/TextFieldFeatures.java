package com.example.testers.c5.c5_8;

import com.example.testers.Tester;
import com.vaadin.event.FieldEvents.TextChangeEvent;
import com.vaadin.event.FieldEvents.TextChangeListener;
import com.vaadin.ui.AbstractTextField.TextChangeEventMode;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

public class TextFieldFeatures extends Tester {

	public TextFieldFeatures(UI ui) {
		super(ui);
	}

	@Override
	public void test() {
		VerticalLayout layout = new VerticalLayout();

		// Create a text field
		// final TextField tf = new TextField("A Field");
		// layout.addComponent(tf);
		//
		// // Put some initial content in it
		// tf.setValue("Stuff in the field");
		//
		// // Handle changes in the value
		// tf.addValueChangeListener(new ValueChangeListener() {
		//
		// @Override
		// public void valueChange(ValueChangeEvent event) {
		// // Assuming that the value type is a String
		// String value = tf.getValue();
		//
		// // Do something with the value
		// Notification.show("Value is:" + value);
		// }
		// });
		// tf.setImmediate(true);

		// Have an initial data model. As Double is unmodificable and
		// doesn't support assignment from String, the object is
		// reconstructed in the wrapper when the value is changed.
		// Double trouble = 42.0;
		//
		// // Wrap it in a property data source
		// final ObjectProperty<Double> property = new
		// ObjectProperty<Double>(trouble);
		//
		// // Create a text field bound to it
		// // (StringToDoubleConverter is used automatically)
		// TextField tf = new TextField("The Answer", property);
		// tf.setMaxLength(5);
		// tf.setImmediate(true);
		//
		// // Show that the value is really written back to the
		// // data source when edited by user.
		// Label feedback = new Label(property);
		// feedback.setCaption("The Value");
		//
		// layout.addComponents(tf,feedback);

		// Create a text field without setting its value
		// TextField tf = new TextField("Field Energy (J)");
		// tf.setImmediate(true);
		// tf.setNullRepresentation("-- null-point energy --");
		// layout.addComponent(tf);
		//
		// // The null value is actually the default
		// tf.setValue(null);
		//
		// // Allow user to input the null value by
		// // its representation
		// tf.setNullSettingAllowed(true);
		//
		// // Feedback to see the value
		// Label value = new Label(tf);
		// value.setCaption("Current Value:");
		// layout.addComponent(value);

		// Text field with maximum length
		final TextField tf = new TextField("My Eventful Field");
		tf.setValue("Initial content");
		tf.setMaxLength(20);

		// Counter for input length
		final Label counter = new Label();
		counter.setValue(tf.getValue().length() + " of " + tf.getMaxLength());
		
		// Display the current length interactively in the counter
		tf.addTextChangeListener(new TextChangeListener() {
			
			@Override
			public void textChange(TextChangeEvent event) {
		        int len = event.getText().length();
		        counter.setValue(len + " of " + tf.getMaxLength());
		    }
		});
		
		// This is actually the default
		tf.setTextChangeEventMode(TextChangeEventMode.TIMEOUT);
		
		layout.addComponents(tf,counter);
		ui.setContent(layout);
	}

}
