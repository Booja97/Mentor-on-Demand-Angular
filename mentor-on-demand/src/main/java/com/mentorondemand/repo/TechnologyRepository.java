package com.mentorondemand.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mentorondemand.entity.Technologies;
@Repository
public interface TechnologyRepository extends CrudRepository<Technologies, Long> {

}
