package com.demo.demohib;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cacheable 
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
public class Student {
	@Id
	private int rollno;
	private String name;
	private int mraks;
	@OneToMany(mappedBy="student",fetch=FetchType.EAGER)
//	private Collection<Laptop> laps = new ArrayList<Laptop>();
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMraks() {
		return mraks;
	}
	public void setMraks(int mraks) {
		this.mraks = mraks;
	}
//	public Collection<Laptop> getLaptop() {
//		return laps;
//	}
//	public void setLaptop(Collection<Laptop> laptop) {
//		this.laps = laptop;
//	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", mraks=" + mraks + "]";
	}

	
	
	

}
