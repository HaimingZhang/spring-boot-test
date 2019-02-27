package test;

import com.hemming.web.PO.UserPO;
import com.hemming.web.mapper.UserMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DataSourceTest extends BaseTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void listAllUser() {
        List<UserPO> userPOS = userMapper.listAllUser();
        System.out.println(userPOS);
    }

}
