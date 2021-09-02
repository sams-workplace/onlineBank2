package onlinebanknew.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


//@FeignClient(name="LoanAuthentication", url="http://LoanAuthentication:8080")
@FeignClient(name="LoanAuthentication", url="http://auth:8080" )
public interface LoanAuthService {
    @RequestMapping(method= RequestMethod.GET, path="/loanAuths")
    public void requestAuth(@RequestBody LoanAuth loanAuth);

}

