package org.postgetman.schedule.app.repository;

import org.postgetman.schedule.app.domain.schedule.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScheduleRepository extends JpaRepository<Schedule,Long>{
}
