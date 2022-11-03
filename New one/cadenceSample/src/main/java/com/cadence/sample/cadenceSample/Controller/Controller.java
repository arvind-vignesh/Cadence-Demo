package com.cadence.sample.cadenceSample.Controller;


import com.cadence.sample.cadenceSample.workflow.SampleWorkflow;
import com.uber.cadence.WorkflowExecution;
import com.uber.cadence.client.WorkflowClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/workflow")
public class Controller {

    private final WorkflowClient workflowClient;

    public Controller(WorkflowClient workflowClient) {
        this.workflowClient = workflowClient;
    }
    @GetMapping
    public void startWorkflow() {
        SampleWorkflow workflow = workflowClient.newWorkflowStub(SampleWorkflow.class);
        WorkflowExecution execution = WorkflowClient.start(workflow::initiateProcess);

    }
}
