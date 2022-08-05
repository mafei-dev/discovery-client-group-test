package demo.mafei.useservice.controller;

import lombok.AllArgsConstructor;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RequestMapping
@RestController
@AllArgsConstructor
public class UserController {

    private final ServiceInstance serviceInstance;


    @GetMapping("/url")
    public ResponseEntity<Map<String, Object>> index() {
        return ResponseEntity.ok(Collections.singletonMap("url", serviceInstance.getUri()));
    }
}
