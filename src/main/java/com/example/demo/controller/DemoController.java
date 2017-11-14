package com.example.demo.controller;

import com.example.demo.model.Case;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Controller
@RestController("/")
public class DemoController {

    @RequestMapping(method= RequestMethod.GET, value = "hello")
    ResponseEntity<String> hello() {
        return ResponseEntity.ok("Hello");
    }

    @RequestMapping(method= RequestMethod.GET, value = "cases")
    ResponseEntity<List<Case>> getCases() {
        List<Case> cases = new ArrayList<>();
        cases.add(new Case("ref-123456","Mrs Jane Smith","Mr Robert Smith"));
        cases.add(new Case("ref-abcdef","Mrs Rita Phillips","Mr George Phillips"));
        cases.add(new Case("ref-ABC456","Mr Jay Khan","Mrs Louise Khan"));
        cases.add(new Case("ref-123DEF","Mrs Emma Elliot","Mr John Elliot"));
        return ResponseEntity.ok(cases);
    }

    @RequestMapping(method= RequestMethod.GET, value = "cases/{caseRef}")
    ResponseEntity<Case> getCase(@PathVariable String caseRef) {
        Case newCase = new Case(caseRef,"Mrs Jane Smith","Mr Robert Smith");
        return ResponseEntity.ok(newCase);
    }

}
