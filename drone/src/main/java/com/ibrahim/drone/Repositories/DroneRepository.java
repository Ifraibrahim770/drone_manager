package com.ibrahim.drone.Repositories;

import com.ibrahim.drone.Entities.Drone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DroneRepository extends JpaRepository<Drone, Long> {
}
