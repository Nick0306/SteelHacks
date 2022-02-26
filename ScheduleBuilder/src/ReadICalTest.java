import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;

import org.joda.time.DateTime;

import biweekly.*;
import biweekly.component.VEvent;

public class ReadICalTest{

    public static void main (String [] args) throws FileNotFoundException, IOException{

        DateTime now = DateTime.now();
        readICal nCal = new readICal("ScheduleBuilder/src/Spring Term 2021-2022 (1).ics");
        nCal.setWeek(now);
        System.out.println(nCal.weekEnd);
        System.out.println(nCal.weekStart);

    }
}
