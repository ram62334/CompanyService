package com.example.companyService.CompanyServicePack;

import com.example.companyService.ComapanyService;
import com.example.companyService.Company;
import com.example.companyService.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements ComapanyService {
    @Autowired
    private CompanyRepository repository;

    @Override
    public List<Company> getAll() {
        return repository.findAll();
    }

    @Override
    public Company getById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void add(Company company) {
        repository.save(company);
    }

}
