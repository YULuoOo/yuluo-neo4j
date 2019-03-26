package com.yuluo.yuluoneo4j.domain;

import org.neo4j.ogm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Mark Angrish
 */
@RelationshipEntity(type = "ACTED_IN")
public class Role {

    @Id
    @GeneratedValue
	private Long id;
	private List<String> roles = new ArrayList<>();

	@StartNode
	private Person person;

	@EndNode
	private Movie movie;

	public Role() {
	}

	public Role(Movie movie, Person actor) {
		this.movie = movie;
		this.person = actor;
	}

	public Long getId() {
	    return id;
	}

	public List<String> getRoles() {
	    return roles;
	}

	public Person getPerson() {
	    return person;
	}

	public Movie getMovie() {
	    return movie;
	}

    public void addRoleName(String name) {
        if (this.roles == null) {
            this.roles = new ArrayList<>();
        }
        this.roles.add(name);
    }
}