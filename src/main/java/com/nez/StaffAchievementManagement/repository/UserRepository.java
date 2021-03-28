package com.nez.StaffAchievementManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nez.StaffAchievementManagement.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
}
