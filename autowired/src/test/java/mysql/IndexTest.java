package mysql;

import config.BeanConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = BeanConfig.class)
public class IndexTest {

    @Autowired
    private Index index;

    @Test
    public void myself(){
        index.effect();
        index.selfIntroduction();
        index.whyUse();
    }

    @Test
    public void algorithm(){
        index.algorithmImplementation();
    }
}