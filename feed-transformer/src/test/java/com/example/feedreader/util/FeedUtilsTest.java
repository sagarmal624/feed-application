package com.example.feedreader.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.example.feedreader.pojo.Event;
import com.example.feedreader.pojo.Market;

import java.util.ArrayList;

import org.junit.Ignore;
import org.junit.Test;

public class FeedUtilsTest {
    @Test
    public void testGetPayload() {
        assertTrue(FeedUtils.getPayload("Not all who wander are lost").isEmpty());
        assertTrue(FeedUtils.getPayload("\\").isEmpty());
        assertTrue(FeedUtils.getPayload("#|").isEmpty());
        assertTrue(FeedUtils.getPayload("\\\\").isEmpty());
        assertTrue(FeedUtils.getPayload("#\\|").isEmpty());
        assertTrue(FeedUtils.getPayload("\\|").isEmpty());
        assertTrue(FeedUtils.getPayload("Not all who wander are lost\\").isEmpty());
        assertTrue(FeedUtils.getPayload("Not all who wander are lost#|").isEmpty());
        assertTrue(FeedUtils.getPayload("Not all who wander are lost\\\\").isEmpty());
        assertTrue(FeedUtils.getPayload("Not all who wander are lost#\\|").isEmpty());
        assertTrue(FeedUtils.getPayload("Not all who wander are lost\\|").isEmpty());
        assertTrue(FeedUtils.getPayload("\\Not all who wander are lost").isEmpty());
        assertTrue(FeedUtils.getPayload("\\#|").isEmpty());
        assertTrue(FeedUtils.getPayload("\\\\\\").isEmpty());
        assertTrue(FeedUtils.getPayload("\\#").isEmpty());
        assertTrue(FeedUtils.getPayload("\\#\\|").isEmpty());
        assertTrue(FeedUtils.getPayload("\\Message").isEmpty());
        assertTrue(FeedUtils.getPayload("\\\\|").isEmpty());
        assertTrue(FeedUtils.getPayload("\\1").isEmpty());
        assertTrue(FeedUtils.getPayload("\\42").isEmpty());
        assertTrue(FeedUtils.getPayload("\\com.example.feedreader.pojo.Event$EventBuilder").isEmpty());
        assertTrue(FeedUtils.getPayload("\\com.example.feedreader.pojo.Market$MarketBuilder").isEmpty());
        assertTrue(FeedUtils.getPayload("\\com.example.feedreader.pojo.Outcome$OutcomeBuilder").isEmpty());
        assertTrue(FeedUtils.getPayload("\\java.lang.String").isEmpty());
        assertTrue(FeedUtils.getPayload("#|Not all who wander are lost").isEmpty());
        assertTrue(FeedUtils.getPayload("#|\\").isEmpty());
        assertTrue(FeedUtils.getPayload("#|#|").isEmpty());
        assertTrue(FeedUtils.getPayload("#|\\\\").isEmpty());
        assertTrue(FeedUtils.getPayload("#|#\\|").isEmpty());
        assertTrue(FeedUtils.getPayload("#|Message").isEmpty());
        assertTrue(FeedUtils.getPayload("#|\\|").isEmpty());
        assertTrue(FeedUtils.getPayload("#|1").isEmpty());
        assertTrue(FeedUtils.getPayload("#|42").isEmpty());
        assertTrue(FeedUtils.getPayload("#|com.example.feedreader.pojo.Event$EventBuilder").isEmpty());
        assertTrue(FeedUtils.getPayload("#|com.example.feedreader.pojo.Market$MarketBuilder").isEmpty());
        assertTrue(FeedUtils.getPayload("#|com.example.feedreader.pojo.Outcome$OutcomeBuilder").isEmpty());
        assertTrue(FeedUtils.getPayload("#|java.lang.String").isEmpty());
        assertTrue(FeedUtils.getPayload("\\\\Not all who wander are lost").isEmpty());
        assertTrue(FeedUtils.getPayload("\\\\#|").isEmpty());
        assertTrue(FeedUtils.getPayload("\\\\\\\\").isEmpty());
        assertTrue(FeedUtils.getPayload("\\\\#").isEmpty());
        assertTrue(FeedUtils.getPayload("\\\\#\\|").isEmpty());
        assertTrue(FeedUtils.getPayload("\\\\Message").isEmpty());
        assertTrue(FeedUtils.getPayload("\\\\\\|").isEmpty());
        assertTrue(FeedUtils.getPayload("\\\\1").isEmpty());
        assertTrue(FeedUtils.getPayload("\\\\42").isEmpty());
        assertTrue(FeedUtils.getPayload("\\\\com.example.feedreader.pojo.Event$EventBuilder").isEmpty());
        assertTrue(FeedUtils.getPayload("\\\\com.example.feedreader.pojo.Market$MarketBuilder").isEmpty());
        assertTrue(FeedUtils.getPayload("\\\\com.example.feedreader.pojo.Outcome$OutcomeBuilder").isEmpty());
        assertTrue(FeedUtils.getPayload("\\\\java.lang.String").isEmpty());
        assertTrue(FeedUtils.getPayload("#\\").isEmpty());
        assertTrue(FeedUtils.getPayload("#\\\\").isEmpty());
        assertTrue(FeedUtils.getPayload("##\\|").isEmpty());
        assertTrue(FeedUtils.getPayload("#\\|Not all who wander are lost").isEmpty());
        assertTrue(FeedUtils.getPayload("#\\|\\").isEmpty());
        assertTrue(FeedUtils.getPayload("#\\|#|").isEmpty());
        assertTrue(FeedUtils.getPayload("#\\|\\\\").isEmpty());
        assertTrue(FeedUtils.getPayload("#\\|#").isEmpty());
        assertTrue(FeedUtils.getPayload("#\\|#\\|").isEmpty());
        assertTrue(FeedUtils.getPayload("#\\|Message").isEmpty());
        assertTrue(FeedUtils.getPayload("#\\|\\|").isEmpty());
        assertTrue(FeedUtils.getPayload("#\\|1").isEmpty());
        assertTrue(FeedUtils.getPayload("#\\|42").isEmpty());
        assertTrue(FeedUtils.getPayload("#\\|com.example.feedreader.pojo.Event$EventBuilder").isEmpty());
        assertTrue(FeedUtils.getPayload("#\\|com.example.feedreader.pojo.Market$MarketBuilder").isEmpty());
        assertTrue(FeedUtils.getPayload("#\\|com.example.feedreader.pojo.Outcome$OutcomeBuilder").isEmpty());
        assertTrue(FeedUtils.getPayload("#\\|java.lang.String").isEmpty());
        assertTrue(FeedUtils.getPayload("Message\\").isEmpty());
        assertTrue(FeedUtils.getPayload("Message#|").isEmpty());
        assertTrue(FeedUtils.getPayload("Message\\\\").isEmpty());
        assertTrue(FeedUtils.getPayload("Message#\\|").isEmpty());
        assertTrue(FeedUtils.getPayload("Message\\|").isEmpty());
        assertTrue(FeedUtils.getPayload("\\|Not all who wander are lost").isEmpty());
        assertTrue(FeedUtils.getPayload("\\|\\").isEmpty());
        assertTrue(FeedUtils.getPayload("\\|#|").isEmpty());
        assertTrue(FeedUtils.getPayload("\\|\\\\").isEmpty());
        assertTrue(FeedUtils.getPayload("\\|#").isEmpty());
        assertTrue(FeedUtils.getPayload("\\|#\\|").isEmpty());
        assertTrue(FeedUtils.getPayload("\\|Message").isEmpty());
        assertTrue(FeedUtils.getPayload("\\|\\|").isEmpty());
        assertTrue(FeedUtils.getPayload("\\|1").isEmpty());
        assertTrue(FeedUtils.getPayload("\\|42").isEmpty());
        assertTrue(FeedUtils.getPayload("\\|com.example.feedreader.pojo.Event$EventBuilder").isEmpty());
        assertTrue(FeedUtils.getPayload("\\|com.example.feedreader.pojo.Market$MarketBuilder").isEmpty());
        assertTrue(FeedUtils.getPayload("\\|com.example.feedreader.pojo.Outcome$OutcomeBuilder").isEmpty());
        assertTrue(FeedUtils.getPayload("\\|java.lang.String").isEmpty());
        assertTrue(FeedUtils.getPayload("1\\").isEmpty());
        assertTrue(FeedUtils.getPayload("1#|").isEmpty());
        assertTrue(FeedUtils.getPayload("1\\\\").isEmpty());
        assertTrue(FeedUtils.getPayload("1#\\|").isEmpty());
        assertTrue(FeedUtils.getPayload("1\\|").isEmpty());
        assertTrue(FeedUtils.getPayload("42\\").isEmpty());
        assertTrue(FeedUtils.getPayload("42#|").isEmpty());
        assertTrue(FeedUtils.getPayload("42\\\\").isEmpty());
        assertTrue(FeedUtils.getPayload("42#\\|").isEmpty());
        assertTrue(FeedUtils.getPayload("42\\|").isEmpty());
        assertTrue(FeedUtils.getPayload("com.example.feedreader.pojo.Event$EventBuilder\\").isEmpty());
        assertTrue(FeedUtils.getPayload("com.example.feedreader.pojo.Event$EventBuilder#|").isEmpty());
        assertTrue(FeedUtils.getPayload("com.example.feedreader.pojo.Event$EventBuilder\\\\").isEmpty());
        assertTrue(FeedUtils.getPayload("com.example.feedreader.pojo.Event$EventBuilder#\\|").isEmpty());
        assertTrue(FeedUtils.getPayload("com.example.feedreader.pojo.Event$EventBuilder\\|").isEmpty());
        assertTrue(FeedUtils.getPayload("com.example.feedreader.pojo.Market$MarketBuilder\\").isEmpty());
        assertTrue(FeedUtils.getPayload("com.example.feedreader.pojo.Market$MarketBuilder#|").isEmpty());
        assertTrue(FeedUtils.getPayload("com.example.feedreader.pojo.Market$MarketBuilder\\\\").isEmpty());
        assertTrue(FeedUtils.getPayload("com.example.feedreader.pojo.Market$MarketBuilder#\\|").isEmpty());
        assertTrue(FeedUtils.getPayload("com.example.feedreader.pojo.Market$MarketBuilder\\|").isEmpty());
        assertTrue(FeedUtils.getPayload("com.example.feedreader.pojo.Outcome$OutcomeBuilder\\").isEmpty());
        assertTrue(FeedUtils.getPayload("com.example.feedreader.pojo.Outcome$OutcomeBuilder#|").isEmpty());
        assertTrue(FeedUtils.getPayload("com.example.feedreader.pojo.Outcome$OutcomeBuilder\\\\").isEmpty());
        assertTrue(FeedUtils.getPayload("com.example.feedreader.pojo.Outcome$OutcomeBuilder#\\|").isEmpty());
        assertTrue(FeedUtils.getPayload("com.example.feedreader.pojo.Outcome$OutcomeBuilder\\|").isEmpty());
        assertTrue(FeedUtils.getPayload("java.lang.String\\").isEmpty());
        assertTrue(FeedUtils.getPayload("java.lang.String#|").isEmpty());
        assertTrue(FeedUtils.getPayload("java.lang.String\\\\").isEmpty());
        assertTrue(FeedUtils.getPayload("java.lang.String#\\|").isEmpty());
        assertTrue(FeedUtils.getPayload("java.lang.String\\|").isEmpty());
        assertTrue(FeedUtils.getPayload("Not all who wander are lostNot all who wander are lost\\").isEmpty());
        assertTrue(FeedUtils.getPayload("Not all who wander are lostNot all who wander are lost#|").isEmpty());
        assertTrue(FeedUtils.getPayload("Not all who wander are lostNot all who wander are lost\\\\").isEmpty());
        assertTrue(FeedUtils.getPayload("Not all who wander are lostNot all who wander are lost#\\|").isEmpty());
        assertTrue(FeedUtils.getPayload("Not all who wander are lostNot all who wander are lost\\|").isEmpty());
        assertTrue(FeedUtils.getPayload("Not all who wander are lost\\Not all who wander are lost").isEmpty());
        assertTrue(FeedUtils.getPayload("Not all who wander are lost\\#|").isEmpty());
        assertTrue(FeedUtils.getPayload("Not all who wander are lost\\\\\\").isEmpty());
        assertTrue(FeedUtils.getPayload("Not all who wander are lost\\#").isEmpty());
        assertTrue(FeedUtils.getPayload("Not all who wander are lost\\#\\|").isEmpty());
        assertTrue(FeedUtils.getPayload("Not all who wander are lost\\Message").isEmpty());
        assertTrue(FeedUtils.getPayload("Not all who wander are lost\\\\|").isEmpty());
        assertTrue(FeedUtils.getPayload("Not all who wander are lost\\1").isEmpty());
        assertTrue(FeedUtils.getPayload("Not all who wander are lost\\42").isEmpty());
        assertTrue(
                FeedUtils.getPayload("Not all who wander are lost\\com.example.feedreader.pojo.Event$EventBuilder").isEmpty());
        assertTrue(FeedUtils.getPayload("Not all who wander are lost\\com.example.feedreader.pojo.Market$MarketBuilder")
                .isEmpty());
        assertTrue(FeedUtils.getPayload("Not all who wander are lost\\com.example.feedreader.pojo.Outcome$OutcomeBuilder")
                .isEmpty());
        assertTrue(FeedUtils.getPayload("Not all who wander are lost\\java.lang.String").isEmpty());
        assertTrue(FeedUtils.getPayload("Not all who wander are lost#|Not all who wander are lost").isEmpty());
        assertTrue(FeedUtils.getPayload("Not all who wander are lost#|\\").isEmpty());
        assertTrue(FeedUtils.getPayload("Not all who wander are lost#|#|").isEmpty());
        assertTrue(FeedUtils.getPayload("Not all who wander are lost#|\\\\").isEmpty());
        assertTrue(FeedUtils.getPayload("Not all who wander are lost#|#\\|").isEmpty());
        assertTrue(FeedUtils.getPayload("Not all who wander are lost#|Message").isEmpty());
        assertTrue(FeedUtils.getPayload("Not all who wander are lost#|\\|").isEmpty());
        assertTrue(FeedUtils.getPayload("Not all who wander are lost#|1").isEmpty());
        assertTrue(FeedUtils.getPayload("Not all who wander are lost#|42").isEmpty());
        assertTrue(
                FeedUtils.getPayload("Not all who wander are lost#|com.example.feedreader.pojo.Event$EventBuilder").isEmpty());
        assertTrue(FeedUtils.getPayload("Not all who wander are lost#|com.example.feedreader.pojo.Market$MarketBuilder")
                .isEmpty());
        assertTrue(FeedUtils.getPayload("Not all who wander are lost#|com.example.feedreader.pojo.Outcome$OutcomeBuilder")
                .isEmpty());
        assertTrue(FeedUtils.getPayload("Not all who wander are lost#|java.lang.String").isEmpty());
        assertTrue(FeedUtils.getPayload("Not all who wander are lost\\\\Not all who wander are lost").isEmpty());
        assertTrue(FeedUtils.getPayload("Not all who wander are lost\\\\#|").isEmpty());
        assertTrue(FeedUtils.getPayload("Not all who wander are lost\\\\\\\\").isEmpty());
        assertTrue(FeedUtils.getPayload("Not all who wander are lost\\\\#").isEmpty());
        assertTrue(FeedUtils.getPayload("Not all who wander are lost\\\\#\\|").isEmpty());
        assertTrue(FeedUtils.getPayload("Not all who wander are lost\\\\Message").isEmpty());
        assertTrue(FeedUtils.getPayload("Not all who wander are lost\\\\\\|").isEmpty());
        assertTrue(FeedUtils.getPayload("Not all who wander are lost\\\\1").isEmpty());
        assertTrue(FeedUtils.getPayload("Not all who wander are lost\\\\42").isEmpty());
        assertTrue(FeedUtils.getPayload("Not all who wander are lost\\\\com.example.feedreader.pojo.Event$EventBuilder")
                .isEmpty());
        assertTrue(FeedUtils.getPayload("Not all who wander are lost\\\\com.example.feedreader.pojo.Market$MarketBuilder")
                .isEmpty());
        assertTrue(FeedUtils.getPayload("Not all who wander are lost\\\\com.example.feedreader.pojo.Outcome$OutcomeBuilder")
                .isEmpty());
        assertTrue(FeedUtils.getPayload("Not all who wander are lost\\\\java.lang.String").isEmpty());
        assertTrue(FeedUtils.getPayload("Not all who wander are lost#\\").isEmpty());
        assertTrue(FeedUtils.getPayload("Not all who wander are lost#\\\\").isEmpty());
        assertTrue(FeedUtils.getPayload("Not all who wander are lost##\\|").isEmpty());
        assertTrue(FeedUtils.getPayload("Not all who wander are lost#\\|Not all who wander are lost").isEmpty());
        assertTrue(FeedUtils.getPayload("Not all who wander are lost#\\|\\").isEmpty());
        assertTrue(FeedUtils.getPayload("Not all who wander are lost#\\|#|").isEmpty());
        assertTrue(FeedUtils.getPayload("Not all who wander are lost#\\|\\\\").isEmpty());
        assertTrue(FeedUtils.getPayload("Not all who wander are lost#\\|#").isEmpty());
        assertTrue(FeedUtils.getPayload("Not all who wander are lost#\\|#\\|").isEmpty());
        assertTrue(FeedUtils.getPayload("Not all who wander are lost#\\|Message").isEmpty());
        assertTrue(FeedUtils.getPayload("Not all who wander are lost#\\|\\|").isEmpty());
        assertTrue(FeedUtils.getPayload("Not all who wander are lost#\\|1").isEmpty());
        assertTrue(FeedUtils.getPayload("Not all who wander are lost#\\|42").isEmpty());
        assertTrue(FeedUtils.getPayload("Not all who wander are lost#\\|com.example.feedreader.pojo.Event$EventBuilder")
                .isEmpty());
        assertTrue(FeedUtils.getPayload("Not all who wander are lost#\\|com.example.feedreader.pojo.Market$MarketBuilder")
                .isEmpty());
        assertTrue(FeedUtils.getPayload("Not all who wander are lost#\\|com.example.feedreader.pojo.Outcome$OutcomeBuilder")
                .isEmpty());
        assertTrue(FeedUtils.getPayload("Not all who wander are lost#\\|java.lang.String").isEmpty());
        assertTrue(FeedUtils.getPayload("Not all who wander are lostMessage\\").isEmpty());
        assertTrue(FeedUtils.getPayload("Not all who wander are lostMessage#|").isEmpty());
        assertTrue(FeedUtils.getPayload("Not all who wander are lostMessage\\\\").isEmpty());
        assertTrue(FeedUtils.getPayload("Not all who wander are lostMessage#\\|").isEmpty());
        assertTrue(FeedUtils.getPayload("Not all who wander are lostMessage\\|").isEmpty());
        assertTrue(FeedUtils.getPayload("Not all who wander are lost\\|Not all who wander are lost").isEmpty());
        assertTrue(FeedUtils.getPayload("Not all who wander are lost\\|\\").isEmpty());
        assertTrue(FeedUtils.getPayload("Not all who wander are lost\\|#|").isEmpty());
        assertTrue(FeedUtils.getPayload("Not all who wander are lost\\|\\\\").isEmpty());
        assertTrue(FeedUtils.getPayload("Not all who wander are lost\\|#").isEmpty());
        assertTrue(FeedUtils.getPayload("Not all who wander are lost\\|#\\|").isEmpty());
    }

