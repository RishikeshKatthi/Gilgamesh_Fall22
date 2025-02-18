package commercebank.appointmentscheduler.repository;

import commercebank.appointmentscheduler.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PotentialClientRepository extends JpaRepository<Employee, Long> {
}
