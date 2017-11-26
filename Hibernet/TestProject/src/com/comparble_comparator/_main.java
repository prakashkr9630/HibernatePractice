package com.comparble_comparator;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.hibernate.cache.impl.bridge.CollectionAccessStrategyAdapter;

public class _main {
	
	
	public static void main(String[] args) {
		
		
		List<Pojo> listpo = new ArrayList<Pojo>();
		
		Pojo po1 = new Pojo();
		po1.setName("name1");
		po1.setAge(10);
		po1.setPrice(100);
		
		Pojo po2 = new Pojo();
		po2.setName("name2");
		po2.setAge(20);
		po2.setPrice(200);
		
		
		Pojo po3 = new Pojo();
		po3.setName("name3");
		po3.setAge(30);
		po3.setPrice(300);
		
		Pojo po4 = new Pojo();
		po4.setName("name4");
		po4.setAge(40);
		po4.setPrice(400);
		
		Pojo po5 = new Pojo();
		po5.setName("name5");
		po5.setAge(50);
		po5.setPrice(500);
		
		
		listpo.add(po1);
		listpo.add(po5);
		listpo.add(po2);
		listpo.add(po3);
		listpo.add(po4);
		
		Collections.sort(listpo);
		
		
		for(Pojo p :listpo){
		//	System.out.println(p.getName());
		}
		
		
		String[] arr = {"name1","name4","name2","name5","name3"};
		
		
		
		for(String s: arr){
		//	System.out.println(s);
		}
		
		
		
	     
	}

}
