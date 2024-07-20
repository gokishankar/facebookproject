package org.Stepdefinition;

import java.io.IOException;

import org.help.samplebase;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class hooks extends samplebase{
	@Before
	public void browseropen() {
		browserlaunch();
		 launchurl("https://www.facebook.com/");

	}
	
	@After
	public void browserclose(Scenario s) throws IOException  {
		String name=s.getName();
		String sname= name.replace(" ", "_");
		screenshots(sname);
		
		driver.close();

	}
	}


