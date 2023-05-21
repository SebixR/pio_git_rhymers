package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;

    /**
     * Getter
     * @return ilość liczb odrzuconych przez countIn
     */
    public int reportRejection() {
        return totalRejected;
    }

    /**
     * Metoda dzięki której nie możliwe jest zgłoszenie liczby większej niż bierząca
     * @param in sprawdzana liczba
     */
    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }

}