    @Test
    @Ignore("TODO: This test is incomplete")
    public void testGetEvent() {
        // TODO: This test is incomplete.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        //       at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        //       at java.util.ArrayList.get(ArrayList.java:435)
        //       at com.example.feedreader.util.FeedUtils.getEvent(FeedUtils.java:23)
        //   In order to prevent getEvent(List)
        //   from throwing IndexOutOfBoundsException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getEvent(List).
        //   See https://diff.blue/R013 to resolve this issue.

        FeedUtils.getEvent(new ArrayList<>());
    }

    @Test
    @Ignore("TODO: This test is incomplete")
    public void testGetEvent2() {
        // TODO: This test is incomplete.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NumberFormatException: For input string: "foo"
        //       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        //       at java.lang.Integer.parseInt(Integer.java:580)
        //       at java.lang.Integer.parseInt(Integer.java:615)
        //       at com.example.feedreader.util.FeedUtils.getEvent(FeedUtils.java:23)
        //   In order to prevent getEvent(List)
        //   from throwing NumberFormatException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getEvent(List).
        //   See https://diff.blue/R013 to resolve this issue.

        ArrayList arrayList = new ArrayList();
        arrayList.add("foo");
        arrayList.add("foo");
        arrayList.add("foo");
        arrayList.add("foo");
        arrayList.add("foo");
        arrayList.add("foo");
        arrayList.add("foo");
        arrayList.add("foo");
        arrayList.add("foo");
        arrayList.add("foo");
        arrayList.add("foo");
        FeedUtils.getEvent(arrayList);
    }

