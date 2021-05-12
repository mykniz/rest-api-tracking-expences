package ru.mykniz.expencetracker.services;

import ru.mykniz.expencetracker.domain.User;
import ru.mykniz.expencetracker.excpetions.EtAuthException;

public interface UserService {

    User validateUser(String email, String password) throws EtAuthException;
    User registerUser(String firstname, String lastName, String email, String password) throws EtAuthException;



}
