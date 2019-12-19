package edu.dlnu.oa;

import edu.dlnu.oa.mapper.Index;
import org.apache.ibatis.annotations.Select;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

@SpringBootTest
class OaApplicationTests {

    @Autowired
    Index index;
    @Test
    void contextLoads() {
    }
    @Test
    void testMabatis(){
        List<Map<String, String>> rankList = index.getRankList();
        System.out.print("----------------------"+ rankList.size());
    }

}
