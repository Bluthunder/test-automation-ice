package com.ch.azo.common.base;

import org.testng.annotations.BeforeSuite;
import com.ch.report.utils.AbstractTestCaseReport;

public abstract class AzoAbstractTest extends AbstractTestCaseReport {

	@BeforeSuite(alwaysRun = true, dependsOnMethods = "setUpRunConfig")
	public void beforeSuiteNew() {
		System.out.println("Override capabilities if required");
		if(runConfig != null && !runConfig.getCapabilities().asMap().isEmpty()) {
			if(runConfig.getBrowser() != null && runConfig.getBrowser().equalsIgnoreCase("firefox")) {
				//MutableCapabilities mutableCapabilities = runConfig.getCapabilities();
				//FirefoxOptions options = new FirefoxOptions();
				//options.addArguments(arguments)
				//mutableCapabilities.merge(options);
			}
		}
	}
}
