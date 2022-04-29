package com.Runner;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.AdactinBaseClass.BaseClass;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\Featuree",glue="com\\StepDefinition")

public class RunnerTest {
public static WebDriver driver;

@Before
public void setup(){
	driver= BaseClass.getBrowser("chrome");
}
	


@After
public void tearDown(){
driver.close();
}


}