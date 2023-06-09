package com.mohamedhamza.foodplanner.data;

import androidx.room.TypeConverter;

import java.util.Date;

/**
 * Created by Mohamed Hamza on 5/31/2023.
 */

public class DateConverter {
    @TypeConverter
    public static Date toDate(Long timestamp) {
        return timestamp == null ? null : new Date(timestamp);
    }

    @TypeConverter
    public static Long toTimestamp(Date date) {
        return date == null ? null : date.getTime();
    }
}