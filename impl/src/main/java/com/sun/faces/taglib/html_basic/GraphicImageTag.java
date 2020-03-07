/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 1997, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

package com.sun.faces.taglib.html_basic;

import jakarta.faces.component.UIComponent;
import jakarta.faces.webapp.UIComponentELTag;
import jakarta.servlet.jsp.JspException;

/*
 * ******* GENERATED CODE - DO NOT EDIT *******
 */

public class GraphicImageTag extends UIComponentELTag {

    // Setter Methods
    // PROPERTY: url
    private jakarta.el.ValueExpression url;

    public void setUrl(jakarta.el.ValueExpression url) {
        this.url = url;
    }

    // PROPERTY: value
    private jakarta.el.ValueExpression value;

    public void setValue(jakarta.el.ValueExpression value) {
        this.value = value;
    }

    // PROPERTY: alt
    private jakarta.el.ValueExpression alt;

    public void setAlt(jakarta.el.ValueExpression alt) {
        this.alt = alt;
    }

    // PROPERTY: dir
    private jakarta.el.ValueExpression dir;

    public void setDir(jakarta.el.ValueExpression dir) {
        this.dir = dir;
    }

    // PROPERTY: height
    private jakarta.el.ValueExpression height;

    public void setHeight(jakarta.el.ValueExpression height) {
        this.height = height;
    }

    // PROPERTY: ismap
    private jakarta.el.ValueExpression ismap;

    public void setIsmap(jakarta.el.ValueExpression ismap) {
        this.ismap = ismap;
    }

    // PROPERTY: lang
    private jakarta.el.ValueExpression lang;

    public void setLang(jakarta.el.ValueExpression lang) {
        this.lang = lang;
    }

    // PROPERTY: library
    private jakarta.el.ValueExpression library;

    public void setLibrary(jakarta.el.ValueExpression library) {
        this.library = library;
    }

    // PROPERTY: longdesc
    private jakarta.el.ValueExpression longdesc;

    public void setLongdesc(jakarta.el.ValueExpression longdesc) {
        this.longdesc = longdesc;
    }

    // PROPERTY: name
    private jakarta.el.ValueExpression name;

    public void setName(jakarta.el.ValueExpression name) {
        this.name = name;
    }

    // PROPERTY: onclick
    private jakarta.el.ValueExpression onclick;

    public void setOnclick(jakarta.el.ValueExpression onclick) {
        this.onclick = onclick;
    }

    // PROPERTY: ondblclick
    private jakarta.el.ValueExpression ondblclick;

    public void setOndblclick(jakarta.el.ValueExpression ondblclick) {
        this.ondblclick = ondblclick;
    }

    // PROPERTY: onkeydown
    private jakarta.el.ValueExpression onkeydown;

    public void setOnkeydown(jakarta.el.ValueExpression onkeydown) {
        this.onkeydown = onkeydown;
    }

    // PROPERTY: onkeypress
    private jakarta.el.ValueExpression onkeypress;

    public void setOnkeypress(jakarta.el.ValueExpression onkeypress) {
        this.onkeypress = onkeypress;
    }

    // PROPERTY: onkeyup
    private jakarta.el.ValueExpression onkeyup;

    public void setOnkeyup(jakarta.el.ValueExpression onkeyup) {
        this.onkeyup = onkeyup;
    }

    // PROPERTY: onmousedown
    private jakarta.el.ValueExpression onmousedown;

    public void setOnmousedown(jakarta.el.ValueExpression onmousedown) {
        this.onmousedown = onmousedown;
    }

    // PROPERTY: onmousemove
    private jakarta.el.ValueExpression onmousemove;

    public void setOnmousemove(jakarta.el.ValueExpression onmousemove) {
        this.onmousemove = onmousemove;
    }

    // PROPERTY: onmouseout
    private jakarta.el.ValueExpression onmouseout;

    public void setOnmouseout(jakarta.el.ValueExpression onmouseout) {
        this.onmouseout = onmouseout;
    }

    // PROPERTY: onmouseover
    private jakarta.el.ValueExpression onmouseover;

    public void setOnmouseover(jakarta.el.ValueExpression onmouseover) {
        this.onmouseover = onmouseover;
    }

    // PROPERTY: onmouseup
    private jakarta.el.ValueExpression onmouseup;

    public void setOnmouseup(jakarta.el.ValueExpression onmouseup) {
        this.onmouseup = onmouseup;
    }

    // PROPERTY: role
    private jakarta.el.ValueExpression role;

    public void setRole(jakarta.el.ValueExpression role) {
        this.role = role;
    }

    // PROPERTY: style
    private jakarta.el.ValueExpression style;

    public void setStyle(jakarta.el.ValueExpression style) {
        this.style = style;
    }

    // PROPERTY: styleClass
    private jakarta.el.ValueExpression styleClass;

