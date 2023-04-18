package com.onurgundogdu.reactiveapp.repository;

import com.onurgundogdu.reactiveapp.model.User;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IUserRepository extends ReactiveMongoRepository<User, String> {
}
