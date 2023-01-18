package com.guimi.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.guimi.domain.Users;

public interface IUsersRepository extends JpaRepository<Users, Long> {

}
