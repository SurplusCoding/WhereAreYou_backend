package surpluscoding.eodego.domain.belong.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import surpluscoding.eodego.domain.belong.repository.BelongRepository;
import surpluscoding.eodego.domain.team.service.TeamGetService;
import surpluscoding.eodego.domain.user.service.UserGetService;

@Service
@RequiredArgsConstructor
public class BelongGetService {

    private final BelongRepository belongRepository;
    private final TeamGetService teamGetService;
    private final UserGetService userGetService;

}
