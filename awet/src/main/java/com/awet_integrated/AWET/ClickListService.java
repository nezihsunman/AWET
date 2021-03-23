package com.awet_integrated.AWET;

import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class ClickListService {
    public void saveClick(ClickList click) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            session.save(click);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public List<ClickList> getNameWithGroup(int test_case_number, String applicationName) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createNativeQuery("SELECT * FROM click_table D WHERE D.test_case_number =" + test_case_number + " AND " + "D.application_name = '" + applicationName + "' ORDER BY D.clickxpath ", ClickList.class).getResultList();
        }
    }
}