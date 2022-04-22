package br.com.jus.base.auth.tests;

import br.com.jus.base.auth.requests.PostAuthRequest;
import org.apache.http.HttpStatus;


public class PostAuthTest
{
    PostAuthRequest postAuthRequest = new PostAuthRequest();

    public String geraToken() throws Exception {
        String token = postAuthRequest.tokenPrivate()
                .then()
                .statusCode(HttpStatus.SC_OK)
        .extract().path("access_token");
        return token;
    }
}
