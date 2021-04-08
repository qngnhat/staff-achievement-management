package com.nez.StaffAchievementManagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nez.StaffAchievementManagement.model.Record;

@Repository
public interface RecordRepository extends JpaRepository<Record, Integer>{
	public List<Record> findAllByOrderByStaff_Id();
}
