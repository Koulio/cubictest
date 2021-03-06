/*******************************************************************************
 * Copyright (c) 2005, 2010 Stein K. Skytteren and Christian Schwarz
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Stein K. Skytteren and Christian Schwarz - initial API and implementation
 *******************************************************************************/
package org.cubictest.exporters.selenium.launch;

import org.cubictest.export.utils.exported.ExportUtils;
import org.cubictest.exporters.selenium.launch.RunnerParameters;
import org.cubictest.exporters.selenium.runner.SeleniumRunnerConfiguration;
import org.cubictest.model.Test;

public class RunnerLaunchConfigurationDelegate extends LaunchConfigurationDelegate {

	protected LaunchTestRunner getCubicTestRunnable(RunnerParameters parameters, SeleniumRunnerConfiguration config) {
		return new LaunchTestRunner(parameters, config);
	}


	@Override
	protected void verifyPreconditions(RunnerParameters parameters, SeleniumRunnerConfiguration config) {
		final Test test = parameters.test;
		if (!ExportUtils.testIsOkForExport(test)) {
			parameters.display.syncExec(new Runnable() {
				public void run() {
					ExportUtils.showTestNotOkForExportMsg(test);
				}
			});
			ExportUtils.throwTestNotOkForExportException(test);
		}
	}
}
