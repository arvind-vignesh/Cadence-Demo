package com.compensation.compensation;


import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
        @RequestMapping(value = "/comp",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
        public ResponseEntity getCompensation()
        {
                Compensation compensation = new Compensation();
                Stocks stocks = new Stocks();
                stocks.setCurrency("USD");
                stocks.setUnit("4521");
                stocks.setPrice("45871");
                compensation.setStocks(stocks);
                compensation.setBonus("47851");
                return new ResponseEntity<>(compensation, HttpStatus.OK);
        }

        @RequestMapping(value = "/designation",method = RequestMethod.GET)
        public String getdesignation()
        {
                return "Developer-I";
        }
}
