package task2.mycheckinsfinal.database;

public class CheckinsDbSchema {

    public static final class CrimeTable {
        public static final String NAME = "crimes";

        public static final class Cols {
            public static final String UUID = "uuid";
            public static final String TITLE = "title";
            public static final String DATE = "date";
            public static final String PlACE = "place";
            public static final String DETAILS = "details";
            public static final String SOLVED = "solved";
            public static final String SUSPECT = "suspect";
            public static final String LONGITUDE = "longitude";
            public static final String LATITUDE = "latitude";
        }
    }
}
