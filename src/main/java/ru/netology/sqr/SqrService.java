package ru.netology.sqr;

public class SqrService {
    public int rangeLimits(int x, int y) {
            int number = 0;
            for (int i = 10; i <= 99; i++) {
                if (i * i >= x & i * i <= y)
                {
                    number++;
                }
            }
            return number;
        }
}
