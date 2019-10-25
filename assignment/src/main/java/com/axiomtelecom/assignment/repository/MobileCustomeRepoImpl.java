package com.axiomtelecom.assignment.repository;

import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(readOnly = true)
public class MobileCustomeRepoImpl implements MobileCustomeRepo {

	@PersistenceContext
	EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Override
	public List<Object[]> search(Map<String, String> requestMap) {

		String qry = "Select m.id, m.brand,m.phone,m.picture,r.announceDate,r.priceEuro,m.sim,m.resolution,h.audioJacks,h.gps,h.battery from Mobile m,Hardware h,Releases r where m.hardware.id=h.id AND m.hardware.id=r.id";

		String key = "";
		String value = "";

		for (Map.Entry<String, String> entry : requestMap.entrySet()) {
			key = entry.getKey();
			value = entry.getValue();

			if (key.equalsIgnoreCase("priceEuro")) {
				int v = Integer.parseInt(value);
				qry = qry + " AND " + key + " = " + v;
			} else {
				qry = qry + " AND " + key + " Like '%" + value + "%'";
			}
		}

		Query query = entityManager.createQuery(qry);

		return query.getResultList();
	}

}
