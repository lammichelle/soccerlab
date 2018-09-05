package com.soccerleague.SoccerLeague.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "teams")
public class Teams {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto increment
	private Long teamid;
	private String teamname;

	@OneToMany(mappedBy = "teams", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Members> members = new ArrayList<>();

	public Teams() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Teams(Long teamid, String teamname, List<Members> members) {
		super();
		this.teamid = teamid;
		this.teamname = teamname;
		this.members = members;
	}

	public Teams(String teamname, List<Members> members) {
		super();
		this.teamname = teamname;
		this.members = members;
	}

	public Long getTeamid() {
		return teamid;
	}

	public void setTeamid(Long teamid) {
		this.teamid = teamid;
	}

	public String getTeamname() {
		return teamname;
	}

	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}

	public List<Members> getMembers() {
		return members;
	}

	public void setMembers(List<Members> members) {
		this.members = members;
	}

	@Override
	public String toString() {
		return "teamid=" + teamid + ", teamname=" + teamname + ", members=" + members ;
	}

}
