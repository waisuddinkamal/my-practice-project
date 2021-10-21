package stepDefinitions;

import org.junit.After;

import core.Base;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Initializer extends Base {

	@Before
	public void beforeHooks(Scenario scenario) {
		browser(); // this is a browser method from Base class
		openBrowser(); // this is a method from Base class

	}

	@After
	public void afterHooks(Scenario secnScenario) {
		tearDown(); // this is a method from Base class

	}

}
