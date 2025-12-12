package cput.ac.za.quickbite_project.services;

import java.util.List;

public interface IService <T, I> {

    public T save(T t);
    public boolean deleteById(I i);
    public T update(T t);
    public T findById(I i);
    public List<T> findAll();
}
