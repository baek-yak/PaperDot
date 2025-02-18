package gomgook.paperdot.paper.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class TotalPageSearchResponse {
    private Long total;
    private List<PaperSearchResponse> paperSearchResponseList;
}
