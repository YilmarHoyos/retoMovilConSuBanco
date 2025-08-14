package com.consubanco.runners;


import io.cucumber.junit.CucumberOptions;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;
import com.consubanco.utils.*;
import java.io.IOException;

@RunWith(RunnerPersonalizado.class)
@CucumberOptions(features = "src/test/resources/features/TheApp.feature",
        glue = "com.consubanco.stepsDefinitios",
        snippets = CucumberOptions.SnippetType.CAMELCASE)
public class TheAppRunner {
    @BeforeSuite
    public static void test() throws InvalidFormatException, IOException {
        DataToFeature.overrideFeatureFiles("src/test/resources/features");
    }
}
