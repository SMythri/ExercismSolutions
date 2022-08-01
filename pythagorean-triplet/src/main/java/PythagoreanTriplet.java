import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
public class PythagoreanTriplet {
    private int a;
    private int b;
    private int c;
    
    PythagoreanTriplet(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PythagoreanTriplet)) return false;
        PythagoreanTriplet that = (PythagoreanTriplet) o;
        return a == that.a && b == that.b && c == that.c;
    }
    
    int sum() {
        return a + b + c;
    }
    
    int product() {
        return a * b * c;
    }
    
    boolean isPythagorean() {
        return a * a + b * b == c * c;
    }
    
    static PythagoreanTripletBuilder makeTripletsList() {
        return new PythagoreanTripletBuilder();
    }
    
}
class PythagoreanTripletBuilder {
    private int maxValue;
    private int sum;
    
    PythagoreanTripletBuilder withFactorsLessThanOrEqualTo(int maxValue) {
        this.maxValue = maxValue;
        return this;
    }
    PythagoreanTripletBuilder thatSumTo(int sum) {
        this.sum = sum;
        return this;
    }
    
    List<PythagoreanTriplet> build() {
        List<PythagoreanTriplet> result = new ArrayList<PythagoreanTriplet>();
        for (int a = 1; a <= maxValue; a++) {
            for (int b = a + 1; b <= maxValue; b++) {
                int c = (int) Math.round(Math.sqrt(a * a + b * b));
                if (c > maxValue) {
                    break;
                }
                PythagoreanTriplet pt = new PythagoreanTriplet(a, b, c);
                if (pt.isPythagorean() && (sum == 0 || pt.sum() == sum)) {
                    result.add(pt);
                }
            }
        }
        return result;
    }
}