package com.Alterra.ISO.SpringSecurity.Repository;

import com.Alterra.ISO.SpringSecurity.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User getDistinctTopByUsername(String username);
}
