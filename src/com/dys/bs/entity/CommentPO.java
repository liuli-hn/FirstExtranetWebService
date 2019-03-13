package com.dys.bs.entity;

import org.springframework.stereotype.Service;

import java.text.*;
import java.util.Calendar;
import java.util.Date;

/**
 * PO BO DTO(TO) VO DO
 */
@Service
public class CommentPO {
    private Integer num;

    public static void main(String[] ars) throws ParseException {
        DateFormat handleDate = new SimpleDateFormat("yyyy-MM-dd");
        Date start = handleDate.parse("2019-03-01");
        Date end = handleDate.parse("2019-03-05");
        String[] period = CommentPO.getAcquisitionPeriod(start, end);

        System.out.println(period.length);
        System.out.println(period.toString());
        for(String p : period){
            System.out.println(p);
        }
    }


    public static String[] getAcquisitionPeriod(Date start, Date end){
        if(start == null || end == null)return null;
        DateFormat handleDate = new SimpleDateFormat("yyyy-MM-dd");
        DateFormat sdf = new SimpleDateFormat("MM-dd");

        Calendar caStart = Calendar.getInstance();
        caStart.setTime(start);

        Calendar caEnd = Calendar.getInstance();
        caEnd.setTime(end);

        // 计算俩个时间相差天数
        Long between_days=(caEnd.getTimeInMillis() - caStart.getTimeInMillis())/(1000*3600*24);
        String[] time = new String[(between_days.intValue()+1)];
        int i = 0;
        for (; caStart.before(caEnd); i++) {
            try {
                time[i] = sdf.format(caStart.getTime());
                caStart.add(Calendar.DATE, 1);
            } catch (Exception e) {
                break;
            }
        }

        time[i]  = sdf.format(caStart.getTime());
        /*String[] result = new String[i+1];
        for(int g = 0; g <= i; g++){
            result[g] = time[g];
        }
        return result;*/
        return time;
    }
}