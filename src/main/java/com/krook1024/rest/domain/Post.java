package com.krook1024.rest.domain;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
@AllArgsConstructor
public class Post {

    private final String title;
    private final Date date;
    private final User author;
    private final String body;
}
