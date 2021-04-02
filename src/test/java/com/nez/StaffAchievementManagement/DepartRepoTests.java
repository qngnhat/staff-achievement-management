package com.nez.StaffAchievementManagement;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.nez.StaffAchievementManagement.model.Depart;
import com.nez.StaffAchievementManagement.repository.DepartRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class DepartRepoTests {
	@Autowired
	private DepartRepository repo;
	
	@Test
	public void testCreateDepart() {
		Depart saveDepart = repo.save(new Depart("Design"));
		assertThat(saveDepart.getId()).isGreaterThan(0);
	}
}
