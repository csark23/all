package com.jwt.db.entity;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Instructor {
	
	private Long instructorId;
	private String firstName;
	private String lastName;
	private String summary;
	
	private Set<Course> course= new HashSet<>();
	
	private User user;
	
	@Override
	public int hashCode() {
		return Objects.hash(firstName, instructorId, lastName, summary);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Instructor other = (Instructor) obj;
		return Objects.equals(firstName, other.firstName) && Objects.equals(instructorId, other.instructorId)
				&& Objects.equals(lastName, other.lastName) && Objects.equals(summary, other.summary);
	}
	
	public Instructor() {
		
	}
	
	

	public Long getInstructorId() {
		return instructorId;
	}

	public void setInstructorId(Long instructorId) {
		this.instructorId = instructorId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public Set<Course> getCourse() {
		return course;
	}

	public void setCourse(Set<Course> course) {
		this.course = course;
	}
	
	
}
