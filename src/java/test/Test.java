/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entities.Admin;
import entities.Client;
import service.AdminService;
import service.ClientService;
import util.HibernateUtil;

/**
 *
 * @author RANIA
 */
public class Test {
    public static void main(String[] args) {
        //HibernateUtil.getSessionFactory().openSession();
        
        ClientService c = new ClientService();
        AdminService as = new AdminService();
         //as.create(new Admin("rania", "rania@gmail.com", "123"));
         c.create(new Client("moustaghit", "nouhaila", "556678", "667889", "Nouhaila@gmail.com", "234"));
         
       
    }
}
