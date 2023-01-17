package smu.poodle.smnavi.externapi;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TransitPathDto {
    private int transitInfoCnt;
    private List<TransitSubPathDto> subPathList;
    private int time;

    public TransitPathDto(List<TransitSubPathDto> transitInfoList, int time) {
        this.subPathList = transitInfoList;
        this.time = time;
        this.transitInfoCnt = transitInfoList.size();
    }
}
