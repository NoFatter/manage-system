package org.nofat.manage.common;

import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

/**
 * BaseEntity 基础实体类
 *
 * @author liyutao
 * @version 2023/10/27 14:16
 **/
@Data
public class BaseEntity {
    @CreatedDate
    private LocalDateTime createTime;
    @CreatedBy
    private String createBy;
    @LastModifiedDate
    private LocalDateTime updateTime;
    @LastModifiedBy
    private String updateBy;
}
