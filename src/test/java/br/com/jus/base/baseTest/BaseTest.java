package br.com.jus.base.baseTest;

import br.com.jus.config.Configuration;
import br.com.jus.config.ConfigurationManager;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import org.junit.Before;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.Matchers.lessThan;

public class BaseTest implements Constants {

    protected static Configuration configuration;

    @Before
    public void setup() {
        configuration = ConfigurationManager.configuration();

        RequestSpecBuilder reqBuilder = new RequestSpecBuilder();
        reqBuilder.setContentType(APP_CONTENT_TYPE);
        RestAssured.requestSpecification = reqBuilder.build();

        ResponseSpecBuilder resBuilder = new ResponseSpecBuilder();
        resBuilder.expectResponseTime(lessThan(MAX_TIMEOUT), TimeUnit.SECONDS);
        RestAssured.responseSpecification = resBuilder.build();

        determineLog();
    }

    private static void determineLog() {
        if (configuration.logAll()) {
            RestAssured.filters(new RequestLoggingFilter(), new RequestLoggingFilter());
        } else {
            RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
        }
    }
}


