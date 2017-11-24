package com.bennian.weather.weatherservice.db;

import org.litepal.crud.DataSupport;

/**
 * Created by eryu on 2017/11/23.
 */

public class Province extends DataSupport {
    private int id;
    private  String provinceName;
    private int provinceCode;

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
