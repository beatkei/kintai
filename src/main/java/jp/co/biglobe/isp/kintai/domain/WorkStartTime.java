package jp.co.biglobe.isp.kintai.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.time.LocalTime;

@RequiredArgsConstructor
@EqualsAndHashCode
@ToString
public class WorkStartTime {

    @Getter
    private final LocalTime value;
}
