package com.alesberesik.Kanban_board.web.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.config.Task;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alesberesik.Kanban_board.model.Tasks;
import com.alesberesik.Kanban_board.repository.TasksRepository;

@RestController
@RequestMapping("/task")
public class TaskController {
	
	private final TasksRepository tasksRepository;
	
	public TaskController(TasksRepository tasksRepository) {
		this.tasksRepository = tasksRepository;
	}
	
	@GetMapping("/{id}")
	public ResponseEntity getTask(final Integer id) {
		return ResponseEntity.ok(tasksRepository.findById(id));
	}
	
	@PutMapping
	public ResponseEntity updateTask(final Tasks task) {
		return ResponseEntity.ok(tasksRepository.save(task));
	}
	
	@PostMapping
	public ResponseEntity createTask(final Tasks task) {
		return ResponseEntity.ok(tasksRepository.save(task));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity deleteTask(final Integer id) {
		tasksRepository.deleteById(id);
		return ResponseEntity.ok().build();
	}

}
