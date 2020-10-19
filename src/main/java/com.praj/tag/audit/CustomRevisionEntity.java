package com.praj.tag.audit;

//import com.querydsl.core.annotations.QueryExclude;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.envers.RevisionEntity;
import org.hibernate.envers.RevisionNumber;
import org.hibernate.envers.RevisionTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Objects;


@Entity
@RevisionEntity
//@QueryExclude
@Table(name = "REVINFO")
public class CustomRevisionEntity implements Serializable {

    @Id
    @RevisionNumber
    @GeneratedValue
    private int rev;

    @RevisionTimestamp
    private long revtstmp;

    @ColumnDefault("0")
    private boolean lastFetched;

    public int getRev() {
        return rev;
    }

    public void setRev(int rev) {
        this.rev = rev;
    }

    public long getRevtstmp() {
        return revtstmp;
    }

    public void setRevtstmp(long revtstmp) {
        this.revtstmp = revtstmp;
    }

    public boolean isLastFetched() {
        return lastFetched;
    }

    public void setLastFetched(boolean lastFetched) {
        this.lastFetched = lastFetched;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomRevisionEntity that = (CustomRevisionEntity) o;
        return rev == that.rev &&
                revtstmp == that.revtstmp &&
                lastFetched == that.lastFetched;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rev, revtstmp, lastFetched);
    }

    @Override
    public String toString() {
        return "CustomRevisionEntity{" +
                "rev=" + rev +
                ", revtstmp=" + revtstmp +
                ", lastFetched=" + lastFetched +
                '}';
    }
}
