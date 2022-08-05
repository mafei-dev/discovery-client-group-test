package demo.mafei.useservice.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClientConfig;
import lombok.AllArgsConstructor;
import org.springframework.cloud.netflix.eureka.serviceregistry.EurekaRegistration;
import org.springframework.cloud.netflix.eureka.serviceregistry.EurekaServiceRegistry;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class Test {
//    private final EurekaRegistration registration;
//
//    @Scheduled(cron = "*/5 * * * * *")
//    public void print() throws JsonProcessingException {
//        System.out.println("Test.print");
//        registration.getApplicationInfoManager().setInstanceStatus(InstanceInfo.InstanceStatus.DOWN);
//    }

}
