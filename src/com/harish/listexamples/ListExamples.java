package com.harish.listexamples;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.harish.dtos.UserDTo;

public class ListExamples {

	public static void main(String[] args) {

		//convert list to map 
		
		List<UserDTo> usersList = new ArrayList<>();
		
		UserDTo user1 = new UserDTo(1,"harish",28);
		UserDTo user2 = new UserDTo(2,"Krishna",28);
		UserDTo user3 = new UserDTo(3,"Nandu",27);
		UserDTo user4 = new UserDTo(4,"chandru",26);
		UserDTo user5 = new UserDTo(5,"aman",19);
		
		
		usersList.add(user1);
		usersList.add(user2);
		usersList.add(user3);
		usersList.add(user4);
		usersList.add(user5);
		
		//Map<Integer, UserDTo> userMap = usersList.stream().map(user-> user.getId()).collect(Collectors.toList());
		Map<Integer, UserDTo> userMap = usersList.stream().collect(Collectors.toMap(UserDTo::getId, user->user));
		
		Map<Integer, Long> userGroupMap = usersList.stream().collect(Collectors.groupingBy(UserDTo::getAge,Collectors.counting())); 
		
		
		List<String> names = usersList.stream().map(UserDTo::getName).collect(Collectors.toList());
		
		List<Integer> ageGreater = usersList.stream().map(user->user.getId()).filter(user -> (user >3)).collect(Collectors.toList());
		
		String userNames = usersList.stream().findFirst().get().getName();
		
//		String userName = usersList.stream()
		
		System.out.println(userNames);
		
		System.out.println(ageGreater);
		
		System.out.println(names);
		
		System.out.println(userMap);
		
		System.out.println(userGroupMap);

		
		
		
		
	}
	
}
