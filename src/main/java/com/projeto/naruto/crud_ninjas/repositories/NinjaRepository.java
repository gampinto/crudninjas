package com.projeto.naruto.crud_ninjas.repositories;

import com.projeto.naruto.crud_ninjas.entities.Ninja;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NinjaRepository extends JpaRepository<Ninja, Long> {
}
