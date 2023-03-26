package com.jwt.db.entity;

import java.util.Objects;

public class Role {
	
	private Long roleId;
	private String name;
	
//	@Override
//	public int hashCode() {
//		return Objects.hash(name, roleId);
//	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Role other = (Role) obj;
		return Objects.equals(name, other.name) && Objects.equals(roleId, other.roleId);
	}
	
	@Override
	public String toString() {
		return "Role{"+"roleId="+roleId+",name='"+name+'\''+'}';
	}
	
}
