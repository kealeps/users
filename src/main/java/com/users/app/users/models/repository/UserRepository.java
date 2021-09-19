package com.users.app.users.models.repository;

import com.commons.users.userscommons.models.entity.User;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource(path = "user")
public interface UserRepository extends PagingAndSortingRepository<User, Long>{
    
    @RestResource(path = "username")
    public User findByUsername(@Param("username") String username);
    public User findByEmail(String email);
}
