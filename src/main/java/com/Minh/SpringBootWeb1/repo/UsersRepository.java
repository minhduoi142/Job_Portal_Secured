package com.Minh.SpringBootWeb1.repo;

import com.Minh.SpringBootWeb1.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer> {

    Users findByUsername(String username);


}
