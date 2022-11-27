package StepDefinitions;

import Utilities.GWD;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void before()
    {
        System.out.println("***************** TEST SCENARIOS STARTED! *****************");
    }

    @After
    public void after()
    {
        System.out.println("***************** TEST SCENARIOS FINISHED! *****************");
        GWD.quitDriver();
    }
}