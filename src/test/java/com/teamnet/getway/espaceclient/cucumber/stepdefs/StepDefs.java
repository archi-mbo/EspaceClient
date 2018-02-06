package com.teamnet.getway.espaceclient.cucumber.stepdefs;

import com.teamnet.getway.espaceclient.EspaceClientApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = EspaceClientApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
