package com.nva.itmoabitfetcher.repository;

import com.nva.itmoabitfetcher.entity.Application;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ApplicationsRepository extends JpaRepository<Application, UUID> {
}
