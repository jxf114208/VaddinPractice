package com.example.testers.c4_6;

import com.example.testers.Tester;
import com.vaadin.server.Page;
import com.vaadin.server.ThemeResource;
import com.vaadin.shared.Position;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Notification.Type;
import com.vaadin.ui.UI;

public class NotificationsTester extends Tester {

	public NotificationsTester(UI ui) {
		super(ui);
	}

	@Override
	public void test() {
		// a static shorthand
		// Notification.show("caption","description",Type.WARNING_MESSAGE);

		// Notification with default settings for a warning
		Notification notification = new Notification("This is a warning", "<br/>This is the <i>last</i> warning", Type.TRAY_NOTIFICATION, true);
		
		// Customize it
		notification.setDelayMsec(20000);
		notification.setPosition(Position.BOTTOM_RIGHT);
		notification.setStyleName("mystyle");
		notification.setIcon(new ThemeResource("img/Switch.png"));
		
		//Show it in the page
		notification.show(Page.getCurrent());
	}
}
