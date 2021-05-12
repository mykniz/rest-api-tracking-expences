package ru.mykniz.expencetracker.repos;

import ru.mykniz.expencetracker.domain.User;
import ru.mykniz.expencetracker.excpetions.EtAuthException;

public interface UserRepository {
    Integer create(String firstname, String lastName, String email, String password) throws EtAuthException;

    User findByEmailAndPassword(String email, String password) throws EtAuthException;

    Integer getCountByEmail(String email);

    User findById(Integer UserId);

}
