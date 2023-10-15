package com.vm.entities;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public abstract class BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "createdBy")
    @CreatedBy
    private String createdBy;

    @Column(name = "createdDate")
    @CreatedDate
    private Instant createdDate = Instant.now();

    @Column(name = "updatedBy")
    @LastModifiedBy
    private String updatedBy;

    @Column(name = "updatedDate")
    @LastModifiedDate
    private Instant updatedDate = Instant.now();
}
