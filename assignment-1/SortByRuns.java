package com.company;

import java.util.Comparator;

  class SortByRuns implements Comparator<CSV_Object> {
    public int compare(CSV_Object run_1,CSV_Object run_2)
    {
        return  (run_1.getRuns()-run_2.getRuns()) *(-1);
    }

}
