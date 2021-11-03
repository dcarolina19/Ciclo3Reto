package com.usa.ciclo3.retociclo3.crudrepository;

import com.usa.ciclo3.retociclo3.model.Doctor;
import com.usa.ciclo3.retociclo3.repository.DoctorRepository;
import org.springframework.data.repository.CrudRepository;

public interface DoctorCrudRepository extends CrudRepository<Doctor,Integer> {
}