package com.zwl.dao;

import com.zwl.entity.Dept;
import javafx.scene.DepthTest;

import java.util.List;

/**
 * @author Zhang Weilei
 * @Program DeptDao
 * @Description: TODO ${TODO}
 * @create 2021-05-12 22:28
 */
public interface DeptDao {
    public int insertDept(Dept dept);
    public List findAll();
    public int deleteDept(String[] arr);
    public Dept selectOne(int deptNo);
}
