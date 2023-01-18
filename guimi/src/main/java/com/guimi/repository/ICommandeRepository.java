package com.guimi.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.guimi.domain.Commande;

public interface ICommandeRepository extends JpaRepository<Commande, Long> {

}
