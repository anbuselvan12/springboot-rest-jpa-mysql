package com.sample.spring.project;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DietTrackingRepository extends CrudRepository<DietTracking, Long> {

}
