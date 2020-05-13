/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibraryUtils;

/**
 *
 * @author Shejadelin
 */
import LibraryModels.Operation;
import LibraryModels.Client;
import LibraryModels.Book;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class OperationsDAO {
    
    public void insert(Operation check){
        Session session =LibraryUtils.Libconnect.getSessionFactory().openSession();
        Transaction transaction= session.beginTransaction();
        session.save(check);
        transaction.commit();
        session.close();
}     
  
    public List<Operation> select(){
      Session session =LibraryUtils.Libconnect.getSessionFactory().openSession();
      Transaction transaction= session.beginTransaction();
      String HQL = "from Checkinout";
      Query query = session.createQuery(HQL);
      
      List<Operation> list = query.list();

      transaction.commit();
      session.close();
      return list;
     } 
    
   
    
}
