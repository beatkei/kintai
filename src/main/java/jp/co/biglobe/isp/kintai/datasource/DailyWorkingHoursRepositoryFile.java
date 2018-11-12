package jp.co.biglobe.isp.kintai.datasource;

import jp.co.biglobe.isp.kintai.domain.DailyWorkingHours;
import jp.co.biglobe.isp.kintai.domain.DailyWorkingHoursRepository;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import java.io.FileWriter;
import java.io.IOException;

@SpringBootApplication
//@Component
public class DailyWorkingHoursRepositoryFile implements DailyWorkingHoursRepository {

    @Override
    public void saveDailyWorkingHours(DailyWorkingHours dailyWorkingHours) {
        try {
            FileWriter fileWriter = new FileWriter("kintai.csv");
            fileWriter.write(dailyWorkingHours.getWorkDay().getValue().toString());
            fileWriter.write(dailyWorkingHours.getWorkStartTime().getValue().toString());
            fileWriter.write(dailyWorkingHours.getWorkEndTime().getValue().toString());
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
