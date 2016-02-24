package com.nban.dbmodel.domain;

import lombok.Data;
import org.crsh.cli.impl.tokenizer.Token;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by liyi on 2016/2/24.
 */
@Entity
@Data
@Table
public class TableSumarry extends AbstractEntity implements Serializable {

    private String tableName;
    private Boolean remove;
}
