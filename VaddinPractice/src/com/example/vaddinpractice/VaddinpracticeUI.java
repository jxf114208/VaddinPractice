package com.example.vaddinpractice;

import java.util.Locale;

import com.example.testers.c4_3.UsingAnonymousClasses;
import com.example.testers.c4_4.ClassLoaderResources;
import com.example.testers.c4_4.FileResources;
import com.example.testers.c4_4.StreamResources;
import com.example.testers.c4_4.ThemeResources;
import com.example.testers.c4_5.HandlingUncaughtExceptions;
import com.example.testers.c4_6.NotificationsTester;
import com.vaadin.annotations.Theme;
import com.vaadin.server.Page;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinService;
import com.vaadin.server.VaadinSession;
import com.vaadin.ui.UI;

@SuppressWarnings("serial")
@Theme("vaddinpractice")
public class VaddinpracticeUI extends UI {

	@Override
	protected void init(VaadinRequest request) {
		// Set the default locale of the UI
		UI.getCurrent().setLocale(Locale.ENGLISH);
		
		// Set the page title (window or tab caption)
		Page.getCurrent().setTitle("My Page");
		// Set a session attribute
		VaadinSession.getCurrent().setAttribute("myattrib", "hello");
		
		// Access the HTTP service parameters
		VaadinService.getCurrent().getBaseDirectory();
		
		
		new NotificationsTester(this).test();
		
	}
	
}