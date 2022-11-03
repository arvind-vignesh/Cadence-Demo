package com.cadence.sample.cadenceSample.config;

import com.cadence.sample.cadenceSample.activity.ActivityImpl;
import com.cadence.sample.cadenceSample.workflow.SampleWorkflow;
import com.cadence.sample.cadenceSample.workflow.SampleWorkflowImpl;

import com.uber.cadence.DescribeDomainResponse;
import com.uber.cadence.ListDomainsRequest;
import com.uber.cadence.ListDomainsResponse;
import com.uber.cadence.RegisterDomainRequest;
import com.uber.cadence.serviceclient.IWorkflowService;
import com.uber.cadence.worker.Worker;
import com.uber.cadence.worker.WorkerFactory;
import com.uber.cadence.worker.WorkerOptions;

import org.apache.thrift.TException;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

import static com.cadence.sample.cadenceSample.config.CadenceConfiguration.DOMAIN;


@Component

public class CadenceWorkerStarter {
    private static final Class<?>[] WORKFLOW_IMPLEMENTATION_TYPES = new Class[] { SampleWorkflowImpl.class };
    private static final Object[] ACTIVITY_IMPLEMENTATIONS = new Object[] { new ActivityImpl() };

    private final IWorkflowService workflowService;
    private final WorkerFactory workerFactory;
    private final WorkerOptions workerOptions;

    public CadenceWorkerStarter(IWorkflowService workflowService, WorkerFactory workerFactory, WorkerOptions workerOptions) {
        this.workflowService = workflowService;
        this.workerFactory = workerFactory;
        this.workerOptions = workerOptions;
    }

    @PostConstruct
    public void startWorkerFactory() throws TException {
        if (!domainExists()) {
            registerDomain();
        }

        createWorkers();


        workerFactory.start();
    }

//    @PreDestroy
//    public void shutdownWorkerFactory() {
//
//        workerFactory.shutdown();
//    }

    private void registerDomain() throws TException {
        RegisterDomainRequest request = new RegisterDomainRequest();
        request.setDescription(DOMAIN);
        request.setEmitMetric(false);
        request.setName(DOMAIN);
        request.setWorkflowExecutionRetentionPeriodInDays(2);

        workflowService.RegisterDomain(request);
    }

    private void createWorkers() {
        Worker worker = workerFactory.newWorker(SampleWorkflow.TASK_LIST, workerOptions);

        worker.registerWorkflowImplementationTypes(WORKFLOW_IMPLEMENTATION_TYPES);
        worker.registerActivitiesImplementations(ACTIVITY_IMPLEMENTATIONS);
    }

    private boolean domainExists() throws TException {
        try {
            ListDomainsRequest listDomainsRequest = new ListDomainsRequest();
            ListDomainsResponse response = workflowService.ListDomains(listDomainsRequest);
            List<DescribeDomainResponse> domains = response.getDomains();

            return domains.stream()
                    .anyMatch(d -> d.domainInfo.name.equals(DOMAIN));
        } catch (UnsupportedOperationException e) {
            return true; // evaluate as true so domain won't be registered.
        }
    }
}
