/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import java.io.Serializable;
import java.util.List;

@Entity
public class ChoNgoi implements Serializable {

    @Id
    @Column(name = "MaChoNgoi")
    private String maChoNgoi;

    @Column(name = "MoTa", columnDefinition = "nvarchar(255)")
    private String moTa;

    @Column(name = "Gia")
    private double gia;

    @Column(name = "ViTri")
    private int viTri;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MaTau")
    private Tau tau;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MaToa")
    private Toa toa;

    @OneToMany(mappedBy = "choNgoi")
    private List<Ve> listVes;

    public ChoNgoi() {
    }

    

    public ChoNgoi(String maChoNgoi, String moTa, double gia, int viTri) {
		super();
		this.maChoNgoi = maChoNgoi;
		this.moTa = moTa;
		this.gia = gia;
		this.viTri = viTri;
	}



	public String getMaChoNgoi() {
        return maChoNgoi;
    }

    public void setMaChoNgoi(String maChoNgoi) {
        this.maChoNgoi = maChoNgoi;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public int getViTri() {
        return viTri;
    }

    public void setViTri(int viTri) {
        this.viTri = viTri;
    }

    public Tau getTau() {
        return tau;
    }

    public void setTau(Tau tau) {
        this.tau = tau;
    }

    public Toa getToa() {
        return toa;
    }

    public void setToa(Toa toa) {
        this.toa = toa;
    }



	@Override
	public String toString() {
		return "ChoNgoi [maChoNgoi=" + maChoNgoi + ", moTa=" + moTa + ", gia=" + gia + ", viTri=" + viTri + "]";
	}

    
}
