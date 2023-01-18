package com.guimi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guimi.domain.Actu;

public interface IActuRepository  extends JpaRepository<Actu, Long> {

}
