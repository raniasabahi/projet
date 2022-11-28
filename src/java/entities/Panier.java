/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.ArrayList;
import org.hibernate.Session;
import util.HibernateUtil;

/**
 *
 * @author RANIA
 */
public class Panier {
    private ArrayList<LignePanier> items= new ArrayList<LignePanier>();

    public ArrayList<LignePanier> getItems() {
        return items;
    }

    public void setItems(ArrayList<LignePanier> items) {
        this.items = items;
    }
    
    public void addItem(int id, int qte){
        boolean flag = true;
        for(LignePanier lp:items){
            if(lp.getProduit().getId()==id){
                lp.setQte(lp.getQte()+qte);
                flag=false;
                break;
            }
        }
        if(flag){
            Session s = HibernateUtil.getSessionFactory().openSession();
            Produit pr = (Produit) s.get(Produit.class, id);
            LignePanier lp = new LignePanier(pr,qte);
            items.add(lp);
        }
        
    }

    public void augmenterQte(int id) {
        
      for(LignePanier lp:items){
            if(lp.getProduit().getId()==id){
                lp.setQte(lp.getQte()+1);
                
                break;
            }
        }  
    }
     public void diminuerQte(int id) {
        
      for(LignePanier lp:items){
            if(lp.getProduit().getId()==id){
                lp.setQte(lp.getQte()-1);
                if(lp.getQte()==0){
                    items.remove(lp);
                }
                
                break;
            }
        }  
    }
     
    public Double total(){
        Double t = 0.0;
        for(LignePanier lp : items){
          t+=lp.getProduit().getPrix()*lp.getQte();
        }
        return t;
    }

    
}
