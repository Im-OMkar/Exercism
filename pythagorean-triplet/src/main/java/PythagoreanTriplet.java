import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PythagoreanTriplet {
    int a, b, c;

    public PythagoreanTriplet(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static PythagoreanTripletBuilder makeTripletsList() {
        return new PythagoreanTripletBuilder();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PythagoreanTriplet that = (PythagoreanTriplet) o;
        return a == that.a && b == that.b && c == that.c;
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(a, b, c);
//    }

    public static class PythagoreanTripletBuilder {
        int N;

        public PythagoreanTripletBuilder withFactorsLessThanOrEqualTo(int i) {
            return this;
        }

        public PythagoreanTripletBuilder thatSumTo(int i) {
            this.N = i;
            return this;
        }





        List<PythagoreanTriplet> build() {
            List<PythagoreanTriplet> pythagoreanTriplets = new ArrayList<PythagoreanTriplet>();
            for (int i = 1; i <= N; i++) {
                for (int j = i; j <= N - i; j++) {
                    int k = N - (i + j);
                    if (i * i + j * j == k * k && j < k) {
                        if (i + j + k == N) {
                            PythagoreanTriplet pythagoreanTriplet = new PythagoreanTriplet(i, j, k);
                            pythagoreanTriplets.add(pythagoreanTriplet);
                        }
                    }
                }
            }
            return pythagoreanTriplets;
        }
    }
}
