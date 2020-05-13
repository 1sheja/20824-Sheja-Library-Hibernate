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
import LibraryModels.Book;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
public class BookDAO {
    
    public void insert(Book book){
        Session session =LibraryUtils.Libconnect.getSessionFactory().openSession();
        Transaction transaction= session.beginTransaction();
        session.save(book);
        transaction.commit();
        session.close();
}
   
    
    public List<Book> select(){
      Session session =LibraryUtils.Libconnect.getSessionFactory().openSession();
      Transaction transaction= session.beginTransaction();
      String HQL = "from BookInfo";
      Query query = session.createQuery(HQL);
      
      List<Book> list = query.list();

      transaction.commit();
      session.close();
      return list;
     } 
   
    
}
