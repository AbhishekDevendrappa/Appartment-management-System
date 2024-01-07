package com.ams.repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import com.ams.model.Residents;

@Repository
public interface ResidentServiceRepo extends CrudRepository<Residents, Integer> {

	@Query("from Residents where Residentname=:Residentname and Password=:Password")
	 Residents findByResidentnameAndPassword(String Residentname, String Password);
	
	@Query("from Residents where Residentname=:residentname")
	Residents findByResidentname(String residentname);

	
	

}
