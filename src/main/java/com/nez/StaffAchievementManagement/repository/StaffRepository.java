package com.nez.StaffAchievementManagement.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nez.StaffAchievementManagement.model.Staff;

@Repository
public interface StaffRepository extends JpaRepository<Staff, Integer>{

}
