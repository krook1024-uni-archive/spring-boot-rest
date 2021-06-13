package com.krook1024.rest.domain;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
@AllArgsConstructor
@Builder
public class User {

    private final String name;
    private final String password;
    private final Date createdAt;
    private final Boolean isAdmin;
}
