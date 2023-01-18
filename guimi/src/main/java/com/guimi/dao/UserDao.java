package com.guimi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guimi.domain.Users;
import com.guimi.repository.IUsersRepository;
@Service
public class UserDao {
	@Autowired
	IUsersRepository usersRepository;
	
	 List<Users> getUsers() {
		return usersRepository.findAll();
		
	}
	
	//Save Produit
	public Users saveUsers(Users users ) {
		return usersRepository.save(users);
		
	}
	
	// get a Produit by ID
	public Users getUsersByID(Long idUser) {
		return usersRepository.findById(idUser).get();
	}
	
	
	// Delete a produit
	
	public void users(Users  idUser) {
		usersRepository.delete(idUser);
	
	}
	
	// Update 
	
	public Users  updateUsers(Users  idUser) {
		return usersRepository.save(idUser);
		
	}
}
