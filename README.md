# january-advanced-POTM
Ratings
Time Limit: 8 seconds
Standard Input, Standard Output

Problem Statement
Over the past few years, Shakeel has watched N anime and has given each one a rating, Ri
, an
integer on a scale of 1 to 10. The website that Shakeel uses for his anime profile calculates his average
rating for the anime he has watched, and currently, his average rating is lower than he expected.
People can view his ratings, and he doesn’t want them to know that he’s a harsh critic otherwise
people will stop recommending him anime. Because of this, he wants to increase his average rating,
but if he changes his current ratings on previously watched anime, people will become suspicious.
Fortunately, he thought of adding more anime to his watched list and rating them since no one can
actually tell if he really watched the anime or not. This way he can get his desired average rating
of exactly M. However, he doesn’t want to spend too much time adding anime to his watched list
and rating them because he wants to rewatch Kimi No Na Wa for the 50th time.
Given Shakeel’s current anime ratings and his desired average rating, determine the least amount
of animes he needs to add to his watched list and rate them to obtain his desired average rating. It
is guaranteed that Shakeel’s current average rating is lower than his desired average rating.
Input Format
The first line consists of two integers, N and M, the number of anime Shakeel has currently rated
and his desired average rating.
The next line consists of N integers, Ri

, the rating of the i

th anime he has watched.

Constraints
1 ≤ N ≤ 107
2 ≤ M ≤ 9
1 ≤ Ri ≤ 10

Output Format
Output the least amount of animes he needs to add to his watched list and rate them to obtain his
desired average rating.

Sample Case
  Input
  3 9
  8 9 8
  
  Output
  2
