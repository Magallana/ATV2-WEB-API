package apiweb.APIwebatv2.api.repository;

import apiweb.APIwebatv2.api.model.ProdutoModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProdutoRepository extends CrudRepository<ProdutoModel, Integer> {

}
