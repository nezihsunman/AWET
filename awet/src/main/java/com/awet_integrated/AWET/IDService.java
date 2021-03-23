package com.awet_integrated.AWET;

import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.*;
import java.util.stream.Collectors;

public class IDService {
    public void saveID(ID student) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            session.save(student);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public List<ID> getNameWithGroup(int test_case_number, String applicationName) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createNativeQuery("SELECT * FROM id_table D WHERE D.test_Case_number = " + test_case_number + " AND " + "D.application_name = '" + applicationName + "' ORDER BY D.xpath, D.user_key", ID.class).getResultList();
        }
    }

    public Map<String, Collection<List<ID>>> getIdWithHaspMap(int test_case_number, String applicationName) {
        List<ID> listOfId = this.getNameWithGroup(test_case_number, applicationName);
        HashMap<String, List<ID>> uniqueList = new HashMap<String, List<ID>>();
        Map<String, Collection<List<ID>>> m = listOfId.stream().collect(Collectors.groupingBy(ID::getXpathOfElementForSendingValueBeforeClick, Collectors.collectingAndThen(Collectors.groupingBy(ID::getKeyOfValue), Map::values)));
        return m;

        /*for (ID id : listOfId) {
            if (uniqueList.containsKey(id.getXpathOfElementForSendingValueBeforeClick())) {
                uniqueList.get(id.getXpathOfElementForSendingValueBeforeClick()).add(id);
            } else {
                List<ID> tempList = new ArrayList<ID>();
                tempList.add(id);
                uniqueList.put(id.getXpathOfElementForSendingValueBeforeClick(), tempList);
            }


        }
        return uniqueList;*/
    }
}