package com.nban.dbmodel.domain;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by liyi on 2016/2/24.
 */
@Entity
@Table
@Data
public class ColumnChangeLog extends AbstractEntity{

    //reference TableChangeLog
    private Long tableId;

    private String columnName,oldColumnName,comment;

    private Integer type,length;

    @Enumerated(EnumType.ORDINAL)
    private OperationType operationType;

}
