package fr.eql.ai108.jee.idao.api;

public interface GenericIDao<T> {
	T add(T t);
	Boolean delete(T t);
	T update(T t);
	T findById(Integer id);
}
