package lotto.DTO;

import java.util.List;

public class LottoTicketDTO {
    private int ticketCount;
    private List<Integer> lottoNumber;

    public LottoTicketDTO(int ticketCount, List<Integer> lottoNumber) {
        this.ticketCount = ticketCount;
        this.lottoNumber = lottoNumber;
    }

    public int getTicketCount() {
        return ticketCount;
    }

    public List<Integer> getLottoNumber() {
        return lottoNumber;
    }
}
