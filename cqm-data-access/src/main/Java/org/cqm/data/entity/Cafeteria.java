package org.cqm.data.entity;

import javax.persistence.*;

@Entity
@Table (name = "Cafeterias")
@NamedQuery(name = "Cafeterias.getAll", query = "select c from Cafeterias c")
public class Cafeteria {
    @Id
    private Integer cafeId;
    @Column(name = "name")
    private String cafeName;
    @Column (name = "address")
    private String cafeAddress;

    public Cafeteria(Integer cafeId, String cafeName, String cafeAddress) {
        this.cafeId = cafeId;
        this.cafeName = cafeName;
        this.cafeAddress = cafeAddress;
    }

    public Cafeteria() {

    }

    public Integer getCafeId() {
        return cafeId;
    }

    public void setCafeId(Integer cafeId) {
        this.cafeId = cafeId;
    }

    public String getCafeName() {
        return cafeName;
    }

    public void setCafeName(String cafeName) {
        this.cafeName = cafeName;
    }

    public String getCafeAddress() {
        return cafeAddress;
    }

    public void setCafeAddress(String cafeAddress) {
        this.cafeAddress = cafeAddress;
    }

    @Override
    public String toString() {
        return "Cafeteria{" +
                "cafeId=" + cafeId +
                ", cafeName='" + cafeName + '\'' +
                ", cafeAddress='" + cafeAddress + '\'' +
                '}';
    }
}
