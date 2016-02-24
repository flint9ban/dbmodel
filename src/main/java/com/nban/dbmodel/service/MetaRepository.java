package com.nban.dbmodel.service;

import com.nban.dbmodel.domain.TableMeta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by liyi on 2016/2/24.
 */
@RepositoryRestResource(collectionResourceRel = "metas", path = "meta")
public interface MetaRepository extends JpaRepository<TableMeta,Long> {
}
