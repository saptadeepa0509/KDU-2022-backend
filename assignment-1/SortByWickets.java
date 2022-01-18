package com.company;

import java.util.Comparator;

class SortByWickets implements Comparator<CSV_Object>
 {
    public int compare(CSV_Object wk_1,CSV_Object wk_2)
    {
        return  (wk_1.getWickets()- wk_2.getWickets())*(-1);
    }
}
