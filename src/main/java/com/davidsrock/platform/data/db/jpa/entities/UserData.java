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

package com.davidsrock.platform.data.db.jpa.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserData {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String email;
    private String firstName;
    private String lastName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
