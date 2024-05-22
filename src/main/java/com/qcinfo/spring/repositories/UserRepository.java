package com.qcinfo.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qcinfo.spring.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
