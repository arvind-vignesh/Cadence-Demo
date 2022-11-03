package com.training.training;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
        @RequestMapping(value = "/training",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)

        public Training ModifyTraining(@RequestBody Training training)
        {
                training.setUrl("Changed Url");
                training.setCourseName("Changed CourseNAme");
                return training;
        }
}
