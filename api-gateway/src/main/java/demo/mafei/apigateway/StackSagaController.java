package demo.mafei.apigateway;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RequestMapping("/stacksaga")
@RestController
@AllArgsConstructor
public class StackSagaController {

    @GetMapping
    public ResponseEntity<Map<String, Object>> index() {
        return ResponseEntity.ok(Collections.singletonMap("msg", "i am from stacksaga"));
    }
}
