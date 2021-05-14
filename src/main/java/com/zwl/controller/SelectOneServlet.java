package com.zwl.controller;

import com.zwl.dao.DeptDao;
import com.zwl.entity.Dept;
import com.zwl.utils.SqlSessionFactoryUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Zhang Weilei
 * @Program ${NAME}
 * @Description: TODO ${TODO}
 * @create 2021-05-13 1:05
 */
public class SelectOneServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        int deptNo = Integer.parseInt(request.getParameter("deptNo"));
        DeptDao dao = SqlSessionFactoryUtil.openSession(true).getMapper(DeptDao.class);
        Dept dept = dao.selectOne(deptNo);
        request.setAttribute("dept" , dept);
        request.getRequestDispatcher("/find_one.jsp").forward(request,response);
    }
}
