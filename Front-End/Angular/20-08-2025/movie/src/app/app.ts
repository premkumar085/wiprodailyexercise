import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { Movieinterface } from './movieinterface';
import { Movieservice } from './movieservice';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-root',
  imports: [FormsModule],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('movie');

movieList: Movieinterface[] = [];
  movieId: string = '';

  movieIdAdd: string = '';
  movieNameAdd: string = '';
  languageAdd: string = '';
  imdbRatingAdd: number = 0;

  constructor(private movieService: Movieservice) {
    this.movieList = this.movieService.getMovies();
  }

  delete(): void {
    this.movieService.deleteByMovieId(this.movieId);
    this.movieList = this.movieService.getMovies();
    this.movieId = '';
  }

  save(): void {
    const newMovie: Movieinterface = {
      movieId: this.movieIdAdd,
      movieName: this.movieNameAdd,
      language: this.languageAdd,
      imdbRating: this.imdbRatingAdd
    };
    this.movieService.addMovie(newMovie);
    this.movieList = this.movieService.getMovies();

    this.movieIdAdd = '';
    this.movieNameAdd = '';
    this.languageAdd = '';
    this.imdbRatingAdd = 0;
  }

  edit(): void {
    const movie = this.movieService.findByMovieId(this.movieId);
    if (movie) {
      this.movieIdAdd = movie.movieId;
      this.movieNameAdd = movie.movieName;
      this.languageAdd = movie.language;
      this.imdbRatingAdd = movie.imdbRating;
    } else {
      alert('Movie not found');
    }
  }

  update(): void {
    const updatedMovie: Movieinterface = {
      movieId: this.movieIdAdd,
      movieName: this.movieNameAdd,
      language: this.languageAdd,
      imdbRating: this.imdbRatingAdd
    };
    this.movieService.updateMovie(updatedMovie);
    this.movieList = this.movieService.getMovies();

    this.movieIdAdd = '';
    this.movieNameAdd = '';
    this.languageAdd = '';
    this.imdbRatingAdd = 0;
  }
}
