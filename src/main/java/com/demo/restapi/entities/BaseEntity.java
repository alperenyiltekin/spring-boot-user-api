package com.demo.restapi.entities;

import lombok.Data;

import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.Date;

@Data
@MappedSuperclass
public class BaseEntity implements Serializable {
    private Date createdAt;
    private String createdBy;
    private Date updatedAt;
    private String updatedBy;
}
