package com.spring.mi.test.entity;

import java.util.HashMap;

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
public class E {

	public String id;
	
	public HashMap<String, String> hm=new HashMap<String, String>();
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public E(String id) {
		super();
		this.id = id;
	}
	
	
}
