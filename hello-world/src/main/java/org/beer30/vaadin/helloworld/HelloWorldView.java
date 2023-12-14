package org.beer30.vaadin.helloworld;

import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

/**
 * @author tsweets
 * 12/12/23 - 2:32 PM
 */
@Route("hello-world")
public class HelloWorldView extends VerticalLayout {

    public HelloWorldView() {
        add(new Paragraph("Hello Tony"));
    }

}
