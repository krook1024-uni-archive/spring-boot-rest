package com.krook1024.rest.dataaccess.projection;

import com.krook1024.rest.domain.User;
import java.util.Date;
import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class PostProjection {

    @Id
    @GeneratedValue
    private UUID id;

    private String title;
    private Date date;

    @OneToOne
    private UserProjection author;

    private String body;
}
