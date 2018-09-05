package com.soccerleague.SoccerLeague.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.soccerleague.SoccerLeague.entity.Teams;

public interface TeamsRepository extends JpaRepository<Teams, Long> {

}
