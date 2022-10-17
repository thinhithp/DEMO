package com.example.vtidemo.controller;


import com.example.vtidemo.service.IDepartmentService;
import com.example.vtidemo.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/departments")

public class DepartmentController {

	@Autowired
	private IDepartmentService service;

	@GetMapping()
	public List<Department> getAllDepartments() {

		// get data
		return service.getAllDepartments();

//		List<String> dtos = new ArrayList<>();
//
//		// convert entity to dto
//		for (Department entity : entities) {
//			dtos.add(entity.getName());
//		}

//		return new ResponseEntity<List<Department>>(entities, HttpStatus.OK);
	}

	/*@GetMapping(value = "/{id}")
	public ResponseEntity<?> getDepartmentByID(@PathVariable(name = "id") short id) {
		return new ResponseEntity<Department>(service.getDepartmentByID(id), HttpStatus.OK);
	}

	@PostMapping()
	public ResponseEntity<?> createDepartment(@RequestBody DepartmentDTO dto) {
		service.createDepartment(dto.toEntity());
		return new ResponseEntity<String>("Create successfully!", HttpStatus.CREATED);
	}

	@PutMapping(value = "/{id}")
	public ResponseEntity<?> updateDepartment(@PathVariable(name = "id") short id, @RequestBody DepartmentDTO dto) {
		Department department = dto.toEntity();
		department.setId(id);
		service.updateDepartment(department);
		return new ResponseEntity<String>("Update successfully!", HttpStatus.OK);
	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<?> deleteDepartment(@PathVariable(name = "id") short id) {
		service.deleteDepartment(id);
		return new ResponseEntity<String>("Delete successfully!", HttpStatus.OK);
	}*/
}
