package com.cadence.sample.cadenceSample.workflow;

import com.cadence.sample.cadenceSample.POJO.*;
import com.cadence.sample.cadenceSample.activity.Activities;
import com.cadence.sample.cadenceSample.workflow.SampleWorkflow;
import com.uber.cadence.activity.ActivityOptions;
import com.uber.cadence.workflow.Workflow;

import java.time.Duration;

public class SampleWorkflowImpl implements SampleWorkflow {

    private final ActivityOptions options =
            new ActivityOptions.Builder().setScheduleToCloseTimeout(Duration.ofHours(1)).build();
    private final Activities activities = Workflow.newActivityStub(Activities.class,options);


    @Override
    public void initiateProcess() {
        Employee employee = new Employee();
        Asset asset=  activities.AssetInfo();
        employee.setAsset(asset);
        Benefits benefits = activities.Benefits();
        employee.setBenefits(benefits);
        Compensation compensation = activities.Compensation();
        employee.setCompensation(compensation);
        activities.EmailNotification();
        System.out.println(activities.FinanceInfo());
        Payroll payroll = activities.PayrollInfo();
        employee.setPayroll(payroll);
        System.out.println(employee.toString());


    }
}
