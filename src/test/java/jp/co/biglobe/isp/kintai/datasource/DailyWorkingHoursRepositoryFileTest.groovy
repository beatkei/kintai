package jp.co.biglobe.isp.kintai.datasource

import jp.co.biglobe.isp.kintai.domain.*
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit4.SpringRunner
import spock.lang.Specification

import java.time.LocalDate
import java.time.LocalTime

//@RunWith(SpringRunner.class)
@SpringBootTest
//@ContextConfiguration
class DailyWorkingHoursRepositoryFileTest extends Specification {

    @Autowired
    private DailyWorkingHoursRepository dailyWorkingHoursRepository

    private def workDay = new WorkDay(new LocalDate(2017,6,4))
    private def workStartTime = new WorkStartTime(new LocalTime(1,1,1,1))
    private def workEndTime = new WorkEndTime(new LocalTime(2,2,2,2))

    def "勤務時間をCSVに出力する"() {
        setup:
        def dailyWorkingHours = new DailyWorkingHours(workDay, workStartTime, workEndTime)

        when:
        dailyWorkingHoursRepository.saveDailyWorkingHours(dailyWorkingHours)

        then:
        true
    }

    def "勤務時間をCSVに出力する2"() {
        setup:
        def dailyWorkingHours = new DailyWorkingHours(workDay, workStartTime, workEndTime)

        expect:
        true
    }

}
