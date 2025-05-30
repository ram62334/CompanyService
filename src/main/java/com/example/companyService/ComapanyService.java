package com.example.companyService;

import java.util.List;

public interface ComapanyService {
    List<Company> getAll();
    Company getById(Long id);
    void add(Company company);
}
