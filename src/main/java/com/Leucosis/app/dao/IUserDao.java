package com.Leucosis.app.dao;

import org.springframework.data.repository.CrudRepository;

import com.Leucosis.app.entity.User;




import org.springframework.stereotype.Repository;


@Repository
public interface IUserDao extends CrudRepository<User, Long>{

}
