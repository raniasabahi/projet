/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entities.Admin;
import entities.Categorie;
import entities.Client;
import entities.Produit;
import javax.swing.text.html.CSS;
import org.hibernate.Hibernate;
import service.AdminService;
import service.CategorieService;
import service.ClientService;
import service.ProduitService;
import util.HibernateUtil;

/**
 *
 * @author a
 */
public class Test {

    public static void main(String[] args) {

        HibernateUtil.getSessionFactory().openSession();
        AdminService as = new AdminService();
       /* as.create(new Admin( "nouha", "nouha@gmail.com", "0000"));*/
        /*ClientService cs=new ClientService();
        cs.create(new Client("Soualime", "Ahmed", "0625748931", "Bd Massira", "soulami@gmail.com", "123"));
    
    for (Client e: cs.findAll()){
   
            System.out.println(e.getPrenom() + e.getNom());
    }*/
        as.validate("nouha@gmail.com", "0000");
    }}




