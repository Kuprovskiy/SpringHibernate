package com.pms.dao;

import org.hibernate.criterion.Criterion;

import java.io.Serializable;
import java.util.List;

public interface AbstractDao<E, I extends Serializable> {

	E findById(I id);
	List<E> findByCriteria(Criterion criterion);
	List<E> findAll();
	I save(E e);
	void update(E e);
	void saveOrUpdate(E e);
	void delete(E e);
	void deleteById(I id);
	
}
