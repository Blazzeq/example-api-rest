package pl.example.movieapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.example.movieapp.dao.entity.Movie;

@Repository
public interface MovieRepo extends JpaRepository<Movie, Long>
{
}
