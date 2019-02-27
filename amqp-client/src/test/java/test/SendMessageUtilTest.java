package test;

import com.hemming.rabbitmq.util.SendMessageUtil;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class SendMessageUtilTest {
    @Autowired
    private SendMessageUtil sendMessageUtil;

    @Test
    public void send () {
        sendMessageUtil.send();
    }

}