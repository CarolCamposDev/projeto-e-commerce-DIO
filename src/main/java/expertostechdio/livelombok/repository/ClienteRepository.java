package expertostechdio.livelombok.repository;

import expertostechdio.livelombok.model.ClienteModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<ClienteModel, Integer> {
}
