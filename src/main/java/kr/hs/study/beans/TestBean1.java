package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TestBean1 {
    @Autowired
    @Value("1")
    private int n;
    @Autowired
    @Value("10")
    private int m;

    public int getN() {
        return n;
    }

    public int getM() {
        return m;
    }
}
