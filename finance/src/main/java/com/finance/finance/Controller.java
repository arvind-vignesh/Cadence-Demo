package com.finance.finance;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
        @RequestMapping(value = "/finance",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)

        public Boolean getFinance(@RequestBody Employee employee)
        {

                if (employee.getCompensation()!=null && employee.getStocks()!=null)
                {
                        return true;
                }
                return false;

        }
}
