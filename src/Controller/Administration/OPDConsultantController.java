/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Administration;


import BO.Administration.BOOPDConsultant;
import Handler.Administration.OPDConsultantHandler;
import java.util.List;


/**
 *
 * @author Muhammad Talha Khan
 */
public class OPDConsultantController {

    OPDConsultantHandler opdConsul = new OPDConsultantHandler();
    
    public List<BOOPDConsultant> selectConsultantSearch(String fromDate, String toDate,
            String userId, String SpecialityId){
        return opdConsul.selectConsultantSearch(fromDate,toDate,userId, SpecialityId);
        }
    
     public List<BOOPDConsultant> selectPatientHistory(String fromDate, String toDate, String userId){
       return opdConsul.selectPatientHistory(fromDate,toDate,userId); 
    }
    
    
  }

