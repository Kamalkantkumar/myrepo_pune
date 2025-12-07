import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.mysql.cj.Query;

public class DynamicQuery {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("hiber");
		EntityManager createEntityManager = factory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		transaction.begin();
		
		javax.persistence.Query query=createEntityManager.createQuery("from Employee where id=10");
		//query.setParameter(1, 10);
		
		List resultList = query.getResultList();
		for (Object object : resultList) {
			System.out.println(object);
			
		}
		

//		Employee employee = new Employee();
//		employee.setId(10);
//		employee.setName("venkatesh");
//		employee.setBranch("mechanical");
//		createEntityManager.persist(employee);
//		transaction.commit();

	}

}