    @Test
    @Ignore("TODO: This test is incomplete")
    public void testGetEvent3() {
        // TODO: This test is incomplete.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IndexOutOfBoundsException: Index: 1, Size: 1
        //       at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        //       at java.util.ArrayList.get(ArrayList.java:435)
        //       at com.example.feedreader.util.FeedUtils.getEvent(FeedUtils.java:24)
        //   In order to prevent getEvent(List)
        //   from throwing IndexOutOfBoundsException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getEvent(List).
        //   See https://diff.blue/R013 to resolve this issue.

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("42");
        FeedUtils.getEvent(stringList);
    }

    @Test
    @Ignore("TODO: This test is incomplete")
    public void testGetEvent4() {
        // TODO: This test is incomplete.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IndexOutOfBoundsException: Index: 2, Size: 2
        //       at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        //       at java.util.ArrayList.get(ArrayList.java:435)
        //       at com.example.feedreader.util.FeedUtils.getEvent(FeedUtils.java:25)
        //   In order to prevent getEvent(List)
        //   from throwing IndexOutOfBoundsException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getEvent(List).
        //   See https://diff.blue/R013 to resolve this issue.

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("42");
        stringList.add("42");
        FeedUtils.getEvent(stringList);
    }

    @Test
    @Ignore("TODO: This test is incomplete")
    public void testGetEvent5() {
        // TODO: This test is incomplete.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IndexOutOfBoundsException: Index: 3, Size: 3
        //       at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        //       at java.util.ArrayList.get(ArrayList.java:435)
        //       at com.example.feedreader.util.FeedUtils.getEvent(FeedUtils.java:26)
        //   In order to prevent getEvent(List)
        //   from throwing IndexOutOfBoundsException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getEvent(List).
        //   See https://diff.blue/R013 to resolve this issue.

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        FeedUtils.getEvent(stringList);
    }

