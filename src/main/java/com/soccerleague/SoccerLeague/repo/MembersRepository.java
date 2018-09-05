package com.soccerleague.SoccerLeague.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.soccerleague.SoccerLeague.entity.Members;

public interface MembersRepository extends JpaRepository<Members, Integer> {

}
