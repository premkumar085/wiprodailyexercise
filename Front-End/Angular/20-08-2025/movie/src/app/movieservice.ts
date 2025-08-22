import { Injectable } from '@angular/core';
import { Movieinterface } from './movieinterface';

@Injectable({
  providedIn: 'root'
})
export class Movieservice {
  movieList: Movieinterface[] = [
    { movieId: 'M101', movieName: 'Inception', language: 'English', imdbRating: 8.8 },
    { movieId: 'M102', movieName: 'Bahubali', language: 'Telugu', imdbRating: 8.2 },
    { movieId: 'M103', movieName: 'Dangal', language: 'Hindi', imdbRating: 8.4 }
  ];

  getMovies(): Movieinterface[] {
    return this.movieList;
  }

  deleteByMovieId(movieId: string): void {
    this.movieList = this.movieList.filter(m => m.movieId !== movieId);
  }

  addMovie(movie: Movieinterface): void {
    this.movieList.push(movie);
  }

  findByMovieId(movieId: string): Movieinterface | undefined {
    return this.movieList.find(m => m.movieId === movieId);
  }

  updateMovie(movie: Movieinterface): void {
    const index = this.movieList.findIndex(m => m.movieId === movie.movieId);
    if (index !== -1) {
      this.movieList[index] = movie;
    } else {
      console.error(`Movie with movieId ${movie.movieId} not found.`);
    }
  }
}