    @Test
    @Ignore("TODO: This test is incomplete")
    public void testGetEvent6() {
        // TODO: This test is incomplete.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IndexOutOfBoundsException: Index: 4, Size: 4
        //       at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        //       at java.util.ArrayList.get(ArrayList.java:435)
        //       at com.example.feedreader.util.FeedUtils.getEvent(FeedUtils.java:27)
        //   In order to prevent getEvent(List)
        //   from throwing IndexOutOfBoundsException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getEvent(List).
        //   See https://diff.blue/R013 to resolve this issue.

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        FeedUtils.getEvent(stringList);
    }

    @Test
    @Ignore("TODO: This test is incomplete")
    public void testGetEvent7() {
        // TODO: This test is incomplete.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IndexOutOfBoundsException: Index: 5, Size: 5
        //       at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        //       at java.util.ArrayList.get(ArrayList.java:435)
        //       at com.example.feedreader.util.FeedUtils.getEvent(FeedUtils.java:28)
        //   In order to prevent getEvent(List)
        //   from throwing IndexOutOfBoundsException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getEvent(List).
        //   See https://diff.blue/R013 to resolve this issue.

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        FeedUtils.getEvent(stringList);
    }

    @Test
    @Ignore("TODO: This test is incomplete")
    public void testGetEvent8() {
        // TODO: This test is incomplete.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NumberFormatException: For input string: "foo"
        //       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        //       at java.lang.Long.parseLong(Long.java:589)
        //       at java.lang.Long.parseLong(Long.java:631)
        //       at com.example.feedreader.util.FeedUtils.getEvent(FeedUtils.java:26)
        //   In order to prevent getEvent(List)
        //   from throwing NumberFormatException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getEvent(List).
        //   See https://diff.blue/R013 to resolve this issue.

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        stringList.add("foo");
        FeedUtils.getEvent(stringList);
    }

