/*
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

package com.sun.faces.test.servlet30.facelets;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "repeatPropertyActionListenerBean")
@RequestScoped
public class RepeatPropertyActionListenerBean implements Serializable {

    private List<RepeatPropertyActionListenerItem> items;

    public RepeatPropertyActionListenerBean() {
        items = new ArrayList<RepeatPropertyActionListenerItem>();
        items.add(new RepeatPropertyActionListenerItem("0"));
        items.add(new RepeatPropertyActionListenerItem("1"));
        items.add(new RepeatPropertyActionListenerItem("2"));
    }

    public List<RepeatPropertyActionListenerItem> getItems() {
        return items;
    }
}
