package jp.co.biglobe.isp.kintai.domain;

import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@EqualsAndHashCode
@ToString
public class DailyWorkingHours {

    private final WorkDay workDay;
    private final WorkStartTime workStartTime;
    private final WorkEndTime workEndTime;
}
