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

package com.davidsrock.platform.presenter.rest.api.signup;

import com.davidsrock.platform.core.domain.User;
import com.davidsrock.platform.core.usecases.signup.SignUpUseCase;
import com.davidsrock.platform.presenter.rest.api.entities.ApiResponse;
import com.davidsrock.platform.presenter.rest.api.entities.SignUpRequest;
import org.springframework.stereotype.Component;

/**
 * Sign Up controller pass the request to usecase layer
 */
@Component
public class SignUpController implements SignUpResource {

    private SignUpUseCase signUpUseCase;

    @Override
    public ApiResponse signUp(final SignUpRequest signUpRequest) {
        signUpUseCase.signUp(new User(signUpRequest.getEmail()
                , signUpRequest.getFirstName(), signUpRequest.getLastName()));
        //return api response
        return null;
    }
}
