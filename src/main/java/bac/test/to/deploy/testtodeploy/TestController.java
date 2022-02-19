package bac.test.to.deploy.testtodeploy;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController implements PhraseApi{

    @Override
    public ResponseEntity<PhraseResponse> getPhrase() {
        PhraseResponse response = new PhraseResponse();
        return ResponseEntity.ok(response.phrase("Survival is the art of knowing how to swim in uncharted waters :) "));
    }
}
