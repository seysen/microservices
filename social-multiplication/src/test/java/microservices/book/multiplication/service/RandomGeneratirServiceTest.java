package microservices.book.multiplication.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RandomGeneratirServiceTest {
    @Autowired
    RandomGeneratorService randomGeneratorService;

    @Test
    public void generateRandomFactorIsBetweenExceptedLimits() throws Exception {
        List<Integer> randomFactors = IntStream.range(0,1000).map(i -> randomGeneratorService
                .generateRandomFactor()).boxed().collect(Collectors.toList());
    }
}
