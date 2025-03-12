package com.example.demo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface StudentRepo extends JpaRepository<Student, Integer> {
	@Modifying@Transactional
	@Query(value = "delete from batch_list where batch_id=?1 and list_id=?2",nativeQuery = true)

	

	void del(int batchid, int studentid);

}
