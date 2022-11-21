/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entities.Admin;
import service.AdminService;
import util.HibernateUtil;

/**
 *
 * @author RANIA
 */
public class Test {
    public static void main(String[] args) {
        //HibernateUtil.getSessionFactory().openSession();
        
        
        AdminService as = new AdminService();
         as.create(new Admin("rania", "rania@gmail.com", "123"));
    }
}
