package com.vigneshsn.springdemoproducer;


import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = SpringDemoProducerApplication.class)
public abstract class BaseTestClass {

    @Autowired EmployeeController employeeController;

    @BeforeEach
    public void setUp() {
        RestAssuredMockMvc.standaloneSetup(employeeController);
    }
}
