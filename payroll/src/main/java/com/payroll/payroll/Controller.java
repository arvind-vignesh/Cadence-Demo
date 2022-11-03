package com.payroll.payroll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller {

        @Autowired
        RestTemplate restTemplate;

        @RequestMapping(value = "/payroll", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
        public ResponseEntity getPayroll()
        {
                Payroll payroll = new Payroll();
                payroll.setOther("475");
                payroll.setBasePay("15622");
                payroll.setPF("478513");
                Payroll payroll1 = new Payroll();
                payroll.setOther("4751");
                payroll.setBasePay("1622");
                payroll.setPF("4785");
               ResponseEntity responseEntity= restTemplate.getForEntity("http://localhost:8086/designation",String.class);
               String Designation = (String) responseEntity.getBody();
               if (Designation.equals("Senior Dev"))
                       return new ResponseEntity<>(payroll1,HttpStatus.OK);

                return new ResponseEntity<>(payroll,HttpStatus.OK);
        }
}
