package entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.io.Serializable;

@Entity
public class ChiTietVe implements Serializable {

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MaVe")
    private Ve ve;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID")
    private Ga ga;

    @Column(name = "Chieu")
    private boolean chieu;

    public ChiTietVe(boolean chieu) {
        this.chieu = chieu;
    }
    
    

    public ChiTietVe( Ga ga, boolean chieu) {
		super();
		this.ga = ga;
		this.chieu = chieu;
	}



	public ChiTietVe(Ve ve, Ga ga, boolean chieu) {
		super();
		this.ve = ve;
		this.ga = ga;
		this.chieu = chieu;
	}



	public ChiTietVe() {
    }

    public Ve getVe() {
        return ve;
    }

    public void setVe(Ve ve) {
        this.ve = ve;
    }

    public Ga getGa() {
        return ga;
    }

    public void setGa(Ga ga) {
        this.ga = ga;
    }

    public boolean isChieu() {
        return chieu;
    }

    public void setChieu(boolean chieu) {
        this.chieu = chieu;
    }
    

}
