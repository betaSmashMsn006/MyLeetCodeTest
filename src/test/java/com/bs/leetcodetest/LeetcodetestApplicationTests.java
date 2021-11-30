package com.bs.leetcodetest;

import com.bs.leetcodetest.dataStruct.DataStructQuestion;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class LeetcodetestApplicationTests {

    @Test
    void testthreeSum() {
        DataStructQuestion dataStructQuestion = new DataStructQuestion();
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> reult = dataStructQuestion.threeSum(nums);
    }

}
