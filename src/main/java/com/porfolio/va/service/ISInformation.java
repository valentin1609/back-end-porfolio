
package com.porfolio.va.service;

import com.porfolio.va.entity.Information;



public interface ISInformation {
    
    public Information getInformation(Long id);
    
    public void editInformation(Information info);
    
}
