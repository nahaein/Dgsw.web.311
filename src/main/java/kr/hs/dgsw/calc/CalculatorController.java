package kr.hs.dgsw.calc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @GetMapping
    public String getString(){
        return "Hello world";
    }
}
// 7afead92e04f5241e605eb4126f052212e39eb03
// 7bedb04398d5b3d77a41152692b8d7cef506a294
