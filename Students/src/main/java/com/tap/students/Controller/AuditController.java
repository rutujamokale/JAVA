package com.tap.students.Controller;

import org.springframework.boot.autoconfigure.couchbase.CouchbaseProperties.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class AuditController {

    @GetMapping("/audit")
    public String audit(Authentication auth) {

        log.info("User {} accessed /audit",
            auth.getName());

        return "Logged";
    }
}
