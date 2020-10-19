//package com.praj.tag.entity;
//
//
//import com.praj.tag.audit.Auditable;
//import lombok.*;
//import org.hibernate.envers.Audited;
//
//import javax.persistence.*;
//import java.time.LocalDate;
//
//@Entity
//@Data
//@Builder
//@NoArgsConstructor
//@AllArgsConstructor
//@EqualsAndHashCode
//@ToString
////@Table(name="tag_definition",
////        uniqueConstraints =
////            @UniqueConstraint(name="UQ_TAG_DEF_value", columnNames = {"value"})
////)
//@Audited
//public class TagDefinition extends Auditable<String> {
//
//    @Id
//    @Column(length = 15)
//    private String tagId;
//
//    //@Column(length = 25, nullable = false)
//    //private String value;
//
//    @Column(length = 15, nullable = false)
//    private String type;
//
//    @Column(length = 50)
//    private String description;
//
//    private LocalDate effectiveDate;
//
//    private LocalDate retirementDate;
//
//}
