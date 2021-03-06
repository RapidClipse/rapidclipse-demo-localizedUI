package com.xdev.rapidclipse.demo.localizedui.ui;

import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.CustomComponent;
import com.xdev.res.StringResourceUtils;
import com.xdev.ui.XdevButton;
import com.xdev.ui.XdevVerticalLayout;
import com.xdev.ui.XdevView;
import com.xdev.ui.navigation.Navigation;

public class WndSecondView extends XdevView {

	/**
	 *
	 */
	public WndSecondView() {
		super();
		this.initUI();
	}

	@Override
	public void enter(final ViewChangeListener.ViewChangeEvent event) {
		super.enter(event);

	}

	/**
	 * Event handler delegate method for the {@link XdevButton} {@link #btnBack}.
	 *
	 * @see Button.ClickListener#buttonClick(Button.ClickEvent)
	 * @eventHandlerDelegate Do NOT delete, used by UI designer!
	 */
	private void btnBack_buttonClick(final Button.ClickEvent event) {
		Navigation.to("").navigate();
	}

	/*
	 * WARNING: Do NOT edit!<br>The content of this method is always regenerated by
	 * the UI designer.
	 */
	// <generated-code name="initUI">
	private void initUI() {
		this.verticalLayout = new XdevVerticalLayout();
		this.btnBack = new XdevButton();

		this.btnBack.setCaption(StringResourceUtils.optLocalizeString("{$btnBack.caption}", this));

		this.btnBack.setWidth(50, Unit.PERCENTAGE);
		this.btnBack.setHeight(-1, Unit.PIXELS);
		this.verticalLayout.addComponent(this.btnBack);
		this.verticalLayout.setComponentAlignment(this.btnBack, Alignment.MIDDLE_CENTER);
		final CustomComponent verticalLayout_spacer = new CustomComponent();
		verticalLayout_spacer.setSizeFull();
		this.verticalLayout.addComponent(verticalLayout_spacer);
		this.verticalLayout.setExpandRatio(verticalLayout_spacer, 1.0F);
		this.verticalLayout.setSizeFull();
		this.setContent(this.verticalLayout);
		this.setSizeFull();

		this.btnBack.addClickListener(event -> this.btnBack_buttonClick(event));
	} // </generated-code>

	// <generated-code name="variables">
	private XdevButton btnBack;
	private XdevVerticalLayout verticalLayout;
	// </generated-code>

}
