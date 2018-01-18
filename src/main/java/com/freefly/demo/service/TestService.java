package com.freefly.demo.service;

import com.freefly.demo.dao.mapper.UnificationOrderMapper;
import com.freefly.demo.model.UnificationOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jiangrushe on 18/1/18.
 */
@Service
public class TestService {

    @Autowired
    private UnificationOrderMapper unificationOrderMapper;


    public void test(){
        List<UnificationOrder> list = unificationOrderMapper.selectAll();
        list.forEach(UnificationOrder -> System.out.println(UnificationOrder));
        UnificationOrder unificationOrder = new UnificationOrder();
        unificationOrderMapper.insert(unificationOrder);
    }

}
