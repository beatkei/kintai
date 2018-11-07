package jp.co.biglobe.isp.kintai.datasource

import jp.co.biglobe.isp.kintai.domain.DailyWorkingHours
import jp.co.biglobe.isp.kintai.domain.DailyWorkingHoursRepository
import jp.co.biglobe.isp.kintai.domain.WorkDay
import jp.co.biglobe.isp.kintai.domain.WorkEndTime
import jp.co.biglobe.isp.kintai.domain.WorkStartTime
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.ContextConfiguration
import spock.lang.Specification

import java.time.LocalDate
import java.time.LocalTime

@ContextConfiguration
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
