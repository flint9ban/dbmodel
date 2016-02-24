package com.nban.dbmodel.service;

import com.nban.dbmodel.domain.TableSumarry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

/**
 * Created by liyi on 2016/2/24.
 */
@RepositoryRestResource(collectionResourceRel = "tables", path = "tables")
@Repository
public interface TableRepository extends JpaRepository<TableSumarry,Long>{
}
