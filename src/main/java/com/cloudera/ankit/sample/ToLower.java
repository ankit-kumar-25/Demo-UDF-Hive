package com.cloudera.ankit.sample;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.hive.ql.exec.UDF;

public class ToLower extends UDF {

    public Text evaluate(Text input)
    {
        if(input == null)
            return null;

        return new Text(input.toString().toLowerCase());
    }
}