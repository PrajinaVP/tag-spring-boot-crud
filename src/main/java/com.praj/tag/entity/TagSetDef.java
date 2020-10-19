package com.praj.tag.entity;

import com.praj.tag.audit.Auditable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.envers.Audited;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Audited
@Table(name = "tag_set_def",
    uniqueConstraints = @UniqueConstraint(name = "UQ_TAG_DEF_SET_ID", columnNames = {"tagSetId", "tagDefId"})
)
public class TagSetDef extends Auditable<String> {

    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "tagSetId")
    private TagSet tagSet;

    @ManyToOne
    @JoinColumn(name = "tagDefId")
    private TagDef tagDef;

    @Column(columnDefinition = "boolean default true")
    private boolean required;
}
