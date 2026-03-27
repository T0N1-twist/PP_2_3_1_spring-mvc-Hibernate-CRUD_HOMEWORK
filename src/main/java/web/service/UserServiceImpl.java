package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.UserDao;
import web.model.User;

import javax.transaction.Transactional;
import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();

    }

    @Override
    @Transactional
    public void saveUser(User user) {
        this.userDao.saveUser(user);

    }

    @Override
    public User getUserById(Long id) {
        return this.userDao.getUserById(id);

    }

    @Override
    public void updateUser(User user) {
        this.userDao.updateUser(user);

    }

    @Override
    public void deleteUser(Long id) {
        this.userDao.deleteUser(id);

    }



}
