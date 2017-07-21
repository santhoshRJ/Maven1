package com.mycompany.task6;


import java.util.*;

public class District
{
    private String districtname;
    District(String districtname)
    {
        this.districtname = districtname;
    }
    public String getDistrictname()
    {
        return districtname;
    }
    public String toString()
    {
        return "Districts: " +districtname;
        }
} 