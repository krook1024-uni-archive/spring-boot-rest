package com.krook1024.rest.dataaccess.dao;

import com.krook1024.rest.dataaccess.projection.PostProjection;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostDao extends JpaRepository<PostProjection, UUID> {

}
