package com.antlosman.onlinestore.dao;

import com.antlosman.onlinestore.entity.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface StateRepository extends JpaRepository<State, Integer> {

    // custom query to retrieve states for a given country code
    List<State> findByCountryCode(@Param("code") String code);

    // test example
    // http://localhost:8080/states/search/findByCountryCode?code=US
}
