package com.example.algamoney.api.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.algamoney.api.model.Categoria;

@Autowired
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

	Categoria findOne(Long codigo);
	


}
