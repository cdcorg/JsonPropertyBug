package demothree.repository;

import demothree.domain.Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by Lenovo on 15/04/2015.
 */
@RepositoryRestResource
public interface SpringDataEntity extends JpaRepository<Entity, Integer>{

}
