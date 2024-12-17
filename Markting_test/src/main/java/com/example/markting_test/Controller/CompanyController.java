package com.example.markting_test.Controller;

import com.example.markting_test.ApiResponse.ApiResponse;


import com.example.markting_test.DTOout.CompanyDTO;
import com.example.markting_test.Model.Company;
import com.example.markting_test.Service.CompanyService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/companies")
public class CompanyController {

    @Autowired
    private CompanyService companyService;


    @PostMapping("/add")
    public ResponseEntity<ApiResponse> addCompany(@RequestBody @Valid Company company) {
        companyService.createCompany(company);
        return ResponseEntity.status(200).body(new ApiResponse("successfully added Company"));
    }


    @GetMapping("/get")
    public ResponseEntity<List<CompanyDTO>> getAllCompanies() {
        return ResponseEntity.ok(companyService.getCompaniesDTos());
    }


    @GetMapping("/findByCompany_id/{Company_id}")
    public ResponseEntity<CompanyDTO> getCompanyById(@PathVariable Integer Company_id) {
        return ResponseEntity.ok(companyService.getCompanyById(Company_id));
    }


    @PutMapping("/update")
    public ResponseEntity<ApiResponse> updateCompany(@RequestBody @Valid Company company) {
        companyService.updateCompany(company);
        return ResponseEntity.status(200).body(new ApiResponse("successfully updated Company"));
    }


    @DeleteMapping("/delete/{Company_id}")
    public ResponseEntity<ApiResponse> deleteCompany(@PathVariable Integer Company_id) {
        companyService.deleteCompany(Company_id);
        return ResponseEntity.status(200).body(new ApiResponse("successfully deleted Company"));
    }
}

