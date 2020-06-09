package com.spring.mi.test.entity;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class S {

	public String id;
	
	public List<E> ep;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public S(String id, List<E> ep) {
		super();
		this.id = id;
		this.ep = ep;
	}

	public S() {
		super();
		this.ep=new ArrayList<E>();
	}

	public S(String id) {
		super();
		this.id = id;
		this.ep=new ArrayList<E>();
	}


	
}
