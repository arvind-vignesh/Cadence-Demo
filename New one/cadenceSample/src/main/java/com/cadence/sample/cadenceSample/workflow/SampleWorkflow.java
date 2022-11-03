package com.cadence.sample.cadenceSample.workflow;

import com.uber.cadence.workflow.WorkflowMethod;



public interface SampleWorkflow {
    static final String TASK_LIST = "EmployeeWorkFlow";
    @WorkflowMethod(executionStartToCloseTimeoutSeconds = 3600,taskList = TASK_LIST)
    void initiateProcess();

}
