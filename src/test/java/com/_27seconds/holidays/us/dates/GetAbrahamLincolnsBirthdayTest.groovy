package com._27seconds.holidays.us.dates

import org.junit.Test

class GetAbrahamLincolnsBirthdayTest {

    static {
        System.setProperty("com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump", "true")
        System.setProperty("com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump", "true")
        System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dump", "true")
        System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dump", "true")
    }

    @Test
    void useServiceTest() {

        USHolidayDatesSoap holidayDatesSoap = new USHolidayDates().getUSHolidayDatesSoap()

        println holidayDatesSoap.getAbrahamLincolnsBirthday(1969)
    }
}
