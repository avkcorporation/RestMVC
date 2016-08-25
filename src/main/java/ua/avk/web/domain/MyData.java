package ua.avk.web.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * @author Alexander Kononenko
 * @version 1.0.0
 *
 * The entity has elements a, b and sum
 */
public class MyData {

    private long a;
    private long b;
    private long sum;

    public MyData(@JsonProperty("a") long a,
                  @JsonProperty("b") long b) {
        this.a = a;
        this.b = b;
        this.sum = a + b;
    }

    public long getA() {
        return a;
    }

    public void setA(long a) {
        this.a = a;
    }

    public long getB() {
        return b;
    }

    public void setB(long b) {
        this.b = b;
    }

    public long getSum() {
        return sum;
    }

    public void setSum() {
        this.sum = a + b;
    }

    /**
     * Compares of the data
     *
     * @param obj for compare
     * @return true if equals
     */
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof MyData)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        MyData myData = (MyData) obj;
        return new EqualsBuilder()
                .append(this.a, myData.a)
                .append(this.b, myData.b)
                .append(this.sum, myData.sum)
                .isEquals();
    }

}
