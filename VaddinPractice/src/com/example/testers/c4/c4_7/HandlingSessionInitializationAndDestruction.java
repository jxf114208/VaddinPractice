package com.example.testers.c4.c4_7;

import javax.servlet.ServletException;

import com.vaadin.server.ServiceException;
import com.vaadin.server.SessionDestroyEvent;
import com.vaadin.server.SessionDestroyListener;
import com.vaadin.server.SessionInitEvent;
import com.vaadin.server.SessionInitListener;
import com.vaadin.server.VaadinServlet;

public class HandlingSessionInitializationAndDestruction extends VaadinServlet implements SessionInitListener,SessionDestroyListener{

	@Override
	protected void servletInitialized() throws ServletException {
		super.servletInitialized();
		
		getService().addSessionInitListener(this);
		getService().addSessionDestroyListener(this);
	}
	
	@Override
	public void sessionDestroy(SessionDestroyEvent event) {
		
	}

	@Override
	public void sessionInit(SessionInitEvent event) throws ServiceException {
		
	}

}
