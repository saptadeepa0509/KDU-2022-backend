package com.company;

import java.util.Comparator;

class SortByAvg implements Comparator<CSV_Object>
{
    public int compare(CSV_Object avg_1,CSV_Object avg_2)
    {
        if(avg_1.getAverage()-avg_2.getAverage()>0)return  1;
       else  if(avg_1.getAverage()-avg_2.getAverage()<0)return -1;
       else return 0;
    }
}