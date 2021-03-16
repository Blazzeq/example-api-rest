package pl.example.movieapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import pl.example.movieapp.dao.MovieRepo;
import pl.example.movieapp.dao.entity.Movie;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class MovieService
{
    private MovieRepo movieRepo;

    @Autowired
    public MovieService(MovieRepo movieRepo)
    {
        this.movieRepo = movieRepo;
    }

    public Optional<Movie> findById(Long id)
    {
        return movieRepo.findById(id);
    }

    public Iterable<Movie> findAll()
    {
        return movieRepo.findAll();
    }

    public Movie save(Movie movie)
    {
        return movieRepo.save(movie);
    }

    public void delete(Long id)
    {
        movieRepo.deleteById(id);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void fillDB()
    {
        save(new Movie(1L, "Avengers: Endgame", "Anthony Russo", LocalDate.of(2019, 4, 10)));
        save(new Movie(2L, "The Godfather", "Francis Ford Coppola", LocalDate.of(1972, 3, 15)));
        save(new Movie(3L, "Joker", "Todd Phillips", LocalDate.of(2019, 8, 31)));
        save(new Movie(4L, "Se7en", "David Fincher", LocalDate.of(1995, 9, 15)));
        save(new Movie(5L, "Goodfellas", "Martin Scorsese", LocalDate.of(1990, 9, 12)));
    }
}
