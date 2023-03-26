package com.jwt.db.entity;

import java.util.Objects;

public class Student {
	
	private Long studentId;
	private String firstName;
	private String lastName;
	private String level;
	
	@Override
	public int hashCode() {
		return Objects.hash(firstName, lastName, level, studentId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(firstName, other.firstName) && Objects.equals(lastName, other.lastName)
				&& Objects.equals(level, other.level) && Objects.equals(studentId, other.studentId);
	}
	
	
}
