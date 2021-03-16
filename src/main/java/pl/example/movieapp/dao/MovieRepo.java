package pl.example.movieapp.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.example.movieapp.dao.entity.Movie;

@Repository
public interface MovieRepo extends CrudRepository<Movie, Long>
{
}
