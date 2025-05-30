package com.example.companyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/companies")
public class Controller {
    @Autowired
    private ComapanyService companyService;

    @GetMapping
    public ResponseEntity<List<Company>> getAll() {
        return new ResponseEntity<>(companyService.getAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Void> add(@RequestBody Company company) {
        companyService.add(company);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Company> getById(@PathVariable Long id) {
        Company company = companyService.getById(id);
        if (company != null)
            return new ResponseEntity<>(company, HttpStatus.OK);
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
