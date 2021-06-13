package com.krook1024.rest.dataaccess.projection;

import java.util.Date;
import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserProjection {

    @Id
    @GeneratedValue
    private UUID id;

    private String name;
    private String password;
    private Date createdAt;
    private Boolean isAdmin;
}
