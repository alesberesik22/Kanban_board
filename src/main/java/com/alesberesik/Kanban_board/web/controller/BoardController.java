package com.alesberesik.Kanban_board.web.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alesberesik.Kanban_board.model.Board;
import com.alesberesik.Kanban_board.repository.BoardRepository;

@RestController
@RequestMapping("/board")
public class BoardController {

	private final BoardRepository boardRepository;
	
	public BoardController(final BoardRepository boardRepository) {
		this.boardRepository = boardRepository;
	}
	
	@GetMapping
	public ResponseEntity getBoards() {
		return ResponseEntity.ok(boardRepository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity getBoard(final Integer id) {
		return ResponseEntity.ok(boardRepository.findById(id));
	}
	
	@PostMapping
	public ResponseEntity createBoard(@RequestBody Board board) {
		return ResponseEntity.ok(boardRepository.save(board));
	}
	
	@PutMapping
	public ResponseEntity updateBoard(@RequestBody Board board) {
		return ResponseEntity.ok(boardRepository.save(board));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity deleteBoard(final Integer id) {
		boardRepository.deleteById(id);
		return ResponseEntity.ok().build();
	}
	
}
