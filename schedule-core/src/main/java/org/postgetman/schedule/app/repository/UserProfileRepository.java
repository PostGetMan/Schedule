package org.postgetman.schedule.app.repository;

import org.postgetman.schedule.app.domain.user.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserProfileRepository extends JpaRepository<UserProfile,Long>{
}
