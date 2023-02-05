package com.alesberesik.Kanban_board.web.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alesberesik.Kanban_board.model.Columns;
import com.alesberesik.Kanban_board.repository.ColumnsRepository;

@RestController
@RequestMapping("/columns")
public class ColumnController {
	
	private final ColumnsRepository columnsRepository;
	
	public ColumnController(ColumnsRepository columnsRepository) {
		this.columnsRepository = columnsRepository;
	}
	
	@GetMapping
	public ResponseEntity getBoardColumns(final Integer board_id) {
		return ResponseEntity.ok(columnsRepository.findByBoardId(board_id));
	}
	
	@PostMapping
	public ResponseEntity createBoardColumn(@RequestBody Columns columns) {
		return ResponseEntity.ok(columnsRepository.save(columns));
	}
	
	@PutMapping
	public ResponseEntity updateBoardColumn(@RequestBody Columns columns) {
		return ResponseEntity.ok(columnsRepository.save(columns));
	}
	
	@DeleteMapping
	public ResponseEntity deleteColumn(final Integer id) {
		columnsRepository.deleteById(id);
		return ResponseEntity.ok().build();
	}

}
