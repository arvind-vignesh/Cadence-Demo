package com.cadence.sample.cadenceSample.activity;

import com.cadence.sample.cadenceSample.POJO.Asset;
import com.cadence.sample.cadenceSample.POJO.Benefits;
import com.cadence.sample.cadenceSample.POJO.Compensation;
import com.cadence.sample.cadenceSample.POJO.Payroll;
import com.uber.cadence.activity.ActivityMethod;
import org.springframework.http.ResponseEntity;

public interface Activities {
    public Asset AssetInfo();
    public Benefits Benefits();
    public Compensation Compensation();
    public void EmailNotification();
    public Boolean FinanceInfo();
    public ResponseEntity HRInfo();
    public Payroll PayrollInfo();

}
