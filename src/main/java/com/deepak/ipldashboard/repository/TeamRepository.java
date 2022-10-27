package com.deepak.ipldashboard.repository;

import org.springframework.data.repository.CrudRepository;

import com.deepak.ipldashboard.model.Team;

public interface TeamRepository extends CrudRepository<Team, Long>{
	
	Team findByTeamName(String teamName);
}
