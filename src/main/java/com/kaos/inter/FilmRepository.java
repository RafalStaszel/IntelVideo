package com.kaos.inter;
import org.springframework.data.repository.CrudRepository;
import com.kaos.video.Film;

public interface FilmRepository extends CrudRepository<Film, Integer>{
	Film findByTitle(String title);
	
}	



