package jp.co.biglobe.isp.kintai.api

import spock.lang.Specification

class CalculatorTest extends Specification {
    def '足し算1'() {
        setup:
        Calculator calc = new Calculator()

        expect:
        calc.add(1, 1) == 2
    }
}
