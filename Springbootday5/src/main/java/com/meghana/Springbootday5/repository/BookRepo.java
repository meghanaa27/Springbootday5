package com.meghana.Springbootday5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.meghana.Springbootday5.model.*;

public interface BookRepo extends JpaRepository<Book, Integer>{

}