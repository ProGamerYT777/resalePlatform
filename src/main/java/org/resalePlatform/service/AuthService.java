package org.resalePlatform.service;

import org.resalePlatform.dto.Register;

public interface AuthService {

    boolean login(String userName, String password);

    boolean register(Register register);

}
