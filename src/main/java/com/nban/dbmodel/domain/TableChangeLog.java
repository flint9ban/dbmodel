package com.nban.dbmodel.domain;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by liyi on 2016/2/24.
 */
@Data
@Entity
@Table
public class TableChangeLog extends AbstractEntity{

    private String tableName,oldTableName;

    private Long updateTime;

    @Enumerated(EnumType.ORDINAL)
    private OperationType operationType;

}
