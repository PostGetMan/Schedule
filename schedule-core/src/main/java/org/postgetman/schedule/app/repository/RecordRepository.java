package org.postgetman.schedule.app.repository;

import org.postgetman.schedule.app.domain.schedule.Record;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecordRepository extends JpaRepository<Record,Long> {
}
