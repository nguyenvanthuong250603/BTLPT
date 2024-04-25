/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import java.io.Serializable;

@Entity
@NamedQueries({
	@NamedQuery(name = "NhanVien.findAll",query = "select nv from NhanVien nv where nv.loaiNV = :loai"),
	@NamedQuery(name ="NhanVien.findSdt", query = "select nv from NhanVien nv where nv.sdt = :sdt"),
	@NamedQuery(name ="NhanVien.findCccd", query = "select nv from NhanVien nv where nv.cccd = :cccd"),
	@NamedQuery(name = "NhanVien.findAllByMa",query = "select nv from NhanVien nv where nv.maNhanVien like :ma")
})
public class NhanVien implements Serializable {

    @Id
    @Column(name = "MaNhanVien", unique = true, nullable = false)
    private String maNhanVien;

    @Column(name = "HoTen", nullable = false, columnDefinition = "nvarchar(255)")
    private String hoTen;

    @Column(name = "CCCD", nullable = false)
    private String cccd;

    @Column(name = "SDT")
    private String sdt;

    @Column(name = "Email")
    private String email;
    
    @Column(name = "GioiTinh")
    private boolean gioiTinh;

    @Column(name = "DiaChi", columnDefinition = "nvarchar(255)")
    private String diaChi;

    @Column(name = "LoaiNV")
    private String loaiNV;

    @Column(name = "TrangThai")
    private boolean trangThai;

    @Column(name = "NgaySinh")
    private LocalDate ngaySinh;

    @Column(name = "NgayVaoLam 	")
    private LocalDate ngayVaoLam;

    @OneToOne(mappedBy = "nhanVien")
    private TaiKhoan taiKhoan;

    @OneToMany(mappedBy = "nhanVien")
    private Set<HoaDon> lisHoaDons;

    
    
    

    public NhanVien(String maNhanVien, String hoTen, String cccd, String sdt, String email, boolean gioiTinh,
			String diaChi, String loaiNV, boolean trangThai, LocalDate ngaySinh, LocalDate ngayVaoLam) {
		super();
		this.maNhanVien = maNhanVien;
		this.hoTen = hoTen;
		this.cccd = cccd;
		this.sdt = sdt;
		this.email = email;
		this.gioiTinh = gioiTinh;
		this.diaChi = diaChi;
		this.loaiNV = loaiNV;
		this.trangThai = trangThai;
		this.ngaySinh = ngaySinh;
		this.ngayVaoLam = ngayVaoLam;
	}



	public boolean isGioiTinh() {
		return gioiTinh;
	}



	public void setGioiTinh(boolean gioiTinh) {
		this.gioiTinh = gioiTinh;
	}



	public NhanVien() {
    }

    public Set<HoaDon> getLisHoaDons() {
        return lisHoaDons;
    }

    public void setLisHoaDons(Set<HoaDon> lisHoaDons) {
        this.lisHoaDons = lisHoaDons;
    }

    
    
    public TaiKhoan getTaiKhoan() {
        return taiKhoan;
    }

    public void setTaiKhoan(TaiKhoan taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getLoaiNV() {
        return loaiNV;
    }

    public void setLoaiNV(String loaiNV) {
        this.loaiNV = loaiNV;
    }

    public boolean getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public LocalDate getNgayVaoLam() {
        return ngayVaoLam;
    }

    public void setNgayVaoLam(LocalDate ngayVaoLam) {
        this.ngayVaoLam = ngayVaoLam;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "maNhanVien=" + maNhanVien + ", hoTen=" + hoTen + ", cccd=" + cccd + ", sdt=" + sdt + ", email=" + email + ", diaChi=" + diaChi + ", loaiNV=" + loaiNV + ", trangThai=" + trangThai + ", ngaySinh=" + ngaySinh + ", ngayVaoLam=" + ngayVaoLam + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.maNhanVien);
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
        final NhanVien other = (NhanVien) obj;
        return Objects.equals(this.maNhanVien, other.maNhanVien);
    }
}
