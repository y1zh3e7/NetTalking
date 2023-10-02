package Dao;

import com.mysql.cj.xdevapi.SessionFactory;
import org.zjm.Dao.UserDao;
import org.zjm.pojo.User;
import org.zjm.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {

    @Test
    public void  test()
    {
        // SqlSession类为链接数据库的一次会话
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        // 给getMapper传入接口的Class对象 返回的对象可以直接调用接口中的方法 无需在其他类中实现该接口
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        List<User> userList = userDao.getUserList();
        for (User user : userList) {
            System.out.println(user);
        }
        // SqlSession在进行一次链接后要断开链接
        sqlSession.close();
    }
}
