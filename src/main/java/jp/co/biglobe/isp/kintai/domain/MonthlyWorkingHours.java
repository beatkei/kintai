package jp.co.biglobe.isp.kintai.domain;

import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@EqualsAndHashCode
@ToString
public class MonthlyWorkingHours {

    private final TotalMonthlyWorkHours totalMonthlyWorkHours;
    private final TotalMonthlyOvertimeHours totalMonthlyOvertimeHours;
}
