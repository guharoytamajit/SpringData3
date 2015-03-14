package com.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class GenericDaoJpaImpl2<T, PK extends Serializable> implements
		GenericDao<T, PK> {

	protected Class<T> entityClass;

	@PersistenceContext(unitName = "ds2")
	protected EntityManager entityManager;

	public GenericDaoJpaImpl2() {
		ParameterizedType genericSuperclass = (ParameterizedType) getClass()
				.getGenericSuperclass();
		this.entityClass = (Class<T>) genericSuperclass
				.getActualTypeArguments()[0];
	}

	public T create(T t) {
		this.entityManager.persist(t);
		return t;
	}

	public T read(PK id) {
		return this.entityManager.find(entityClass, id);
	}

	public T update(T t) {
		return this.entityManager.merge(t);
	}

	public void delete(T t) {
		t = this.entityManager.merge(t);
		this.entityManager.remove(t);
	}
}