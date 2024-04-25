package dao.ipml;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import dao.ChoNgoiDao;
import entity.ChoNgoi;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ChoNgoiDaoIpml extends UnicastRemoteObject implements ChoNgoiDao {

	private EntityManager em;

	public ChoNgoiDaoIpml() throws RemoteException {
		em = Persistence.createEntityManagerFactory("Server").createEntityManager();
	}

	// lấy Chỗ ngồi bằng mã
	public ChoNgoi getChoNgoiByMa(String ma) throws RemoteException {
		return em.find(ChoNgoi.class, ma);
	}

	// lấy toàn bộ danh sách Chỗ ngồi
	public List<ChoNgoi> getAllChoNgoi() throws RemoteException {
		return em.createNamedQuery("ChoNgoi.findAll", ChoNgoi.class).getResultList();
	}

//	Lấy danh sách ghế còn trống
	public List<ChoNgoi> getAllChoNgoiTrong(int id1, int id2, String maChuyen, boolean trangThai)
			throws RemoteException {
		String jpql = "SELECT c FROM ChoNgoi c " + "WHERE c.maChoNgoi NOT IN (" + "    SELECT v.choNgoi.maChoNgoi "
				+ "    FROM Ve v " + "    JOIN v.lisChiTietVes ctv "
				+ "    WHERE v.chuyen.maChuyen = :maChuyen AND ve.trangThai = :trangThai "
				+ "    GROUP BY v.choNgoi.maChoNgoi " + "    HAVING "
				+ "    MAX(CASE WHEN ctv.chieu = true THEN ctv.ga.id END) = :id1Param " + "    OR "
				+ "    (MAX(CASE WHEN ctv.chieu = true THEN ctv.ga.id END)" + (id1 < id2 ? " < " : " > ") + ":id1Param "
				+ "    AND MAX(CASE WHEN ctv.chieu = false THEN ctv.ga.id END)" + (id1 < id2 ? " > " : " < ")
				+ ":id1Param) " + "    OR " + "    (MAX(CASE WHEN ctv.chieu = true THEN ctv.ga.id END)"
				+ (id1 < id2 ? " < " : " > ") + ":id2Param "
				+ "    AND MAX(CASE WHEN ctv.chieu = false THEN ctv.ga.id END)" + (id1 < id2 ? " > " : " < ")
				+ ":id2Param) " + "    OR " + "    (MAX(CASE WHEN ctv.chieu = true THEN ctv.ga.id END)"
				+ (id1 < id2 ? " > " : " < ") + ":id1Param "
				+ "    AND MAX(CASE WHEN ctv.chieu = false THEN ctv.ga.id END)" + (id1 < id2 ? " < " : " > ")
				+ ":id2Param)" + ")";

		List<ChoNgoi> results = em.createQuery(jpql, ChoNgoi.class).setParameter("maChuyen", maChuyen)
				.setParameter("trangThai", trangThai).setParameter("id1Param", id1).setParameter("id2Param", id2)
				.getResultList();

		return results;
	}

	public List<ChoNgoi> getAllChoNgoiTrongVTToa(int id1, int id2, String maChuyen, int viTri, boolean trangThai)
			throws RemoteException {
		String jpql = "SELECT c FROM ChoNgoi c JOIN c.toa t" + " WHERE t.viTri = :viTri AND c.maChoNgoi NOT IN ("
				+ "    SELECT v.choNgoi.maChoNgoi " + "    FROM Ve v " + "    JOIN v.lisChiTietVes ctv "
				+ "    WHERE v.chuyen.maChuyen = :maChuyen AND ve.trangThai = :trangThai "
				+ "    GROUP BY v.choNgoi.maChoNgoi " + "    HAVING "
				+ "    MAX(CASE WHEN ctv.chieu = true THEN ctv.ga.id END) = :id1Param " + "    OR "
				+ "    (MAX(CASE WHEN ctv.chieu = true THEN ctv.ga.id END)" + (id1 < id2 ? " < " : " > ") + ":id1Param "
				+ "    AND MAX(CASE WHEN ctv.chieu = false THEN ctv.ga.id END)" + (id1 < id2 ? " > " : " < ")
				+ ":id1Param) " + "    OR " + "    (MAX(CASE WHEN ctv.chieu = true THEN ctv.ga.id END)"
				+ (id1 < id2 ? " < " : " > ") + ":id2Param "
				+ "    AND MAX(CASE WHEN ctv.chieu = false THEN ctv.ga.id END)" + (id1 < id2 ? " > " : " < ")
				+ ":id2Param) " + "    OR " + "    (MAX(CASE WHEN ctv.chieu = true THEN ctv.ga.id END)"
				+ (id1 < id2 ? " > " : " < ") + ":id1Param "
				+ "    AND MAX(CASE WHEN ctv.chieu = false THEN ctv.ga.id END)" + (id1 < id2 ? " < " : " > ")
				+ ":id2Param)" + ")";

		List<ChoNgoi> results = em.createQuery(jpql, ChoNgoi.class).setParameter("viTri", viTri)
				.setParameter("maChuyen", maChuyen).setParameter("trangThai", trangThai).setParameter("id1Param", id1)
				.setParameter("id2Param", id2).getResultList();

		return results;
	}
}
