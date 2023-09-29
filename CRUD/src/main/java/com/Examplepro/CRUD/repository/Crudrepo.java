package com.Examplepro.CRUD.repository;

import com.Examplepro.CRUD.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Crudrepo extends JpaRepository<Subject,Integer> {

}