    @Test
    @Ignore("TODO: This test is incomplete")
    public void testGetEvent9() {
        // TODO: This test is incomplete.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IndexOutOfBoundsException: Index: 6, Size: 6
        //       at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        //       at java.util.ArrayList.get(ArrayList.java:435)
        //       at com.example.feedreader.util.FeedUtils.getEvent(FeedUtils.java:29)
        //   In order to prevent getEvent(List)
        //   from throwing IndexOutOfBoundsException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getEvent(List).
        //   See https://diff.blue/R013 to resolve this issue.

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        FeedUtils.getEvent(stringList);
    }

    @Test
    @Ignore("TODO: This test is incomplete")
    public void testGetEvent10() {
        // TODO: This test is incomplete.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IndexOutOfBoundsException: Index: 7, Size: 7
        //       at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        //       at java.util.ArrayList.get(ArrayList.java:435)
        //       at com.example.feedreader.util.FeedUtils.getEvent(FeedUtils.java:30)
        //   In order to prevent getEvent(List)
        //   from throwing IndexOutOfBoundsException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getEvent(List).
        //   See https://diff.blue/R013 to resolve this issue.

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        FeedUtils.getEvent(stringList);
    }

    @Test
    @Ignore("TODO: This test is incomplete")
    public void testGetEvent11() {
        // TODO: This test is incomplete.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IndexOutOfBoundsException: Index: 8, Size: 8
        //       at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        //       at java.util.ArrayList.get(ArrayList.java:435)
        //       at com.example.feedreader.util.FeedUtils.getEvent(FeedUtils.java:31)
        //   In order to prevent getEvent(List)
        //   from throwing IndexOutOfBoundsException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getEvent(List).
        //   See https://diff.blue/R013 to resolve this issue.

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        FeedUtils.getEvent(stringList);
    }

