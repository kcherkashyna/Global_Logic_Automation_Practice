package utils.phptravels;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.ResponseSpecification;

public class SiteResponse {

    public ResponseSpecification responseSpec = new ResponseSpecBuilder().
            expectContentType(ContentType.JSON).
            build();
}
