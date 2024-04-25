package model;

import java.awt.Component;
import java.util.Objects;

import entity.ChoNgoi;

public class Model_InfoVe {
	private Model_Tau chuyen;
	private ChoNgoi choNgoi;
	private Component item;

	public Model_InfoVe(Model_Tau chuyen, ChoNgoi choNgoi, Component item) {
		super();
		this.chuyen = chuyen;
		this.choNgoi = choNgoi;
		this.item = item;
	}

	public Model_Tau getChuyen() {
		return chuyen;
	}

	public void setChuyen(Model_Tau chuyen) {
		this.chuyen = chuyen;
	}

	public ChoNgoi getChoNgoi() {
		return choNgoi;
	}

	public void setChoNgoi(ChoNgoi choNgoi) {
		this.choNgoi = choNgoi;
	}
	
	

	public Component getItem() {
		return item;
	}

	public void setItem(Component item) {
		this.item = item;
	}

	private int tangVt(int vt) {
		if (vt < 3)
			return 1;
		if (vt < 5)
			return 2;
		return 3;
	}

	public String getcheckCho(String moTa, int vt) {
		if (!moTa.equalsIgnoreCase("Ngồi mền"))
			return "Nằm " + choNgoi.getMoTa() + " điều hòa tầng " + tangVt(vt);

		return moTa;
	}

	public String getThongTinChuyen() {
		return chuyen.getMaTau() + " " + chuyen.getGaDi().getTenGa() + " - " +chuyen.getGaDen().getTenGa();
	}

	public String getInfoCho() {
		return "Toa " + choNgoi.getToa().getViTri() + " chổ " + choNgoi.getViTri();
	}

	@Override
	public String toString() {
		return chuyen.getMaTau() + " " + chuyen.getChuyen().getTenCHuyen() + "\n" + chuyen.getTGDi() + "\n" + "Toa "
				+ choNgoi.getToa().getViTri() + " chổ " + choNgoi.getViTri() + "\n"
				+ getcheckCho(choNgoi.getMoTa(), choNgoi.getViTri());
	}

	@Override
	public int hashCode() {
		return Objects.hash(choNgoi, chuyen);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Model_InfoVe other = (Model_InfoVe) obj;
		return Objects.equals(choNgoi, other.choNgoi) && Objects.equals(chuyen, other.chuyen);
	}
	

}
