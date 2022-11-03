package com.cadence.sample.cadenceSample.activity;

import com.cadence.sample.cadenceSample.POJO.Asset;
import com.cadence.sample.cadenceSample.POJO.Benefits;
import com.cadence.sample.cadenceSample.POJO.Compensation;
import com.cadence.sample.cadenceSample.POJO.Payroll;
import com.cadence.sample.cadenceSample.activity.Activities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ActivityImpl implements Activities {

    @Autowired RestTemplate restTemplate;

    @Override
    public Asset AssetInfo() {
       ResponseEntity responseEntity =  restTemplate.getForEntity("http://localhost:8085/asset",ResponseEntity.class);
        return (Asset) responseEntity.getBody();
    }

    @Override
    public Benefits Benefits() {
        ResponseEntity responseEntity =  restTemplate.getForEntity("http://localhost:8087/benefit",ResponseEntity.class);
        return (Benefits) responseEntity.getBody();
    }

    @Override
    public Compensation Compensation() {
        ResponseEntity responseEntity =  restTemplate.getForEntity("http://localhost:8086/comp",ResponseEntity.class);
        return (Compensation) responseEntity.getBody();
    }

    @Override
    public void EmailNotification() {
        System.out.println("Email Notification has been sent");
    }

    @Override
    public Boolean FinanceInfo() {
        ResponseEntity responseEntity =  restTemplate.getForEntity("http://localhost:8089/finance",ResponseEntity.class);
        return (Boolean) responseEntity.getBody();
    }

    @Override
    public ResponseEntity HRInfo() {
        return null;
    }

    @Override
    public Payroll PayrollInfo() {
        ResponseEntity responseEntity =  restTemplate.getForEntity("http://localhost:9092/payroll",ResponseEntity.class);
        return (Payroll) responseEntity.getBody();
    }
}
