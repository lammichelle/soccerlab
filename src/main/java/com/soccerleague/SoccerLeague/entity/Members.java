package com.soccerleague.SoccerLeague.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Members {

	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY) //auto increment
	
	private Long memberid;
	private String membername;
	private String memberrole;
	
	@ManyToOne
	@JoinColumn(name = "teamid")
	private Teams teams;

	public Members() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Members(Long memberid, String membername, String memberrole, Teams teams) {
		super();
		this.memberid = memberid;
		this.membername = membername;
		this.memberrole = memberrole;
		this.teams = teams;
	}

	
	public Members( String membername, String memberrole, Teams teams) {
		super();
		this.membername = membername;
		this.memberrole = memberrole;
		this.teams = teams;
	}
	public Long getMemberid() {
		return memberid;
	}

	public void setMemberid(Long memberid) {
		this.memberid = memberid;
	}

	public String getMembername() {
		return membername;
	}

	public void setMembername(String membername) {
		this.membername = membername;
	}

	public String getMemberrole() {
		return memberrole;
	}

	public void setMemberrole(String memberrole) {
		this.memberrole = memberrole;
	}

	public Teams getTeams() {
		return teams;
	}

	public void setTeams(Teams teams) {
		this.teams = teams;
	}

	@Override
	public String toString() {
		return "Members [memberid=" + memberid + ", membername=" + membername + ", memberrole=" + memberrole
				+ ", teams=" + teams + "]";
	}
	
	
	
	
}
