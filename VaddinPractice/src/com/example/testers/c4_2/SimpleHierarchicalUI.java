package com.example.testers.c4_2;

import com.example.testers.Tester;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Table;
import com.vaadin.ui.Tree;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;


/**
 * 
 * Figure 4.2. Simple Hierarchical UI
 * @author jxf
 *
 */
public class SimpleHierarchicalUI extends Tester{
	
	public SimpleHierarchicalUI(UI ui) {
		super(ui);
	}

	public void test()
	{
		// The root of the component hierarchy
		VerticalLayout content = new VerticalLayout();
		content.setSizeFull();// Use entire window
		ui.setContent(content);// Attach to the UI

		// Add some component
		content.addComponent(new Label("Hello"));

		// Layout inside layout
		HorizontalLayout horizontalLayout = new HorizontalLayout();
		horizontalLayout.setSizeFull();// Use all available space

		// Couple of horizontally laid out components
		Tree tree = new Tree("My Tree", null);
		horizontalLayout.addComponent(tree);

		Table table = new Table("My table", null);
		table.setSizeFull();
		horizontalLayout.addComponent(table);
		horizontalLayout.setExpandRatio(table, 1);// Expand to fill

		content.addComponent(horizontalLayout);
		content.setExpandRatio(horizontalLayout, 1);// Expand to fill
	}
}
