package kalloaa.resta.restproject.repositories;

import kalloaa.resta.restproject.models.MyLog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogRepository extends CrudRepository<MyLog,Long> {
}