    public void setStyleClass(jakarta.el.ValueExpression styleClass) {
        this.styleClass = styleClass;
    }

    // PROPERTY: title
    private jakarta.el.ValueExpression title;

    public void setTitle(jakarta.el.ValueExpression title) {
        this.title = title;
    }

    // PROPERTY: usemap
    private jakarta.el.ValueExpression usemap;

    public void setUsemap(jakarta.el.ValueExpression usemap) {
        this.usemap = usemap;
    }

    // PROPERTY: width
    private jakarta.el.ValueExpression width;

    public void setWidth(jakarta.el.ValueExpression width) {
        this.width = width;
    }

    // General Methods
    @Override
    public String getRendererType() {
        return "jakarta.faces.Image";
    }

    @Override
    public String getComponentType() {
        return "jakarta.faces.HtmlGraphicImage";
    }

    @Override
    protected void setProperties(UIComponent component) {
        super.setProperties(component);
        jakarta.faces.component.UIGraphic graphic = null;
        try {
            graphic = (jakarta.faces.component.UIGraphic) component;
        } catch (ClassCastException cce) {
            throw new IllegalStateException(
                    "Component " + component.toString() + " not expected type.  Expected: jakarta.faces.component.UIGraphic.  Perhaps you're missing a tag?");
        }

        if (url != null) {
            graphic.setValueExpression("url", url);
        }
        if (value != null) {
            graphic.setValueExpression("value", value);
        }
        if (alt != null) {
            graphic.setValueExpression("alt", alt);
        }
        if (dir != null) {
            graphic.setValueExpression("dir", dir);
        }
        if (height != null) {
            graphic.setValueExpression("height", height);
        }
        if (ismap != null) {
            graphic.setValueExpression("ismap", ismap);
        }
        if (lang != null) {
            graphic.setValueExpression("lang", lang);
        }
        if (library != null) {
            graphic.setValueExpression("library", library);
        }
        if (longdesc != null) {
            graphic.setValueExpression("longdesc", longdesc);
        }
        if (name != null) {
            graphic.setValueExpression("name", name);
        }
        if (onclick != null) {
            graphic.setValueExpression("onclick", onclick);
        }
        if (ondblclick != null) {
            graphic.setValueExpression("ondblclick", ondblclick);
        }
        if (onkeydown != null) {
            graphic.setValueExpression("onkeydown", onkeydown);
        }
        if (onkeypress != null) {
            graphic.setValueExpression("onkeypress", onkeypress);
        }
        if (onkeyup != null) {
            graphic.setValueExpression("onkeyup", onkeyup);
        }
        if (onmousedown != null) {
            graphic.setValueExpression("onmousedown", onmousedown);
        }
        if (onmousemove != null) {
            graphic.setValueExpression("onmousemove", onmousemove);
        }
        if (onmouseout != null) {
            graphic.setValueExpression("onmouseout", onmouseout);
        }
        if (onmouseover != null) {
            graphic.setValueExpression("onmouseover", onmouseover);
        }
        if (onmouseup != null) {
            graphic.setValueExpression("onmouseup", onmouseup);
        }
        if (role != null) {
            graphic.setValueExpression("role", role);
        }
        if (style != null) {
            graphic.setValueExpression("style", style);
        }
        if (styleClass != null) {
            graphic.setValueExpression("styleClass", styleClass);
        }
        if (title != null) {
            graphic.setValueExpression("title", title);
        }
        if (usemap != null) {
            graphic.setValueExpression("usemap", usemap);
        }
        if (width != null) {
            graphic.setValueExpression("width", width);
        }
    }

    // Methods From TagSupport
    @Override
    public int doStartTag() throws JspException {
        try {
            return super.doStartTag();
        } catch (Exception e) {
            Throwable root = e;
            while (root.getCause() != null) {
                root = root.getCause();
            }
            throw new JspException(root);
        }
    }

    @Override
    public int doEndTag() throws JspException {
        try {
            return super.doEndTag();
        } catch (Exception e) {
            Throwable root = e;
            while (root.getCause() != null) {
                root = root.getCause();
            }
            throw new JspException(root);
        }
    }

    // RELEASE
    @Override
    public void release() {
        super.release();

        // component properties
        url = null;
        value = null;

        // rendered attributes
        alt = null;
        dir = null;
        height = null;
        ismap = null;
        lang = null;
        library = null;
        longdesc = null;
        name = null;
        onclick = null;
        ondblclick = null;
        onkeydown = null;
        onkeypress = null;
        onkeyup = null;
        onmousedown = null;
        onmousemove = null;
        onmouseout = null;
        onmouseover = null;
        onmouseup = null;
        role = null;
        style = null;
        styleClass = null;
        title = null;
        usemap = null;
        width = null;
    }

    public String getDebugString() {
        return "id: " + getId() + " class: " + this.getClass().getName();
    }

}