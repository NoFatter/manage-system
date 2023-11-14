package org.nofat.manage.common;

import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.time.LocalDateTime;

/**
 * BaseEntity 基础实体类
 *
 * @author liyutao
 * @version 2023/10/27 14:16
 **/
@Data
public class BaseEntity {
    @MongoId
    private String _id;
    /**
     * 创建时间
     */
    @CreatedDate
    private LocalDateTime createTime;
    /**
     * 创建者
     */
    @CreatedBy
    private String createBy;
    /**
     * 更新时间
     */
    @LastModifiedDate
    private LocalDateTime updateTime;
    /**
     * 更新者
     */
    @LastModifiedBy
    private String updateBy;
    /**
     * 删除标识
     */
    private Integer isDelete;
}
