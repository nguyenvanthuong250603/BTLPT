/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.Objects;
import java.util.Set;

import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.io.Serializable;

@Entity
@NamedQueries({
	@NamedQuery(name = "KhachHang.findAll", query = "select kh from KhachHang kh"),
	@NamedQuery(name ="KhachHang.findSdt", query = "select kh from KhachHang kh where kh.sdt = :sdt"),
        @NamedQuery(name ="KhachHang.findCccd", query = "select kh from KhachHang kh where kh.cccd = :cccd")
})
public class KhachHang implements Serializable {

    @Id
    @Column(name = "CCCD", unique = true, nullable = false)
    private String cccd;
    
    @Column(name = "SDT")
    private String sdt;

    @Column(name = "HoTen",nullable = false,columnDefinition = "nvarchar(255)")
    private String hoTen;

    @Column(name = "Email")
    private String email;


    @Column(name = "DoiTuong",nullable = false,columnDefinition = "nvarchar(255)")
    private String doiTuong;

    @OneToMany(mappedBy = "khachHang")
    private Set<Ve> lisVes;

    @OneToMany(mappedBy = "khachHang")
    private Set<HoaDon> lisHoaDons;

    public Set<Ve> getLisVes() {
        return lisVes;
    }

    public void setLisVes(Set<Ve> lisVes) {
        this.lisVes = lisVes;
    }

    public Set<HoaDon> getLisHoaDons() {
        return lisHoaDons;
    }

    public void setLisHoaDons(Set<HoaDon> lisHoaDons) {
        this.lisHoaDons = lisHoaDons;
    }
    

    public KhachHang(String cccd, String hoTen, String doiTuong) {
		super();
		this.cccd = cccd;
		this.hoTen = hoTen;
		this.doiTuong = doiTuong;
	}
    
    

	public KhachHang(String cccd, String sdt, String hoTen, String email) {
		super();
		this.cccd = cccd;
		this.sdt = sdt;
		this.hoTen = hoTen;
		this.email = email;
	}

	public KhachHang(String cccd, String hoTen, String email, String sdt, String doiTuong) {
        this.cccd = cccd;
        this.hoTen = hoTen;
        this.email = email;
        this.sdt = sdt;
        this.doiTuong = doiTuong;
    }

    public KhachHang() {
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDoiTuong() {
        return doiTuong;
    }

    public void setDoiTuong(String doiTuong) {
        this.doiTuong = doiTuong;
    }

    @Override
    public String toString() {
        return "KhachHang{" + "cccd=" + cccd + ", hoTen=" + hoTen + ", email=" + email + ", sdt=" + sdt + ", doiTuong=" + doiTuong + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.cccd);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final KhachHang other = (KhachHang) obj;
        return Objects.equals(this.cccd, other.cccd);
    }
}
