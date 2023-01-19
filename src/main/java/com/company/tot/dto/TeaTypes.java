package com.company.tot.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.*;
import java.util.Objects;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "type")
public class TeaTypes {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String teaType;
    private String teaDescription;
    private Integer steepTime;
    private String steepUnit;
    private String caffeineLevel;
    private Integer teaTypeId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTeaType() {
        return teaType;
    }

    public void setTeaType(String teaType) {
        this.teaType = teaType;
    }

    public String getTeaDescription() {
        return teaDescription;
    }

    public void setTeaDescription(String teaDescription) {
        this.teaDescription = teaDescription;
    }

    public Integer getSteepTime() {
        return steepTime;
    }

    public void setSteepTime(Integer steepTime) {
        this.steepTime = steepTime;
    }

    public String getSteepUnit() {
        return steepUnit;
    }

    public void setSteepUnit(String steepUnit) {
        this.steepUnit = steepUnit;
    }

    public String getCaffeineLevel() {
        return caffeineLevel;
    }

    public void setCaffeineLevel(String caffeineLevel) {
        this.caffeineLevel = caffeineLevel;
    }

    public Integer getTeaTypeId() {
        return teaTypeId;
    }

    public void setTeaTypeId(Integer teaTypeId) {
        this.teaTypeId = teaTypeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TeaTypes)) return false;
        TeaTypes teaTypes = (TeaTypes) o;
        return Objects.equals(getId(), teaTypes.getId()) && Objects.equals(getTeaType(), teaTypes.getTeaType()) && Objects.equals(getTeaDescription(), teaTypes.getTeaDescription()) && Objects.equals(getSteepTime(), teaTypes.getSteepTime()) && Objects.equals(getSteepUnit(), teaTypes.getSteepUnit()) && Objects.equals(getCaffeineLevel(), teaTypes.getCaffeineLevel()) && Objects.equals(getTeaTypeId(), teaTypes.getTeaTypeId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getTeaType(), getTeaDescription(), getSteepTime(), getSteepUnit(), getCaffeineLevel(), getTeaTypeId());
    }
}

