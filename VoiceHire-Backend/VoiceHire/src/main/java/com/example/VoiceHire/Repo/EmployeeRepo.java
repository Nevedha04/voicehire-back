package com.example.VoiceHire.Repo;

import com.example.VoiceHire.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepo  extends JpaRepository<Employee, Integer> {




}