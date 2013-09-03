package com.example.testers.c5.c5_3;

import com.example.testers.Tester;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.Upload;

public class ReadOnlyComponent extends Tester {

	public ReadOnlyComponent(UI ui) {
		super(ui);
	}

	@Override
	public void test() {
		HorizontalLayout layout = new HorizontalLayout();
		
		TextField readwrite = new TextField("Read-Write");
		readwrite.setValue("You can change this");
		readwrite.setReadOnly(false); // The default
		layout.addComponent(readwrite);
//		readwrite.setVisible(false);
//		readwrite.setWidth(400, Unit.PERCENTAGE);
//		readwrite.setWidth("1000px");
		
		TextField readonly = new TextField("Read-Only");
		readonly.setValue("You can't touch this!");
		readonly.setReadOnly(true);
		layout.addComponent(readonly);
		
		Upload upload = new Upload();
//		upload.setCaption("我是上传控件");
//		upload.setButtonCaption("上传");
		layout.addComponent(upload);
		
		ui.setContent(layout);
	}

}
