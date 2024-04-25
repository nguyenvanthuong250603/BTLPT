/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.io.Serializable;

@Entity
public class Ga implements Serializable {

    @Id
    @Column(name = "ID")
    private int id;
    
    @Column(name = "TenGa", nullable = false, columnDefinition = "nvarchar(255)")
    private String tenGa;

    @Column(name = "CuLy")
    private double cuLy;

    @Column(name = "DiaChi", columnDefinition = "nvarchar(255)")
    private String diaChi;


    @OneToMany(mappedBy = "ga")
    private Set<ChiTietVe> lisChiTietVes;

    public Ga() {
    }

    

    public Ga(int id, String tenGa, double cuLy, String diaChi) {
		super();
		this.id = id;
		this.tenGa = tenGa;
		this.cuLy = cuLy;
		this.diaChi = diaChi;
	}

    


	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getTenGa() {
        return tenGa;
    }

    public void setTenGa(String tenGa) {
        this.tenGa = tenGa;
    }

    public double getCuLy() {
        return cuLy;
    }

    public void setCuLy(double cuLy) {
        this.cuLy = cuLy;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }


    public Set<ChiTietVe> getLisChiTietVes() {
        return lisChiTietVes;
    }

    public void setLisChiTietVes(Set<ChiTietVe> lisChiTietVes) {
        this.lisChiTietVes = lisChiTietVes;
    }
    
    

    @Override
    public String toString() {
        return "Ga{" + "tenGa=" + tenGa + ", cuLy=" + cuLy + ", diaChi=" + diaChi + '}';
    }
}
