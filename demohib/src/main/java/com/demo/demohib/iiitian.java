package com.demo.demohib;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class iiitian {
	@Id
	private int aid;
//    @Transient
//	private String aname;
    private alienName aname;
    private String color;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	

	
	public alienName getAname() {
		return aname;
	}
	public void setAname(alienName aname) {
		this.aname = aname;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "iiitian [aid=" + aid + ", aname=" + aname + ", color=" + color + "]";
	}
	
	

	


}
