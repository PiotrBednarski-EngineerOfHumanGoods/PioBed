package pl.pjatk.PioBed.movie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface MovieRepository extends JpaRepository<Movie, Long> {

    @Override
    @Query(name = "Movie.findAll")
    List<Movie> findAll();

    @Override
    @Query(name = "Movie.findById")
    Optional<Movie> findById(Long id);

    @Modifying
    @Query(name = "Movie.markAsAvailable")
    int markAsAvailable(@Param("id") Long id);
}
