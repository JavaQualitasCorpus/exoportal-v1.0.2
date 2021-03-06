/*****************************************************************************
 * Copyright (C) NanoContainer Organization. All rights reserved.            *
 * ------------------------------------------------------------------------- *
 * The software in this package is published under the terms of the BSD      *
 * style license a copy of which has been included with this distribution in *
 * the LICENSE.txt file.                                                     *
 *                                                                           *
 * Original code by James Strachan and Mauro Talevi                          *
 *****************************************************************************/
package org.exoplatform.container.jmx;

import org.picocontainer.PicoRegistrationException;

/**
 * A registration exception caused trying to register the component with JMX
 *
 * @author James Strachan
 * @author Mauro Talevi
 * @author Jeppe Cramon
 * @version $Revision: 1.2 $
 */
public class MX4JRegistrationException extends PicoRegistrationException {

	public MX4JRegistrationException(String message) {
		super(message);
	}
	
	
	public MX4JRegistrationException(String message, Exception cause) {
		super(message, cause);
	}
	
	public MX4JRegistrationException(Throwable cause) {
		super(cause);
	}
}