package com.jwt.db.entity;

import java.util.Objects;

public class User {

	private Long userId;
	private String email;
	private String password;
	
	@Override
	public int hashCode() {
		return Objects.hash(email, password, userId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(email, other.email) && Objects.equals(password, other.password)
				&& Objects.equals(userId, other.userId);
	}
	
}
