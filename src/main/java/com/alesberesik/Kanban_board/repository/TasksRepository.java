package com.alesberesik.Kanban_board.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alesberesik.Kanban_board.model.Tasks;

@Repository
public interface TasksRepository extends JpaRepository<Tasks, Integer> {

}
