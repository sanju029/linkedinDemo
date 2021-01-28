/**
 * 
 */
package com.kodem.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodem.demo.model.CompanyModel;
import com.kodem.demo.repository.CompanyRepository;

/**
 * @author sanju
 *
 */
@Service
public class CompanyService
{
	@Autowired
	private CompanyRepository companyRepository;
	
	public void createCompany(CompanyModel company)
	{
		companyRepository.save(company);
	}
	
	public CompanyModel getCompany(String url)
	{
		return companyRepository.findByUrl(url).get();
	}
	
	public List<CompanyModel> getAllCompanies()
	{
		return companyRepository.findAll();
	}
	
	public void updateCompany(CompanyModel updatedCompany, String url)
	{
		CompanyModel oldCompany = companyRepository.findByUrl(url).get();
		updatedCompany.setCompanyId(oldCompany.getCompanyId());
		companyRepository.save(updatedCompany);
	}
	
	public void deleteCompany(String url)
	{
		CompanyModel company = companyRepository.findByUrl(url).get();
		companyRepository.delete(company);
	}
}
