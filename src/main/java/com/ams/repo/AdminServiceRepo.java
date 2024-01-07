package com.ams.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ams.model.Residents;

@Repository
public interface AdminServiceRepo extends CrudRepository<Residents, Integer> {

}
