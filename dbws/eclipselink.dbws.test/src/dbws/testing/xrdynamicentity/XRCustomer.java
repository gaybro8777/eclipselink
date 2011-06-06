/*******************************************************************************
 * Copyright (c) 1998, 2011 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 and Eclipse Distribution License v. 1.0
 * which accompanies this distribution.
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *     Mike Norman - May 2008, created DBWS test package
 ******************************************************************************/
package dbws.testing.xrdynamicentity;

import org.eclipse.persistence.internal.xr.XRDynamicEntity;
import org.eclipse.persistence.internal.xr.XRDynamicPropertiesManager;

public class XRCustomer extends XRDynamicEntity {

    public static XRDynamicPropertiesManager DPM = new XRDynamicPropertiesManager();

    public XRCustomer() {
        super();
    }

    public XRDynamicPropertiesManager fetchPropertiesManager() {
        return DPM;
    }

}