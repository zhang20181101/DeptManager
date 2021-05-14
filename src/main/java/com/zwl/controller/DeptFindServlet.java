package com.zwl.controller;

import com.zwl.dao.DeptDao;
import com.zwl.entity.Dept;
import com.zwl.utils.SqlSessionFactoryUtil;
import org.apache.ibatis.executor.ReuseExecutor;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author Zhang Weilei
 * @Program ${NAME}
 * @Description: TODO ${TODO}
 * @create 2021-05-12 23:48
 */
public class DeptFindServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        DeptDao dao = SqlSessionFactoryUtil.openSession(true).getMapper(DeptDao.class);
        List<Dept> list = dao.findAll();
        request.setAttribute("list",list);
        request.getRequestDispatcher("/dept_show.jsp").forward(request,response);
    }
}
