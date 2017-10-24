package org.postgetman.schedule.app.repository;

import org.postgetman.schedule.app.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long>{

}
