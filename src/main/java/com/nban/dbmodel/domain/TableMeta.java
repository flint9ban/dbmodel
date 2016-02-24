package com.nban.dbmodel.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by liyi on 2016/2/24.
 */

@Data
@Entity
@Table
public class TableMeta extends AbstractEntity implements Serializable {

    //reference TableSumarry
    private Long sumarryId;

    private String name,comment;

    private Integer type,length;
}
