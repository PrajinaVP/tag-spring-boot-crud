package com.praj.tag.entity;


import com.praj.tag.audit.Auditable;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
//@Table(
//        name="tag",
//        uniqueConstraints=
//        @UniqueConstraint(name="UQ_TAG_tag_def_entity_id", columnNames={"tagDef", "tagSet"})
//)
@Audited
public class Tag extends Auditable<String> implements Serializable {

    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "tagDefId")
    private TagDef tagDef;

    @Column(length = 64)
    private String tagValue;

    //should be the URI of the referenced entity collection
    @OneToOne
    @JoinColumn(name = "entityType")
    private TagSet tagSet;

    //should be the URI to access the specific referenced entity
    private String entityId;

    @Column(length = 30)
    private String shortLink;

    @Column(length = 10)
    private String status;

    @Column(length = 100)
    private String redirectUri;
}
