package expertostechdio.livelombok.repository;

import expertostechdio.livelombok.model.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<ProdutoModel, Integer> {
}
