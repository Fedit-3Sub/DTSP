package kr.co.e8ight.ndxpro.dataservice.dto.ean.statistics.building;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
@Schema(description = "에너지원별 사용 현황 (일별) - 건물 탭_Perspective View 화면 (좌측 중단)")
public class EnergySourceDailyUsageDto {

    // 에너지원 = 전기, 가스, 지역난방, 신재생 에너지, 수도
    // 수도 사용량은 수기로 작성된 것을 받을 예정
    @Schema(description = "오늘 누적 사용량")
    private Float todayAccumulativeUsage;

    // 비용 관련 필드는 전기, 가스, 지역난방, 수도인 경우만 사용하고, 신재생 에너지는 사용하지 않음
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Schema(description = "오늘 누적 비용")
    private Float todayAccumulativeCost;

    @Schema(description = "예상 사용량")
    private Float predictedUsage;

    @Schema(description = "사용량 어제 대비")
    private Float dayOnDayUsageRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Schema(description = "예상 비용")
    private Float predictedCost;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Schema(description = "비용 어제 대비")
    private Float dayOnDayCostRate;

}