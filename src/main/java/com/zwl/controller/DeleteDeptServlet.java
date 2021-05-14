package com.zwl.controller;

import com.zwl.dao.DeptDao;
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
 * @create 2021-05-13 0:12
 */
public class DeleteDeptServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String[] cks = request.getParameterValues("ck");
        DeptDao dao = SqlSessionFactoryUtil.openSession(true).getMapper(DeptDao.class);
        dao.deleteDept(cks);
       request.getRequestDispatcher("/find").forward(request,response);
    }
}
