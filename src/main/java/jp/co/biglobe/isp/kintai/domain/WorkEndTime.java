package jp.co.biglobe.isp.kintai.domain;

import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.time.LocalTime;

@RequiredArgsConstructor
@EqualsAndHashCode
@ToString
public class WorkEndTime {

    private final LocalTime value;
}
