package com.crud.demo.serviceImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.crud.demo.entity.StudentProfile;
import com.crud.demo.exception.CustomException;
import com.crud.demo.repository.StudentRepo;
import com.crud.demo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepo studentRepo;

	@Override
	public ResponseEntity<?> addStudent(StudentProfile studentProfile) {
		try {
			StudentProfile profile = new StudentProfile();
			profile.setId(studentProfile.getId());
			profile.setName(studentProfile.getName());
			profile.setAddress(studentProfile.getAddress());
			profile.setAge(studentProfile.getAge());
			profile.setRollNo(studentProfile.getRollNo());
			profile.setDob(studentProfile.getDob());
			StudentProfile save = this.studentRepo.save(profile);
			return ResponseEntity.ok(save);
		} catch (Exception e) {
			throw new CustomException(e.getMessage());
		}

	}

	@Override
	public ResponseEntity<?> getStudent(Integer stId)  {
		try {
			Optional<StudentProfile> findById = studentRepo.findById(stId);
		if(findById.isPresent()) {
			StudentProfile studentProfile =findById.get();
			return ResponseEntity.ok(studentProfile);	
		}else {
			return ResponseEntity.ok("Id does not exit");	
		}
		
		}catch (Exception e) {
			throw new CustomException(e.getMessage());
		}
		
	}

	@Override
	public ResponseEntity<?> updateStudent(Integer id, StudentProfile studentProfile) {
		try {
			Optional<StudentProfile> findById = this.studentRepo.findById(id);
			if(findById.isEmpty()) {
				return ResponseEntity.ok("Id not exist");
			}else {
				StudentProfile profile= new StudentProfile();
				profile.setId(findById.get().getId());
				profile.setAddress(studentProfile.getAddress());
				profile.setName(studentProfile.getName());
				profile.setAge(studentProfile.getAge());
				profile.setDob(findById.get().getDob());
				profile.setRollNo(findById.get().getRollNo());
				this.studentRepo.save(profile);
				return ResponseEntity.ok(profile);
			}
		}catch (Exception e) {
			throw new CustomException(e.getMessage());
		}
		
	}

	@Override
	public Map<String, Object> getByAge(Integer age) {
	try {
		List<StudentProfile> findByAge = this.studentRepo.findByAge(age);
		Map<String, Object> map= new HashMap<>();
		map.put("data", findByAge);
		return map;	
	}catch (Exception e) {
		throw new CustomException(e.getMessage());
	}
		
	}

	@Override
	public ResponseEntity<?> deleteStudent(Integer id) {
		try {
			Optional<StudentProfile> findById = this.studentRepo.findById(id);
			if(!findById.isPresent()) {
				return ResponseEntity.ok("Id does not exist");
			}else {
				this.studentRepo.deleteById(id);
				return ResponseEntity.ok("deleted");
			}	
		}catch (Exception e) {
			throw new CustomException(e.getMessage());	
		}
		
	}
}
