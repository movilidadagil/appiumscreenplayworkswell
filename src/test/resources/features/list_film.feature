Feature: : Movie List

  @seach_film
  Scenario: Perform a movie title search
  Given Actor is on the movie list
  When Actor performs a title search
  Then Actor checks the search result