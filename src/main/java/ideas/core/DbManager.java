package ideas.core;

import ideas.models.Db;

public class DbManager {
    public static Db getDbInstance() {
        return new Db(
                TestRunParams.getDbServer(),
                TestRunParams.getDbPort(),
                TestRunParams.getDbUsername(),
                TestRunParams.getDbPassword(),
                null,
                null
        );
    }
}
