package com.wallet.repository;

import com.wallet.entity.User;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {

    @Autowired
    UserRepository repository;

    @Test
    public void testSave() {
        User u = new User();
        u.setName("Teste");
        u.setPassword("123456");
        u.setEmail("test@teste.com");

        User response = repository.save(u);

        Assert.assertNotNull(response);
    }
}