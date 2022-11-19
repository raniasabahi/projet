/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entities.Admin;
import org.hibernate.Hibernate;
import service.AdminService;
import util.HibernateUtil;

/**
 *
 * @author a
 */
public class Test {
    public static void main(String[] args) {
        HibernateUtil.getSessionFactory().openSession();
        /*AdminService as = new AdminService();
        as.create(new Admin( "nouha", "nouha@gmail.com", "123"));*/
    }
}
