package com.example.demo.Interface;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.intities.Auto;

public interface Repository extends JpaRepository<Auto, Long> {
}
