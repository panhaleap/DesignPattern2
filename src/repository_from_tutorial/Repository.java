package repository_from_tutorial;

public interface Repository<T>
{
    void add(T obj);
    void remove(T obj);

    String getAll();
}
