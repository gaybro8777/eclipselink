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
 *     Oracle - initial API and implementation from Oracle TopLink
 ******************************************************************************/  
package org.eclipse.persistence.config;

/**
 * Cache coordination protocol persistence property values.
 * 
 * <p>JPA persistence property Usage:
 * 
 * <p><code>properties.add(PersistenceUnitProperties.CacheCoordinationProtocol, CacheCoordinationProtocol.RMI);</code>
 * <p>Property values are case-insensitive.
 * 
 * @see PersistenceUnitProperties#COORDINATION_PROTOCOL
 */
public class CacheCoordinationProtocol {
    public static final String RMI = "rmi";
    public static final String RMIIIOP = "rmi-iiop";
    public static final String JMS = "jms";
    public static final String JMSPublishing = "jms-publishing";
}