    @Test
    @Ignore("TODO: This test is incomplete")
    public void testGetEvent12() {
        // TODO: This test is incomplete.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IndexOutOfBoundsException: Index: 9, Size: 9
        //       at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        //       at java.util.ArrayList.get(ArrayList.java:435)
        //       at com.example.feedreader.util.FeedUtils.getEvent(FeedUtils.java:32)
        //   In order to prevent getEvent(List)
        //   from throwing IndexOutOfBoundsException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getEvent(List).
        //   See https://diff.blue/R013 to resolve this issue.

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        FeedUtils.getEvent(stringList);
    }

    @Test
    @Ignore("TODO: This test is incomplete")
    public void testGetEvent13() {
        // TODO: This test is incomplete.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IndexOutOfBoundsException: Index: 10, Size: 10
        //       at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        //       at java.util.ArrayList.get(ArrayList.java:435)
        //       at com.example.feedreader.util.FeedUtils.getEvent(FeedUtils.java:33)
        //   In order to prevent getEvent(List)
        //   from throwing IndexOutOfBoundsException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getEvent(List).
        //   See https://diff.blue/R013 to resolve this issue.

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        FeedUtils.getEvent(stringList);
    }

    @Test
    @Ignore("TODO: This test is incomplete")
    public void testGetEvent14() {
        // TODO: This test is incomplete.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NumberFormatException: For input string: "foo"
        //       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        //       at java.lang.Long.parseLong(Long.java:589)
        //       at java.lang.Long.parseLong(Long.java:631)
        //       at com.example.feedreader.util.FeedUtils.getEvent(FeedUtils.java:31)
        //   In order to prevent getEvent(List)
        //   from throwing NumberFormatException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getEvent(List).
        //   See https://diff.blue/R013 to resolve this issue.

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        stringList.add("foo");
        FeedUtils.getEvent(stringList);
    }

    @Test
    public void testGetEvent15() {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("1");
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        Event actualEvent = FeedUtils.getEvent(stringList);
        assertEquals("42", actualEvent.getCategory());
        assertFalse(actualEvent.isSuspended());
        assertFalse(actualEvent.isDisplayed());
        assertEquals("42", actualEvent.getType());
        assertEquals(42L, actualEvent.getTimestamp().longValue());
        assertEquals("42", actualEvent.getSubCategory());
        assertEquals(42L, actualEvent.getStartTime().longValue());
        assertEquals("42", actualEvent.getOperation());
        assertEquals("42", actualEvent.getName());
        assertEquals(1, actualEvent.getMsgId().intValue());
        assertEquals("42", actualEvent.getEventId());
    }

    @Test
    @Ignore("TODO: This test is incomplete")
    public void testGetEvent16() {
        // TODO: This test is incomplete.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IndexOutOfBoundsException: Index: 10, Size: 10
        //       at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        //       at java.util.ArrayList.get(ArrayList.java:435)
        //       at com.example.feedreader.util.FeedUtils.getEvent(FeedUtils.java:33)
        //   In order to prevent getEvent(List)
        //   from throwing IndexOutOfBoundsException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getEvent(List).
        //   See https://diff.blue/R013 to resolve this issue.

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        stringList.add("1");
        FeedUtils.getEvent(stringList);
    }

    @Test
    @Ignore("TODO: This test is incomplete")
    public void testGetMarket() {
        // TODO: This test is incomplete.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        //       at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        //       at java.util.ArrayList.get(ArrayList.java:435)
        //       at com.example.feedreader.util.FeedUtils.getMarket(FeedUtils.java:39)
        //   In order to prevent getMarket(List)
        //   from throwing IndexOutOfBoundsException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getMarket(List).
        //   See https://diff.blue/R013 to resolve this issue.

        FeedUtils.getMarket(new ArrayList<>());
    }

    @Test
    @Ignore("TODO: This test is incomplete")
    public void testGetMarket2() {
        // TODO: This test is incomplete.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NumberFormatException: For input string: "foo"
        //       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        //       at java.lang.Integer.parseInt(Integer.java:580)
        //       at java.lang.Integer.parseInt(Integer.java:615)
        //       at com.example.feedreader.util.FeedUtils.getMarket(FeedUtils.java:39)
        //   In order to prevent getMarket(List)
        //   from throwing NumberFormatException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getMarket(List).
        //   See https://diff.blue/R013 to resolve this issue.

        ArrayList arrayList = new ArrayList();
        arrayList.add("foo");
        arrayList.add("foo");
        arrayList.add("foo");
        arrayList.add("foo");
        arrayList.add("foo");
        arrayList.add("foo");
        arrayList.add("foo");
        arrayList.add("foo");
        arrayList.add("foo");
        FeedUtils.getMarket(arrayList);
    }

    @Test
    @Ignore("TODO: This test is incomplete")
    public void testGetMarket3() {
        // TODO: This test is incomplete.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IndexOutOfBoundsException: Index: 1, Size: 1
        //       at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        //       at java.util.ArrayList.get(ArrayList.java:435)
        //       at com.example.feedreader.util.FeedUtils.getMarket(FeedUtils.java:40)
        //   In order to prevent getMarket(List)
        //   from throwing IndexOutOfBoundsException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getMarket(List).
        //   See https://diff.blue/R013 to resolve this issue.

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("42");
        FeedUtils.getMarket(stringList);
    }

