/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.Set;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.io.Serializable;

@Entity
public class Toa implements Serializable {

	@Id
	@Column(name = "MaToa")
	private String maToa;

	@Column(name = "LoaiToa")
	private String loaiToa;


	@Column(name = "ViTri")
	private int viTri;
	
	@OneToMany(mappedBy = "toa")
	private Set<ChoNgoi> lisChoNgois;

	

    public Toa(String maToa, String loaiToa, int viTri) {
		super();
		this.maToa = maToa;
		this.loaiToa = loaiToa;
		this.viTri = viTri;
	}

	public Set<ChoNgoi> getLisChoNgois() {
        return lisChoNgois;
    }

    public void setLisChoNgois(Set<ChoNgoi> lisChoNgois) {
        this.lisChoNgois = lisChoNgois;
    }
	
	

	public int getViTri() {
		return viTri;
	}

	public void setViTri(int viTri) {
		this.viTri = viTri;
	}

	public Toa() {
	}

	public String getMaToa() {
		return maToa;
	}

	public void setMaToa(String maToa) {
		this.maToa = maToa;
	}

	public String getLoaiToa() {
		return loaiToa;
	}

	public void setLoaiToa(String loaiToa) {
		this.loaiToa = loaiToa;
	}

	@Override
	public String toString() {
		return "Toa [maToa=" + maToa + ", loaiToa=" + loaiToa + ", viTri=" + viTri + "]";
	}


	
}
