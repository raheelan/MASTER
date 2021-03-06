/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.OPD;

import BO.OPD.GynaeParameter;
import Handler.OPD.GynaeParameterHandler;
import java.util.List;
import utilities.Constants;

/**
 *
 * @author raheelansari
 */
public class GynaeParameterController {
    
    GynaeParameterHandler hdlGayneeParameter = new GynaeParameterHandler();
    
    public List<GynaeParameter> selectGayneeParameter(String patientId,
            String referenceNumber) {
        return hdlGayneeParameter.selectGayneeParameter(patientId, referenceNumber);
    }
    
    public boolean insertGayneeParameters(GynaeParameter objSave) {
        boolean ret = hdlGayneeParameter.insertGayneeParameters(objSave);
        if(ret){
            Constants.dao.commitTransaction();
        }
        if(!ret){
            Constants.dao.rollBack();
        }
        return ret;
    }
    
    public boolean updateGayneeParameters(GynaeParameter objUpdate) {
        boolean ret = hdlGayneeParameter.updateGayneeParameters(objUpdate);
        if(ret){
            Constants.dao.commitTransaction();
        }
        if(!ret){
            Constants.dao.rollBack();
        }
        return ret;
    }
}
