/*******************************************************************************
 * Copyright (c) 2005, 2008 Stein K. Skytteren and Christian Schwarz
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Stein K. Skytteren and Christian Schwarz - initial API and implementation
 *******************************************************************************/
package org.cubictest.export;

import org.eclipse.jface.operation.IRunnableWithProgress;

/**
 * Base interface for test runners.
 * 
 * @author Christian Schwarz
 *
 */
public interface ITestRunner extends IRunnableWithProgress {

	public String getResultMessage();
	
}
