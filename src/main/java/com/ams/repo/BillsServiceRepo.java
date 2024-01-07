package com.ams.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ams.model.Bills;

@Repository
public interface BillsServiceRepo extends CrudRepository<Bills, Integer> {

	@Query("from Bills where residents_reid=:residents_reid")
	Optional<Bills> findByreidId(Integer residents_reid);

	

	

}
