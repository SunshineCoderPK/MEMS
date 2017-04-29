package com.kaipan.mems.dao.base.Impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.kaipan.mems.dao.base.IBaseDao;

public abstract class BaseDaoImpl<T>extends HibernateDaoSupport implements IBaseDao<T> {
	//ʵ������
		private Class<T> entityClass;
		//ʹ��ע�ⷽʽ��������ע��
		@Resource
		public void setMySessionFactory(SessionFactory sessionFactory){
			super.setSessionFactory(sessionFactory);
		}
		
		/**
		 * �ڹ��췽���ж�̬��ò�����ʵ������
		 */
		public BaseDaoImpl() {
			//��ø��ࣨBaseDaoImpl<T>������
			ParameterizedType genericSuperclass = (ParameterizedType) this.getClass().getGenericSuperclass();
			//��ø����ϵķ�������
			Type[] actualTypeArguments = genericSuperclass.getActualTypeArguments();
			entityClass = (Class<T>) actualTypeArguments[0];
		}
		
		public void save(T entity) {
			this.getHibernateTemplate().save(entity);
		}

		public void delete(T entity) {
			this.getHibernateTemplate().delete(entity);
		}

		public void update(T entity) {
			this.getHibernateTemplate().update(entity);
		}

		public T findById(Serializable id) {
			return this.getHibernateTemplate().get(entityClass, id);
		}

		public List<T> findAll() {//FROM User
			String hql = "FROM  " + entityClass.getSimpleName();
			return (List<T>)(this.getHibernateTemplate().find(hql));
		}

		
//		@Override
//		public void executeUpdate(String queryName, Object... objects) {
//		// TODO Auto-generated method stub
//		
//		}
}
