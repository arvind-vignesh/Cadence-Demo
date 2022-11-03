package com.cadence.sample.cadenceSample;

import com.uber.cadence.workflow.WorkflowMethod;

import static com.cadence.sample.cadenceSample.CadenceSampleApplication.TASK_LIST;

public interface SampleWorkflow {

    @WorkflowMethod(executionStartToCloseTimeoutSeconds = 3600,taskList = TASK_LIST)
    void initiateProcess();

}
