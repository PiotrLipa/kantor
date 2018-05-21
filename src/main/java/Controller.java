import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping(value = "/operattion")
    public double operation(@RequestParam(value = "Operation") String operation, @RequestParam(value = "first") String first) {

        return operationService.operacje(operation, Integer.parseInt(first));
    }
    @Autowired
    private OperationService operationService;



}