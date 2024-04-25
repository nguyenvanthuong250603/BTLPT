/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import org.hibernate.annotations.NamedQueries;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;


import jakarta.persistence.OneToMany;
import java.io.Serializable;

@Entity
@NamedQueries({
	@org.hibernate.annotations.NamedQuery(name = "HoaDon.findAll",query = "select hd from HoaDon hd")
})
public class HoaDon implements Serializable {

    @Id
    @Column(name = "MaHoaDon")
    private String maHoaDon;

    @Column(name = "GioTao",columnDefinition = "datetime")
    private LocalTime gioTao;

    @Column(name = "NgayTao")
    private LocalDate ngayTao;

    @Column(name = "TrangThai")
    private boolean trangThai;

    @ManyToOne
    @JoinColumn(name = "MaNhanVien")
    private NhanVien nhanVien;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CCCD")
    private KhachHang khachHang;

    @OneToMany(mappedBy = "hoaDon")
    private List<Ve> listVes;

    @ManyToMany
    @JoinTable(name = "ChiTietKhuyenMai", joinColumns = {
        @JoinColumn(name = "MaHoaDon")}, inverseJoinColumns = {
        @JoinColumn(name = "MaKhuyenMai")})
    private Set<KhuyenMai> lisKhuyenMais;

    public HoaDon() {
    }

    public Set<KhuyenMai> getLisKhuyenMais() {
        return lisKhuyenMais;
    }

    public void setLisKhuyenMais(Set<KhuyenMai> lisKhuyenMais) {
        this.lisKhuyenMais = lisKhuyenMais;
    }
    
    public HoaDon(String maHoaDon, LocalTime gioTao, LocalDate ngayTao, boolean trangThai) {
		super();
		this.maHoaDon = maHoaDon;
		this.gioTao = gioTao;
		this.ngayTao = ngayTao;
		this.trangThai = trangThai;
	}

	public List<Ve> getListVes() {
        return listVes;
    }

    public void setListVes(List<Ve> listVes) {
        this.listVes = listVes;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public LocalTime getGioTao() {
        return gioTao;
    }

    public void setGioTao(LocalTime gioTao) {
        this.gioTao = gioTao;
    }

    public LocalDate getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(LocalDate ngayTao) {
        this.ngayTao = ngayTao;
    }

    

    public boolean isTrangThai() {
		return trangThai;
	}

	public void setTrangThai(boolean trangThai) {
		this.trangThai = trangThai;
	}

	public NhanVien getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }
    
    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    @Override
    public String toString() {
        return "HoaDon{" + "maHoaDon=" + maHoaDon + ", gioTao=" + gioTao + ", ngayTao=" + ngayTao + ", trangThai=" + trangThai + ", nhanVien=" + nhanVien + ", khachHang=" + khachHang + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.maHoaDon);
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
        final HoaDon other = (HoaDon) obj;
        return Objects.equals(this.maHoaDon, other.maHoaDon);
    }
}
