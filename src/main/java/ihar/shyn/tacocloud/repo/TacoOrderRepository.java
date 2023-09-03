package ihar.shyn.tacocloud.repo;

import ihar.shyn.tacocloud.domain.TacoOrder;
import org.springframework.data.repository.CrudRepository;

public interface TacoOrderRepository extends CrudRepository<TacoOrder, Long> {
}
