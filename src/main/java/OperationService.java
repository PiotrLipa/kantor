import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class OperationService {

    Map<String, Double> kupnoWaluty = new HashMap();

    public OperationService() {
        kupnoWaluty.put("kwotaZakupuPlnUsd", 0.273);
        kupnoWaluty.put("kwotaZakupuUSDPLN", 3.649);
        kupnoWaluty.put("kwotaZakupuEurUSD", 1.176);
        kupnoWaluty.put("kwotaZakupuUSDEUR", 0.849);
        kupnoWaluty.put("kwotaZakupuUSDCHF", 0.997);
        kupnoWaluty.put("kwotaZakupuCHFUSD", 1.002);
    }

    public double operacje (String nazwaOPeracji, int kwota){

        return kwota*kupnoWaluty.get(nazwaOPeracji);

    }
}
