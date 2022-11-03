package com.cadence.sample.cadenceSample;

import com.uber.cadence.client.WorkflowClient;
import com.uber.cadence.client.WorkflowClientOptions;
import com.uber.cadence.serviceclient.ClientOptions;
import com.uber.cadence.serviceclient.WorkflowServiceTChannel;
import com.uber.cadence.worker.Worker;
import com.uber.cadence.worker.WorkerFactory;

import static com.cadence.sample.cadenceSample.CadenceSampleApplication.TASK_LIST;

public class Sample {
    public Sample() {
    }

    public void process()
    {
//        WorkflowClient workflowClient =
//                WorkflowClient.newInstance(
//                        new WorkflowServiceTChannel(ClientOptions.defaultInstance()),
//                        WorkflowClientOptions.newBuilder().setDomain("test-domain").build());

        WorkerFactory factory = WorkerFactory.newInstance(workflowClient);
        IWo
        final Worker workerForCommonTaskList = factory.newWorker(TASK_LIST);

        workerForCommonTaskList.registerWorkflowImplementationTypes(SampleWorkflowImpl.class);

        Activities activities = new ActivityImpl();
        workerForCommonTaskList.registerActivitiesImplementations(activities);

        factory.start();

//        SampleWorkflow sampleWorkflow = workflowClient.newWorkflowStub(SampleWorkflow.class);
//        sampleWorkflow.initiateProcess();
    }
}
