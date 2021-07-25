package ru.nspk.demo.test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.FeatureWrapper;
import io.cucumber.testng.PickleWrapper;
import org.testng.annotations.Test;



@CucumberOptions(
        features = { "src/test/resources/features" },
        glue = { "ru.nspk.demo.test.steps" },
        tags = "@addition or @multiplication or @division or @subtraction"
)
public class TestRunner extends AbstractTestNGCucumberTests {

    @Test(groups = "cucumber", description = "Runs Cucumber Scenarios", dataProvider = "scenarios")
    public void runScenario(PickleWrapper pickleWrapper, FeatureWrapper featureWrapper) {
        super.runScenario(pickleWrapper, featureWrapper);
    }

}


