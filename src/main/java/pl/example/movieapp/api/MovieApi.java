package pl.example.movieapp.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.example.movieapp.dao.entity.Movie;
import pl.example.movieapp.service.MovieService;

import java.util.Optional;

@RestController
@RequestMapping("/api/movies")
public class MovieApi
{
    private MovieService movies;

    @Autowired
    public MovieApi(MovieService movies)
    {
        this.movies = movies;
    }

    @GetMapping("/list")
    public Iterable<Movie> getAll()
    {
        return movies.findAll();
    }

    @GetMapping
    public Optional<Movie> getById(@RequestParam Long index)
    {
        return movies.findById(index);
    }

    @PostMapping
    public Movie addMovie(@RequestBody Movie movie)
    {
        return movies.save(movie);
    }

    @PutMapping
    public Movie editMovie(@RequestBody Movie movie)
    {
        return movies.save(movie);
    }

    @DeleteMapping
    public void deleteMovie(@RequestParam Long index)
    {
        movies.delete(index);
    }
}