    @Test
    @Ignore("TODO: This test is incomplete")
    public void testGetMarket4() {
        // TODO: This test is incomplete.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IndexOutOfBoundsException: Index: 2, Size: 2
        //       at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        //       at java.util.ArrayList.get(ArrayList.java:435)
        //       at com.example.feedreader.util.FeedUtils.getMarket(FeedUtils.java:41)
        //   In order to prevent getMarket(List)
        //   from throwing IndexOutOfBoundsException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getMarket(List).
        //   See https://diff.blue/R013 to resolve this issue.

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("42");
        stringList.add("42");
        FeedUtils.getMarket(stringList);
    }

    @Test
    @Ignore("TODO: This test is incomplete")
    public void testGetMarket5() {
        // TODO: This test is incomplete.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IndexOutOfBoundsException: Index: 3, Size: 3
        //       at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        //       at java.util.ArrayList.get(ArrayList.java:435)
        //       at com.example.feedreader.util.FeedUtils.getMarket(FeedUtils.java:42)
        //   In order to prevent getMarket(List)
        //   from throwing IndexOutOfBoundsException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getMarket(List).
        //   See https://diff.blue/R013 to resolve this issue.

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        FeedUtils.getMarket(stringList);
    }

    @Test
    @Ignore("TODO: This test is incomplete")
    public void testGetMarket6() {
        // TODO: This test is incomplete.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IndexOutOfBoundsException: Index: 4, Size: 4
        //       at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        //       at java.util.ArrayList.get(ArrayList.java:435)
        //       at com.example.feedreader.util.FeedUtils.getMarket(FeedUtils.java:43)
        //   In order to prevent getMarket(List)
        //   from throwing IndexOutOfBoundsException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getMarket(List).
        //   See https://diff.blue/R013 to resolve this issue.

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        FeedUtils.getMarket(stringList);
    }

    @Test
    @Ignore("TODO: This test is incomplete")
    public void testGetMarket7() {
        // TODO: This test is incomplete.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IndexOutOfBoundsException: Index: 5, Size: 5
        //       at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        //       at java.util.ArrayList.get(ArrayList.java:435)
        //       at com.example.feedreader.util.FeedUtils.getMarket(FeedUtils.java:44)
        //   In order to prevent getMarket(List)
        //   from throwing IndexOutOfBoundsException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getMarket(List).
        //   See https://diff.blue/R013 to resolve this issue.

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        FeedUtils.getMarket(stringList);
    }

    @Test
    @Ignore("TODO: This test is incomplete")
    public void testGetMarket8() {
        // TODO: This test is incomplete.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NumberFormatException: For input string: "foo"
        //       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        //       at java.lang.Long.parseLong(Long.java:589)
        //       at java.lang.Long.parseLong(Long.java:631)
        //       at com.example.feedreader.util.FeedUtils.getMarket(FeedUtils.java:42)
        //   In order to prevent getMarket(List)
        //   from throwing NumberFormatException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getMarket(List).
        //   See https://diff.blue/R013 to resolve this issue.

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        stringList.add("foo");
        FeedUtils.getMarket(stringList);
    }

    @Test
    @Ignore("TODO: This test is incomplete")
    public void testGetMarket9() {
        // TODO: This test is incomplete.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IndexOutOfBoundsException: Index: 6, Size: 6
        //       at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        //       at java.util.ArrayList.get(ArrayList.java:435)
        //       at com.example.feedreader.util.FeedUtils.getMarket(FeedUtils.java:45)
        //   In order to prevent getMarket(List)
        //   from throwing IndexOutOfBoundsException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getMarket(List).
        //   See https://diff.blue/R013 to resolve this issue.

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        FeedUtils.getMarket(stringList);
    }

    @Test
    @Ignore("TODO: This test is incomplete")
    public void testGetMarket10() {
        // TODO: This test is incomplete.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IndexOutOfBoundsException: Index: 7, Size: 7
        //       at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        //       at java.util.ArrayList.get(ArrayList.java:435)
        //       at com.example.feedreader.util.FeedUtils.getMarket(FeedUtils.java:46)
        //   In order to prevent getMarket(List)
        //   from throwing IndexOutOfBoundsException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getMarket(List).
        //   See https://diff.blue/R013 to resolve this issue.

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        FeedUtils.getMarket(stringList);
    }

    @Test
    @Ignore("TODO: This test is incomplete")
    public void testGetMarket11() {
        // TODO: This test is incomplete.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IndexOutOfBoundsException: Index: 8, Size: 8
        //       at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        //       at java.util.ArrayList.get(ArrayList.java:435)
        //       at com.example.feedreader.util.FeedUtils.getMarket(FeedUtils.java:47)
        //   In order to prevent getMarket(List)
        //   from throwing IndexOutOfBoundsException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getMarket(List).
        //   See https://diff.blue/R013 to resolve this issue.

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        FeedUtils.getMarket(stringList);
    }

    @Test
    public void testGetMarket12() {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("1");
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        Market actualMarket = FeedUtils.getMarket(stringList);
        assertEquals("42", actualMarket.getEventId());
        assertFalse(actualMarket.isSuspended());
        assertFalse(actualMarket.isDisplayed());
        assertEquals("42", actualMarket.getType());
        assertEquals(42L, actualMarket.getTimestamp().longValue());
        assertEquals("42", actualMarket.getOperation());
        assertEquals("42", actualMarket.getName());
        assertEquals(1, actualMarket.getMsgId().intValue());
        assertEquals("42", actualMarket.getMarketId());
    }

