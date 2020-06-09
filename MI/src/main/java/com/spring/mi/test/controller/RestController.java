package com.spring.mi.test.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.mi.test.entity.S;
import com.spring.mi.test.entity.V;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/rest")
public class RestController {

	@GetMapping(value = "/server")
    public List<Object> hello() {
		
		List<Integer> integer = new ArrayList <Integer>();
		List<String> string= new ArrayList <String>();
		
		integer.add(1);
		integer.add(2);
		integer.add(3);
		integer.add(4);
		
		string.add("Soumyadip");
		string.add("Soumya");
		string.add("R");
		string.add("R");
		
		
		List<S> obj=new ArrayList<S>();
		obj.add(new S("I'm 1st S"));
		obj.add(new S("I'm 2nd S"));
		obj.add(new S("I'm 3rd S"));
		
		List<Object> list = new ArrayList <>();
		list.add(integer);
		list.add(string);
		
		for(S a:obj)
			list.add(a);
		
		
        return list;
    }
}
