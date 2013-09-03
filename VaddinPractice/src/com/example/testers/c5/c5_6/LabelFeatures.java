package com.example.testers.c5.c5_6;

import com.example.testers.Tester;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;

public class LabelFeatures extends Tester {

	public LabelFeatures(UI ui) {
		super(ui);
	}

	@Override
	public void test() {
//		VerticalLayout verticalLayout = new VerticalLayout();
//		verticalLayout.setSizeFull();
		// A container with a defined width. The default content layout
		// of Panel is VerticalLayout, which has 100% default width.
//		Panel panel = new Panel("Panel Containing a Label");
//		panel.setWidth("300px");
//		verticalLayout.addComponent(panel);
//
//		Label label = new Label("This is a Label inside a Panel. There is " + "enough text in the label to make the text " + "wrap when it <exceeds> <html> the width of the panel.");
//		panel.setContent(label);

		// use of  Label in different modes.
//		GridLayout labelgrid = new GridLayout(2, 1);
//		labelgrid.setSizeFull();
//		labelgrid.addComponent(new Label("PREFORMATTED"));
//		labelgrid.addComponent(new Label("This is a preformatted label.\n" + "The newline character \\n breaks the line.", ContentMode.PREFORMATTED));
//
//		labelgrid.addComponent(new Label("TEXT"));
//		labelgrid.addComponent(new Label("This is a label in (plain) text mode", ContentMode.TEXT));
//
//		labelgrid.addComponent(new Label("HTML"));
//		labelgrid.addComponent(new Label("<i>This</i> is an <b>HTML</b> formatted label", ContentMode.HTML));
//		verticalLayout.addComponent(labelgrid);
		
		
		// A wide component bar
		HorizontalLayout horizontal = new HorizontalLayout();
		horizontal.setWidth("100%");
		 
		// Have a component before the gap (a collapsing cell)
		Button button1 = new Button("I'm on the left");
		horizontal.addComponent(button1);
		 
		// An expanding gap spacer
		Label expandingGap = new Label();
		expandingGap.setWidth("100%");
		horizontal.addComponent(expandingGap);
		horizontal.setExpandRatio(expandingGap, 1.0f);
		 
		// A component after the gap (a collapsing cell)
		Button button2 = new Button("I'm on the right");
		horizontal.addComponent(button2);

		ui.setContent(horizontal);
	}
}
