package dataAccess.abstracts;

import entitiy.concrete.User;

public interface DaoService {
    void add(User user);
    void delete(User user);
    void update(User user);
}
