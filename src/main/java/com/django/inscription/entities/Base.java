package com.django.inscription.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Data
public abstract class Base implements Serializable {

    @Id
    @Column(name = "id", unique = true)
    private String id;
    @Column(name = "created_at")
    @Temporal(TemporalType.DATE)
    private Date createdAt;

    @Column(name = "created_on")
    @Temporal(TemporalType.TIME)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "HH:mm:ss")
    private Date createdOn;


    @Column(name = "updated_at")
    @Temporal(TemporalType.DATE)
    private Date updatedAt;

    @Column(name = "updated_on")
    @Temporal(TemporalType.TIME)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "HH:mm:ss")
    private Date updatedOn;

    @Column(name = "deleted", columnDefinition="boolean default false")
    private Boolean isDeleted;

    @PrePersist
    public void prePersist(){
        id = UUID.randomUUID().toString();
        createdAt = new Date();
        createdOn = new Date();
        updatedAt = new Date();
        updatedOn = new Date();
        isDeleted = false;
    }

    @PreUpdate
    public void preUpdate() {
        updatedAt = new Date();
        updatedOn = new Date();
    }
}
