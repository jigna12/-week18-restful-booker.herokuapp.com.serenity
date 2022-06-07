package com.heroukuapp.testbase;

import com.heroukuapp.constants.Path;
import com.heroukuapp.utils.PropertyReader;
import io.restassured.RestAssured;
import org.junit.BeforeClass;


public class BookingTestBase {
    public static PropertyReader propertyReader;

    @BeforeClass
    public static void init() {
        propertyReader = PropertyReader.getInstance();
        RestAssured.baseURI = propertyReader.getProperty("baseUrl");
        //RestAssured.port = Integer.parseInt(propertyReader.getProperty("port"));
        RestAssured.basePath = Path.BOOKING;
    }

}
