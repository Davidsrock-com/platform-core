/*
 * Copyright (c) 2020. /*************************************************************************
 *                             *
 *                             * DAVIDSROCK CONFIDENTIAL
 *                             * __________________
 *                             *
 *                             *  [2019] - [2020] davidsrock.com
 *                             *  All Rights Reserved.
 *                             *
 *                             * NOTICE:  All information contained herein is, and remains
 *                             * the property of davidsrock.com and its suppliers,
 *                             * if any.  The intellectual and technical concepts contained
 *                             * herein are proprietary to davidsrock.com
 *                             * and its suppliers and may be covered by U.S. and Foreign Patents,
 *                             * patents in process, and are protected by trade secret or copyright law.
 *                             * Dissemination of this information or reproduction of this material
 *                             * is strictly forbidden unless prior written permission is obtained
 *                             * from davidsrock.com.
 *
 */

package com.davidsrock.platform.data.db.jpa.repositories;


import com.davidsrock.platform.core.domain.User;
import com.davidsrock.platform.core.usecases.signup.SignUpRepository;
import com.davidsrock.platform.data.db.jpa.entities.UserData;

public class SignUpRepositoryImpl implements SignUpRepository {

    private JpaUserRepository jpaUserRepository;

    @Override
    public User createUser(User user) {

        UserData userData = new UserData();
        userData.setEmail(user.getEmail());
        userData.setFirstName(user.getFirstName());
        userData.setLastName(user.getLastName());
        jpaUserRepository.save(userData);
        return new User();
    }
}
