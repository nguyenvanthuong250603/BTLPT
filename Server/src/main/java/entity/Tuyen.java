/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.List;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import java.io.Serializable;

@Entity
public class Tuyen implements Serializable {

	@Id
	@Column(name = "MaTuyen", nullable = false)
	private String maTuyen;

	@Column(name = "TenTuyen", columnDefinition = "nvarchar(255)")
	private String tenTuyen;

	@OneToMany(mappedBy = "tuyen")
	private List<Chuyen> listChuyens;

	@ManyToMany
	@JoinTable(name = "ChiTietTuyen", joinColumns = { 
			@JoinColumn(name = "MaTuyen") }, inverseJoinColumns = {
			@JoinColumn(name = "ID") })
	private Set<Ga> listGas;

	public Tuyen() {
	}

	public Tuyen(String maTuyen, String tenTuyen) {
		this.maTuyen = maTuyen;
		this.tenTuyen = tenTuyen;

	}

	public List<Chuyen> getListChuyens() {
		return listChuyens;
	}

	public void setListChuyens(List<Chuyen> listChuyens) {
		this.listChuyens = listChuyens;
	}

	

	public String getMaTuyen() {
		return maTuyen;
	}

	public void setMaTuyen(String maTuyen) {
		this.maTuyen = maTuyen;
	}

	public String getTenTuyen() {
		return tenTuyen;
	}

	public void setTenTuyen(String tenTuyen) {
		this.tenTuyen = tenTuyen;
	}

	@Override
	public String toString() {
		return "Tuyen{" + "maTuyen=" + maTuyen + ", tenTuyen=" + tenTuyen + '}';
	}
}
