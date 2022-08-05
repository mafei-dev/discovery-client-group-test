package demo.mafei.useservice.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import com.netflix.discovery.shared.Application;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@Component
@Slf4j
public class InstancePrinter {


    private final ServiceInstance serviceInstance;
    private final DiscoveryClient discoveryClient;

    @Value("${spring.application.name}")
    private String serverName;

    @Autowired
    public InstancePrinter(ServiceInstance serviceInstance, DiscoveryClient discoveryClient) {
        this.serviceInstance = serviceInstance;
        this.discoveryClient = discoveryClient;
    }

    @Scheduled(cron = "*/1 * * * * *")
    public void print() throws JsonProcessingException {

        List<ServiceInstance> instances = discoveryClient.getInstances(serverName);
        Stream<ServiceInstance> serviceInstanceStream = instances.stream().filter(instanceInfo -> instanceInfo.getMetadata().get("node")
                .equals(serviceInstance.getMetadata().get("node")));
        Optional<ServiceInstance> node = serviceInstanceStream.min(Comparator.comparing(instanceInfo -> Long.valueOf(instanceInfo.getMetadata().get("timestamp"))));
        System.out.println(node.get().getUri());

    }
}
