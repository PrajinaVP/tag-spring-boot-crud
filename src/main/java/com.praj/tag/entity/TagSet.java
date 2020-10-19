package com.praj.tag.entity;

import com.praj.tag.audit.Auditable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.envers.Audited;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Audited
public class TagSet extends Auditable<String> {

    @Id
    @GeneratedValue(generator = "UUID")
    @Column(length = 36)
    private UUID tagSetId;

    @Column(length = 64, unique = true)
    private String tagSetName;

    //should specify the URI of an entity collection
    private String entityType;

    private String tagSetDesc;
}