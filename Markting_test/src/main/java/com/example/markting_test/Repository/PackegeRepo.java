package com.example.markting_test.Repository;

import com.example.markting_test.Model.Package;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PackegeRepo extends JpaRepository<Package , Integer> {

    Package getPackegeById(Integer id);
}
