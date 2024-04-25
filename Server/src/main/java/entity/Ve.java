/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.time.LocalDateTime;
import java.util.Set;

import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import java.io.Serializable;

@Entity
@NamedQueries({
	@NamedQuery(name="Ve.FindByMaHd", query = "select v from Ve v where v.hoaDon.maHoaDon = :mhd and v.trangThai = true "),
	@NamedQuery(name="Ve.FindByMaVe", query = "select v from Ve v where v.maVe = :mv and v.trangThai = true "),
	@NamedQuery(
		    name = "Ve.updateDoiTra", 
				query = "UPDATE Ve v SET v.thoiGianLenTau = :newThoiGianLenTau , v.trangThai = :newTrangThai WHERE v.maVe = :maVe"		)
})
public class Ve implements Serializable {

    @Id
    @Column(name = "MaVe")
    private String maVe;

    @Column(name = "ThoiGianLenTau",columnDefinition = "datetime")
    private LocalDateTime thoiGianLenTau;
    
    @Column(name = "TrangThai")
    private boolean trangThai;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MaChuyen")
    private Chuyen chuyen;

    @ManyToOne
    @JoinColumn(name = "MaChoNgoi")
    private ChoNgoi choNgoi;

    @OneToMany(mappedBy = "ve")
    private Set<ChiTietVe> lisChiTietVes;

    @ManyToOne
    @JoinColumn(name = "MaKhuyenMai")
    private KhuyenMai khuyenMai;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CCCD")
    private KhachHang khachHang;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MaHoaDon")
    private HoaDon hoaDon;

    

    public Ve(String maVe, LocalDateTime thoiGianLenTau, boolean trangThai) {
		super();
		this.maVe = maVe;
		this.thoiGianLenTau = thoiGianLenTau;
		this.trangThai = trangThai;
	}

	public Ve() {
    }

    public Set<ChiTietVe> getLisChiTietVes() {
        return lisChiTietVes;
    }

    public void setLisChiTietVes(Set<ChiTietVe> lisChiTietVes) {
        this.lisChiTietVes = lisChiTietVes;
    }

    public HoaDon getHoaDon() {
        return hoaDon;
    }

    public void setHoaDon(HoaDon hoaDon) {
        this.hoaDon = hoaDon;
    }

    
    
    public String getMaVe() {
        return maVe;
    }

    public void setMaVe(String maVe) {
        this.maVe = maVe;
    }

    public LocalDateTime getThoiGianLenTau() {
        return thoiGianLenTau;
    }

    public void setThoiGianLenTau(LocalDateTime thoiGianLenTau) {
        this.thoiGianLenTau = thoiGianLenTau;
    }

    public Chuyen getChuyen() {
        return chuyen;
    }

    public void setChuyen(Chuyen chuyen) {
        this.chuyen = chuyen;
    }

    public ChoNgoi getChoNgoi() {
        return choNgoi;
    }

    public void setChoNgoi(ChoNgoi choNgoi) {
        this.choNgoi = choNgoi;
    }

    public KhuyenMai getKhuyenMai() {
        return khuyenMai;
    }

    public void setKhuyenMai(KhuyenMai khuyenMai) {
        this.khuyenMai = khuyenMai;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }
    
    

    public boolean isTrangThai() {
		return trangThai;
	}

	public void setTrangThai(boolean trangThai) {
		this.trangThai = trangThai;
	}

	@Override
	public String toString() {
		return "Ve [maVe=" + maVe + ", thoiGianLenTau=" + thoiGianLenTau + ", trangThai=" + trangThai + "]";
	}

	

}
