package com.alesberesik.Kanban_board.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alesberesik.Kanban_board.model.Columns;

@Repository
public interface ColumnsRepository extends JpaRepository<Columns, Integer> {
	List<Columns> findByBoardId(Integer board_id);
}
