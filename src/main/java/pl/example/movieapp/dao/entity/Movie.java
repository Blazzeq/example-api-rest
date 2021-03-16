package pl.example.movieapp.dao.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Movie
{
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String title;
    private String director;
    private LocalDate yearOfProduction;

    public Movie()
    {
    }

    public Movie(String title, String director, LocalDate yearOfProduction)
    {
        this.title = title;
        this.director = director;
        this.yearOfProduction = yearOfProduction;
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getDirector()
    {
        return director;
    }

    public void setDirector(String director)
    {
        this.director = director;
    }

    public LocalDate getYearOfProduction()
    {
        return yearOfProduction;
    }

    public void setYearOfProduction(LocalDate yearOfProduction)
    {
        this.yearOfProduction = yearOfProduction;
    }
}
