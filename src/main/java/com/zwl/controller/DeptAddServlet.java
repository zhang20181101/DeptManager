package com.zwl.controller;

import com.sun.javaws.exceptions.BadMimeTypeResponseException;
import com.zwl.dao.DeptDao;
import com.zwl.entity.Dept;
import com.zwl.utils.SqlSessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Zhang Weilei
 * @Program ${NAME}
 * @Description: TODO ${TODO}
 * @create 2021-05-12 22:58
 */
public class DeptAddServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
//        response.setCharacterEncoding("UTF-8");
        String deptNo = request.getParameter("deptNo");
        String dname = request.getParameter("dname");
        String loc = request.getParameter("loc");

        DeptDao dao = SqlSessionFactoryUtil.openSession(true).getMapper(DeptDao.class);
        Dept dept = new Dept(Integer.parseInt(deptNo) , dname , loc);
        int i = dao.insertDept(dept);
        if (i == 0) {
            request.setAttribute("info", "部门添加失败。。。");
        }else{
            request.setAttribute("info","部门添加成功。。。");
        }
        request.getRequestDispatcher("/info.jsp").forward(request,response);
    }
}
