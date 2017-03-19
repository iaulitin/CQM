package org.cqm.data.entity;

import javax.persistence.*;

@Entity
@Table(name = "Cafeterias")
@NamedQuery(name = "Cafeterias.getAll", query = "select c from Cafeteria c")
public class Cafeteria {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "my_entity_seq_gen")
    @SequenceGenerator(name = "my_entity_seq_gen", sequenceName = "cqm_id_sequence")
    @Column(name = "cafe_id")
    private Integer cafeId;

    @Column(name = "name")
    private String cafeName;

    @Column(name = "address")
    private String cafeAddress;

    @Column(name = "work_hours")
    private String workHours;

    public Cafeteria(Integer cafeId, String cafeName, String cafeAddress, String workHours) {
        this.cafeId = cafeId;
        this.cafeName = cafeName;
        this.cafeAddress = cafeAddress;
        this.workHours = workHours;
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

    public String getWorkHours() {
        return workHours;
    }

    public void setWorkHours(String workHours) {
        this.workHours = workHours;
    }

    @Override
    public String toString() {
        return "Cafeteria{" +
                "cafeId=" + cafeId +
                ", cafeName='" + cafeName + '\'' +
                ", cafeAddress='" + cafeAddress + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cafeteria cafeteria = (Cafeteria) o;

        if (cafeId != null ? !cafeId.equals(cafeteria.cafeId) : cafeteria.cafeId != null) return false;
        if (cafeName != null ? !cafeName.equals(cafeteria.cafeName) : cafeteria.cafeName != null) return false;
        if (workHours != null ? !workHours.equals(cafeteria.workHours) : cafeteria.workHours != null) return false;
        return cafeAddress != null ? cafeAddress.equals(cafeteria.cafeAddress) : cafeteria.cafeAddress == null;

    }

    @Override
    public int hashCode() {
        int result = cafeId != null ? cafeId.hashCode() : 0;
        result = 31 * result + (cafeName != null ? cafeName.hashCode() : 0);
        result = 31 * result + (cafeAddress != null ? cafeAddress.hashCode() : 0);
        result = 31 * result + (workHours != null ? workHours.hashCode() : 0);
        return result;
    }
}
