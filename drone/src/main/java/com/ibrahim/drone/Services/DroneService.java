package com.ibrahim.drone.Services;

import com.ibrahim.drone.Entities.Drone;
import com.ibrahim.drone.Repositories.DroneRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class DroneService {

    @Autowired
    private DroneRepository droneRepository;

    public Drone registerDrone(Drone drone) {
        return droneRepository.save(drone);
    }
}
