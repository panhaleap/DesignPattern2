package repository_practice;

public interface Repository<T> {
    public void add(T obj);
    public void remove(T obj);
    public String getAll();
}
