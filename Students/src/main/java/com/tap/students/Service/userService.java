package com.tap.students.Service;

import java.util.List;

import com.tap.students.Entity.user;
import com.tap.students.dto.AuthenticateRequest;
import com.tap.students.dto.AuthenticateResponse;

public interface userService {

    AuthenticateResponse authenticate(AuthenticateRequest model);

    List<user> getAll();

    user getById(int id);
}
