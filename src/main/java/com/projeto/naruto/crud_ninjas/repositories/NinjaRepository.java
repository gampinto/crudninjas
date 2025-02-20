package com.projeto.naruto.crud_ninjas.repositories;

import com.projeto.naruto.crud_ninjas.entities.Ninja;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NinjaRepository extends JpaRepository<Ninja, Long> {
}
