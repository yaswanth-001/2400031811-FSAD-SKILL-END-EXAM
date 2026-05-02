package com.klef.fsad.exam;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import java.util.Date;

public class ClientDemo {

 public static void main(String[] args) {

  SessionFactory sf = new Configuration()
    .configure()
    .addAnnotatedClass(CustomerAccount.class)
    .buildSessionFactory();

  Session session = sf.openSession();

  // INSERT
  Transaction tx = session.beginTransaction();

  CustomerAccount c = new CustomerAccount(
    "Mama", "Exam", new Date(), "ACTIVE"
  );

  session.save(c);
  tx.commit();

  // UPDATE
  tx = session.beginTransaction();

  CustomerAccount obj = session.get(CustomerAccount.class, c.getId());
  obj.setName("Updated");
  obj.setStatus("INACTIVE");

  tx.commit();

  session.close();
  sf.close();

  System.out.println("DONE");
 }
}