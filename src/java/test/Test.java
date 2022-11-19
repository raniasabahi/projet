/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entities.Admin;
import entities.Client;
import javax.swing.text.html.CSS;
import org.hibernate.Hibernate;
import service.AdminService;
import service.ClientService;
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
       /* ClientService cs=new ClientService();
        cs.create(new Client("Soualime", "Ahmed", "0625748931", "Bd Massira", "soulami@gmail.com", "123"));
    
    for (Client e: cs.findAll()){
   
            System.out.println(e.getPrenom() + e.getNom());
    }*/
    }}
