package com.busrabacak.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.busrabacak.entity.Cars;


@Repository
public interface CarsRepository extends JpaRepository<Cars, Integer> {

	@Transactional
	@Modifying
	@Query(value = "SELECT * FROM cars c where c.marka LIKE %:st%  ", nativeQuery = true)
	List<Cars> getSearch(@Param("st")String search);
}