    @Test
    @Ignore("TODO: This test is incomplete")
    public void testGetMarket13() {
        // TODO: This test is incomplete.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IndexOutOfBoundsException: Index: 8, Size: 8
        //       at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        //       at java.util.ArrayList.get(ArrayList.java:435)
        //       at com.example.feedreader.util.FeedUtils.getMarket(FeedUtils.java:47)
        //   In order to prevent getMarket(List)
        //   from throwing IndexOutOfBoundsException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getMarket(List).
        //   See https://diff.blue/R013 to resolve this issue.

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        stringList.add("1");
        FeedUtils.getMarket(stringList);
    }

    @Test
    @Ignore("TODO: This test is incomplete")
    public void testGetOutCome() {
        // TODO: This test is incomplete.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        //       at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        //       at java.util.ArrayList.get(ArrayList.java:435)
        //       at com.example.feedreader.util.FeedUtils.getOutCome(FeedUtils.java:53)
        //   In order to prevent getOutCome(List)
        //   from throwing IndexOutOfBoundsException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getOutCome(List).
        //   See https://diff.blue/R013 to resolve this issue.

        FeedUtils.getOutCome(new ArrayList<>());
    }

    @Test
    @Ignore("TODO: This test is incomplete")
    public void testGetOutCome2() {
        // TODO: This test is incomplete.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NumberFormatException: For input string: "foo"
        //       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        //       at java.lang.Integer.parseInt(Integer.java:580)
        //       at java.lang.Integer.parseInt(Integer.java:615)
        //       at com.example.feedreader.util.FeedUtils.getOutCome(FeedUtils.java:53)
        //   In order to prevent getOutCome(List)
        //   from throwing NumberFormatException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getOutCome(List).
        //   See https://diff.blue/R013 to resolve this issue.

        ArrayList arrayList = new ArrayList();
        arrayList.add("foo");
        arrayList.add("foo");
        arrayList.add("foo");
        arrayList.add("foo");
        arrayList.add("foo");
        arrayList.add("foo");
        arrayList.add("foo");
        arrayList.add("foo");
        arrayList.add("foo");
        arrayList.add("foo");
        FeedUtils.getOutCome(arrayList);
    }

    @Test
    @Ignore("TODO: This test is incomplete")
    public void testGetOutCome3() {
        // TODO: This test is incomplete.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IndexOutOfBoundsException: Index: 1, Size: 1
        //       at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        //       at java.util.ArrayList.get(ArrayList.java:435)
        //       at com.example.feedreader.util.FeedUtils.getOutCome(FeedUtils.java:54)
        //   In order to prevent getOutCome(List)
        //   from throwing IndexOutOfBoundsException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getOutCome(List).
        //   See https://diff.blue/R013 to resolve this issue.

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("42");
        FeedUtils.getOutCome(stringList);
    }

    @Test
    @Ignore("TODO: This test is incomplete")
    public void testGetOutCome4() {
        // TODO: This test is incomplete.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IndexOutOfBoundsException: Index: 2, Size: 2
        //       at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        //       at java.util.ArrayList.get(ArrayList.java:435)
        //       at com.example.feedreader.util.FeedUtils.getOutCome(FeedUtils.java:55)
        //   In order to prevent getOutCome(List)
        //   from throwing IndexOutOfBoundsException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getOutCome(List).
        //   See https://diff.blue/R013 to resolve this issue.

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("42");
        stringList.add("42");
        FeedUtils.getOutCome(stringList);
    }

    @Test
    @Ignore("TODO: This test is incomplete")
    public void testGetOutCome5() {
        // TODO: This test is incomplete.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IndexOutOfBoundsException: Index: 3, Size: 3
        //       at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        //       at java.util.ArrayList.get(ArrayList.java:435)
        //       at com.example.feedreader.util.FeedUtils.getOutCome(FeedUtils.java:56)
        //   In order to prevent getOutCome(List)
        //   from throwing IndexOutOfBoundsException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getOutCome(List).
        //   See https://diff.blue/R013 to resolve this issue.

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        FeedUtils.getOutCome(stringList);
    }

    @Test
    @Ignore("TODO: This test is incomplete")
    public void testGetOutCome6() {
        // TODO: This test is incomplete.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IndexOutOfBoundsException: Index: 5, Size: 4
        //       at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        //       at java.util.ArrayList.get(ArrayList.java:435)
        //       at com.example.feedreader.util.FeedUtils.getOutCome(FeedUtils.java:57)
        //   In order to prevent getOutCome(List)
        //   from throwing IndexOutOfBoundsException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getOutCome(List).
        //   See https://diff.blue/R013 to resolve this issue.

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        FeedUtils.getOutCome(stringList);
    }

    @Test
    @Ignore("TODO: This test is incomplete")
    public void testGetOutCome7() {
        // TODO: This test is incomplete.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NumberFormatException: For input string: "foo"
        //       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        //       at java.lang.Long.parseLong(Long.java:589)
        //       at java.lang.Long.parseLong(Long.java:631)
        //       at com.example.feedreader.util.FeedUtils.getOutCome(FeedUtils.java:56)
        //   In order to prevent getOutCome(List)
        //   from throwing NumberFormatException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getOutCome(List).
        //   See https://diff.blue/R013 to resolve this issue.

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("42");
        stringList.add("42");
        stringList.add("42");
        stringList.add("foo");
        FeedUtils.getOutCome(stringList);
    }
}

