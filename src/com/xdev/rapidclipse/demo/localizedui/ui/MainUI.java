
package com.xdev.rapidclipse.demo.localizedui.ui;

import java.util.Locale;

import com.vaadin.annotations.Push;
import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.shared.communication.PushMode;
import com.vaadin.shared.ui.ui.Transport;
import com.vaadin.ui.UI;
import com.xdev.ui.XdevUI;
import com.xdev.ui.navigation.XdevNavigator;

@Push(value = PushMode.MANUAL, transport = Transport.LONG_POLLING)
@Theme("rapidclipse_demo_localizedUI")
public class MainUI extends XdevUI {
	public MainUI() {
		super();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void init(final VaadinRequest request) {
		this.initUI();

		// Check if the UI is available
		if (UI.getCurrent() != null) {
			// In case of a browser refresh action the stored locale in the
			// session will be set again
			UI.getCurrent().setLocale(UI.getCurrent().getSession().getAttribute(Locale.class));
		}
	}

	/*
	 * WARNING: Do NOT edit!<br>The content of this method is always regenerated
	 * by the UI designer.
	 */
	// <generated-code name="initUI">
	private void initUI() {
		this.navigator = new XdevNavigator(this, this);

		this.navigator.addView("", MainView.class);
		this.navigator.addView("secondview", WndSecondView.class);

		this.setSizeFull();
	} // </generated-code>

	// <generated-code name="variables">
	private XdevNavigator navigator; // </generated-code>
}