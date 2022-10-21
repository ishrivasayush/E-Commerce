package com.Narainox.ECart.Repository;

import com.Narainox.ECart.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,String> {
}
