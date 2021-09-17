package microservices.book.multiplication.service;
/**
 * @return a randomly-generated factor. It's always a
number between 11 and 99.
 */
public interface RandomGeneratorService {
    int generateRandomFactor();
}
