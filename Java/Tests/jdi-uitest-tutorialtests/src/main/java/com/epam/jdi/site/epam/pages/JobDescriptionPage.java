package com.epam.jdi.site.epam.pages;

import com.epam.jdi.site.epam.sections.AddCVForm;
import com.epam.jdi.uitests.core.interfaces.base.IElement;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Roman_Iovlev on 10/22/2015.
 */
public class JobDescriptionPage extends WebPage {

    @FindBy(css = ".form-constructor")
    public AddCVForm addCVForm;

    @FindBy(name = "captcha")
    public IElement captcha;

}
