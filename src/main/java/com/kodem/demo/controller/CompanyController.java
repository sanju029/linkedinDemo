/**
 * 
 */
package com.kodem.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodem.demo.model.CompanyModel;
import com.kodem.demo.service.CompanyService;

/**
 * @author sanju
 *
 */
@RestController
@RequestMapping("/company")
public class CompanyController {
	
	@Autowired
	CompanyService companyService;
	
	@PostMapping
	public void createCompany(@RequestBody CompanyModel company)
	{
		companyService.createCompany(company);
	}
	
	@GetMapping("/{url}")
	public CompanyModel getCompany(@PathVariable String url)
	{
		return companyService.getCompany(url);
	}
	
	@DeleteMapping("/{url}")
	public void deleteCompany(@PathVariable String url)
	{
		companyService.deleteCompany(url);
	}
	
	@PutMapping("/{url}")
	public void updateCompany(@PathVariable String url, @RequestBody CompanyModel company)
	{
		companyService.updateCompany(company, url);
	}
	
	@GetMapping
	public List<CompanyModel> getAllCompanies()
	{
		return companyService.getAllCompanies();
	}

}
