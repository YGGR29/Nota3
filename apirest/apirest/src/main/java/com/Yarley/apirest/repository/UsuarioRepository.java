package com.Yarley.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Yarley.apirest.entities.User;

import java.util.List;

public interface UsuarioRepository extends JpaRepository<User, Integer> {

}
