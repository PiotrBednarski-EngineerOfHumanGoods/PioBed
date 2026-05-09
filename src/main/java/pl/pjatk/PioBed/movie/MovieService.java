package pl.pjatk.PioBed.movie;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> getAll() {
        return movieRepository.findAll();
    }

    public Optional<Movie> getById(Long id) {
        return movieRepository.findById(id);
    }

    public Optional<Movie> create(Movie movie) {
        if (movie.getId() != null || movie.getName() == null || movie.getCategory() == null) {
            return Optional.empty();
        }

        movie.setAvailable(false);
        return Optional.of(movieRepository.save(movie));
    }

    public Optional<Movie> update(Long id, Movie updatedMovie) {
        Optional<Movie> optionalMovie = movieRepository.findById(id);

        if (optionalMovie.isEmpty()) {
            return Optional.empty();
        }

        Movie movie = optionalMovie.get();
        movie.setName(updatedMovie.getName());
        movie.setCategory(updatedMovie.getCategory());
        movie.setReleaseYear(updatedMovie.getReleaseYear());
        movie.setAvailable(updatedMovie.isAvailable());
        return Optional.of(movieRepository.save(movie));
    }

    public boolean delete(Long id) {
        if (movieRepository.existsById(id)) {
            movieRepository.deleteById(id);
            return true;
        }

        return false;
    }

    @Transactional
    public boolean markAsAvailable(Long id) {
        if (movieRepository.existsById(id)) {
            movieRepository.markAsAvailable(id);
            return true;
        }

        return false;
    }
}
