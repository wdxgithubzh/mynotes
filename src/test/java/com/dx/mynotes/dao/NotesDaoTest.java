package com.dx.mynotes.dao;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;

import com.dx.mynotes.entity.Notes;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Log4jConfigurer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:config/*.xml"})
public class NotesDaoTest {

    @Autowired
    public NotesDao notesDao;
    private static final Logger logger = Logger.getLogger(NotesDaoTest.class);
    static {
        try {
            Log4jConfigurer.initLogging("classpath:config/log4j.properties");
        } catch (FileNotFoundException ex) {

            System.err.println("Cannot Initialize log4j");
        }
    }

    /**
     * 此方法只会在运行所有单元测试前执行一次，通常用来获取数据库连接，spring管理的Bean等
     */
    @BeforeClass
    public static void init() {

    }

    /**
     * 此方法在每次单元测试前都会执行，通常用来准备数据或获取单元测试依赖的数据对象
     */
    @Before
    public void setUp() {

    }

    /**
     * 测试类的主要方法，在这里写所有的测试业务逻辑
     */
    @Test
    public void testfindByNotes_Id() {
        Notes tt = notesDao.findByNotes_Id("xiaomingdebiji");
        logger.info(tt);
    }

    @Test
    public void testfindByNoteBook_Id() {
        List<Map> list = notesDao.findByNoteBook_Id("2");
        logger.info(list);
    }


    /**
     * 此方法运行每个单元测试都会执行，主要用来和setUp对应，清理获取的资源
     */
    @After
    public void tearDown() {

    }

    /**
     * 此方法会在运行所有单元测试后执行一次，通常用来释放资源，例如数据库连接，IO流等
     */
    @AfterClass
    public static void destroy() {
        
    }
}