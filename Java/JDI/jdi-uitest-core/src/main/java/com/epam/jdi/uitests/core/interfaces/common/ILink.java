package com.epam.jdi.uitests.core.interfaces.common;
/*
 * Copyright 2004-2016 EPAM Systems
 *
 * This file is part of JDI project.
 *
 * JDI is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * JDI is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; 
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with JDI. If not, see <http://www.gnu.org/licenses/>.
 */

import com.epam.jdi.uitests.core.interfaces.base.IClickable;
import ru.yandex.qatools.allure.annotations.Step;

import java.net.URL;

/**
 * Created by Roman_Iovlev on 6/10/2015.
 */
public interface ILink extends IClickable, IText {
    /**
     * @return Get link destination
     */
    @Step
    String getReference();

    /**
     * @return Get URL
     */
    @Step
    URL getURL();

    /**
     * @param text Specify expected text
     * @return Wait while link destination contains expected text. Returns link destination
     */
    @Step
    String waitReferenceContains(String text);

    /**
     * @param regEx Specify expected regular expression Text
     * @return Wait while link destination contains expected text. Returns link destination
     */
    @Step
    String waitMatchReference(String regEx);

    /**
     * @return Get links tooltip
     */
    @Step
    String getTooltip();
}