package com.lloyds.classroom_service;

import java.util.Collection;

//@SpringBootApplication
public class ClassroomServiceApplication {

	private Collection<ClassroomServiceApplication> friends;
	private String email;

	public ClassroomServiceApplication(String email) {
		this.friends = friends;
		this.email = email;
	}

	public Collection<ClassroomServiceApplication> getClassroomServiceApplication() {
		return friends;
	}

	public String getEmail(String email) {
		return email;
	}


	public void addFriendShip(ClassroomServiceApplication friend) {
		friends.add(friend);
		friend.getClassroomServiceApplication().add(this);
	}

	public boolean canBeConnected(ClassroomServiceApplication classroomServiceApplication) {
		throw new UnsupportedOperationException("asdasd");
	}

	public static void main(String[] args) {
		ClassroomServiceApplication a = new ClassroomServiceApplication("A");
		ClassroomServiceApplication b = new ClassroomServiceApplication("A");
		ClassroomServiceApplication c = new ClassroomServiceApplication("A");
		a.addFriendShip(b);
		b.addFriendShip(c);
//		SpringApplication.run(ClassroomServiceApplication.class, args);
	}

}