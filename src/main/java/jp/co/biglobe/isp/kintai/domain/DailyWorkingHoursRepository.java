package jp.co.biglobe.isp.kintai.domain;

import org.springframework.stereotype.Component;

public interface DailyWorkingHoursRepository {

    void saveDailyWorkingHours(DailyWorkingHours dailyWorkingHours);
}
