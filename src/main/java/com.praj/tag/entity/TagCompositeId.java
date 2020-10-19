//package com.praj.tag.entity;
//
//import lombok.*;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
//import org.yaml.snakeyaml.tokens.BlockEndToken;
//
//import javax.persistence.*;
//import java.io.Serializable;
//
//
//@Data
//@Builder
//@AllArgsConstructor
//@NoArgsConstructor
//@EqualsAndHashCode
//@ToString
//@Embeddable
//public class TagCompositeId implements Serializable {
//
//    @ManyToOne
//    @JoinColumn(name = "tagId")
//    private TagDefinition tagDefinition;
//    @Column(length = 50)
//    private String value;
//    @Column(length = 100)
//    private String uri;
//
//}
