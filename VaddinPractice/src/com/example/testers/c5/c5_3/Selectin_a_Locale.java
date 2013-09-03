package com.example.testers.c5.c5_3;

import java.io.Serializable;
import java.util.Locale;

import com.example.testers.Tester;
import com.google.gwt.user.client.ui.FocusListener;
import com.google.gwt.user.client.ui.Widget;
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.data.Property.ValueChangeListener;
import com.vaadin.shared.ui.datefield.Resolution;
import com.vaadin.ui.Button;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.InlineDateField;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Selectin_a_Locale extends Tester implements Serializable {

	public Selectin_a_Locale(UI ui) {
		super(ui);
	}

	@Override
	public void test() {
		HorizontalLayout layout = new HorizontalLayout();

		// The locale in which we want to have the language
		// selection list
		Locale displayLocale = Locale.ENGLISH;

		// All known locales
		Locale[] locales = Locale.getAvailableLocales();

		// Allow selecting a language. We are in a constructor of a
		// CustomComponent, so preselecting the current
		// language of the application can not be done before
		// this (and the selection) component are attached to
		// the application.
		final ComboBox select = new ComboBox("Select a language") {
			@Override
			public void attach() {
				setValue(getLocale());
			}
		};
		for (int i = 0; i < locales.length; i++) {
			select.addItem(locales[i]);
			select.setItemCaption(locales[i], locales[i].getDisplayName(displayLocale));

			// Automatically select the current locale
			if (locales[i].equals(ui.getLocale()))
				select.setValue(locales[i]);
		}
		layout.addComponent(select);

		// Locale code of the selected locale
		final Label localeCode = new Label("");
		layout.addComponent(localeCode);

		// A date field which language the selection will change
		final InlineDateField date = new InlineDateField("Calendar in the selected language");
		date.setResolution(Resolution.SECOND);
		layout.addComponent(date);

		// Handle language selection
		select.addValueChangeListener(new ValueChangeListener() {

			@Override
			public void valueChange(ValueChangeEvent event) {
				Locale locale = (Locale) select.getValue();
				date.setLocale(locale);
				localeCode.setValue("Locale code: " + locale.getLanguage() + "_" + locale.getCountry());
			}

		});
		select.setImmediate(true);
		
		final Button button = new Button("test", new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				Locale locale = (Locale) select.getValue();
				localeCode.setValue("Locale code: " + locale.getLanguage() + "_" + locale.getCountry());
			}
		});
		layout.addComponent(button);

		ui.setContent(layout);
	}

}
