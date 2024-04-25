/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToOne;
import java.io.Serializable;

@Entity
@NamedQueries({
	@NamedQuery(name = "TaiKhoan.findAll",query = "select tk from TaiKhoan tk")
})
public class TaiKhoan implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @Column(name = "TenTaiKhoan")
    private String tenTaiKhoan;

    @Column(name = "MatKhau")
    private String matKhau;

    @OneToOne()
    @JoinColumn(name = "MaNhanVien", unique = true, nullable = false)
    private NhanVien nhanVien;

    

    public TaiKhoan(String tenTaiKhoan, String matKhau) {
		super();
		this.tenTaiKhoan = tenTaiKhoan;
		this.matKhau = matKhau;
	}



	public TaiKhoan() {
    }
    
    

    public String getTenTaiKhoan() {
        return tenTaiKhoan;
    }

    public void setTenTaiKhoan(String tenTaiKhoan) {
        this.tenTaiKhoan = tenTaiKhoan;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }

    @Override
    public String toString() {
        return "TaiKhoan{" + "tenTaiKhoan=" + tenTaiKhoan + ", matKhau=" + matKhau + ", nhanVien=" + nhanVien + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + Objects.hashCode(this.tenTaiKhoan);
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
        final TaiKhoan other = (TaiKhoan) obj;
        return Objects.equals(this.tenTaiKhoan, other.tenTaiKhoan);
    }
}
