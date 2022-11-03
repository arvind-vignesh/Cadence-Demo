package com.Benefits.benefits;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;

@RestController
public class Controller {
        @RequestMapping(value = "/benefit",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
        public ResponseEntity getBenefits()
        {
                Benefits benefits = new Benefits();
                ArrayList wellBeing = new ArrayList<>();
                wellBeing.set(0,"Sharecare");
                benefits.setWellBeing(wellBeing);
                benefits.setTravel(false);
                Training training = new Training();
                training.setUrl("sampleurl");
                benefits.setTrainings(Collections.singletonList(training));
                return new ResponseEntity<>(benefits, HttpStatus.OK);
        }
}
