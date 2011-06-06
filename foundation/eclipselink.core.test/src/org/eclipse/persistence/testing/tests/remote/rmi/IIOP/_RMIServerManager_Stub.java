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
package org.eclipse.persistence.testing.tests.remote.rmi.IIOP;

// Stub class generated by rmic, do not edit.
// Contents subject to change without notice.

import org.eclipse.persistence.sessions.remote.rmi.iiop.RMIRemoteSessionController;
import org.eclipse.persistence.sessions.remote.rmi.iiop._RMIRemoteSessionController_Stub;
import java.rmi.RemoteException;
import java.rmi.UnexpectedException;
import javax.rmi.CORBA.Stub;
import javax.rmi.CORBA.Util;
import org.omg.CORBA.SystemException;
import org.omg.CORBA.portable.ApplicationException;
import org.omg.CORBA.portable.OutputStream;
import org.omg.CORBA.portable.RemarshalException;
import org.omg.CORBA.portable.ServantObject;


public class _RMIServerManager_Stub extends Stub implements RMIServerManager {
	
	private static final String[] _type_ids = {
		"RMI:org.eclipse.persistence.testing.tests.remote.rmi.IIOP.RMIServerManager:0000000000000000"
	};
	
	public String[] _ids() { 
		return _type_ids;
	}
	public RMIRemoteSessionController createRemoteSessionController() throws RemoteException {
		if (!Util.isLocal(this)) {
			try {
				org.omg.CORBA.portable.InputStream in = null;
				try {
					OutputStream out = _request("createRemoteSessionController", true);
					in = _invoke(out);
					return (RMIRemoteSessionController) in.read_Object(_RMIRemoteSessionController_Stub.class);
				} catch (ApplicationException ex) {
					in = ex.getInputStream();
					String id = in.read_string();
					throw new UnexpectedException(id);
				} catch (RemarshalException ex) {
					return createRemoteSessionController();
				} finally {
					_releaseReply(in);
				}
			} catch (SystemException ex) {
				throw Util.mapSystemException(ex);
			}
		} else {
			ServantObject so = _servant_preinvoke("createRemoteSessionController",RMIServerManager.class);
			if (so == null) {
				return createRemoteSessionController();
			}
			try {
				RMIRemoteSessionController result = ((RMIServerManager)so.servant).createRemoteSessionController();
				return (RMIRemoteSessionController)Util.copyObject(result,_orb());
			} catch (Throwable ex) {
				Throwable exCopy = (Throwable)Util.copyObject(ex,_orb());
				throw Util.wrapException(exCopy);
			} finally {
				_servant_postinvoke(so);
			}
		}
	}
}
