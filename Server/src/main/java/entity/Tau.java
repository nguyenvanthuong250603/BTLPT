/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.io.Serializable;

@Entity
public class Tau implements Serializable {

	@Id
	@Column(name = "MaTau", nullable = false)
	private String maTau;

	@Column(name = "LoaiTau")
	private String loaiTau;

	@Column(name = "TenTau")
	private String tenTau;

	@Column(name = "TocDo")
	private double tocDo;

	@OneToMany(mappedBy = "tau")
	private List<ChoNgoi> lisChoNgois;

	@OneToMany(mappedBy = "tau")
	private List<Chuyen> lisChuyens;

	public Tau() {
	}

	public Tau(String maTau, String loaiTau, String tenTau, double tocDo) {
		super();
		this.maTau = maTau;
		this.loaiTau = loaiTau;
		this.tenTau = tenTau;
		this.tocDo = tocDo;
	}

	public List<Chuyen> getLisChuyens() {
		return lisChuyens;
	}

	public void setLisChuyens(List<Chuyen> lisChuyens) {
		this.lisChuyens = lisChuyens;
	}

	public List<ChoNgoi> getLisChoNgois() {
		return lisChoNgois;
	}

	public void setLisChoNgois(List<ChoNgoi> lisChoNgois) {
		this.lisChoNgois = lisChoNgois;
	}

	public String getMaTau() {
		return maTau;
	}

	public void setMaTau(String maTau) {
		this.maTau = maTau;
	}

	public String getLoaiTau() {
		return loaiTau;
	}

	public void setLoaiTau(String loaiTau) {
		this.loaiTau = loaiTau;
	}

	public String getTenTau() {
		return tenTau;
	}

	public void setTenTau(String tenTau) {
		this.tenTau = tenTau;
	}

	public double getTocDo() {
		return tocDo;
	}

	public void setTocDo(double tocDo) {
		this.tocDo = tocDo;
	}

	@Override
	public String toString() {
		return "Tau [maTau=" + maTau + ", loaiTau=" + loaiTau + ", tenTau=" + tenTau + ", tocDo=" + tocDo + "]";
	}

}
