package com.vigneshsn.springdemoproducer;


import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.verifier.messaging.boot.AutoConfigureMessageVerifier;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK, classes = SpringDemoProducerApplication.class)
@RunWith(SpringRunner.class)
@AutoConfigureMessageVerifier
public abstract class BaseTestClass {

    @Autowired
    EmployeeController employeeController;

    @BeforeEach
    public void setUp() {
        RestAssuredMockMvc.standaloneSetup(employeeController);
    }
}
