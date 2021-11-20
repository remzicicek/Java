package com.mapstruct.example.mapstruct.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode
public abstract class BaseModel {

    private Long id;

    private Date createdDate;

    private String createdBy;

    private Date updatedDate;

    private String updatedBy;

}