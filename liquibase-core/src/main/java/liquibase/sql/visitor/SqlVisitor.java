package liquibase.sql.visitor;

import liquibase.database.Database;

import java.util.Collection;

public interface SqlVisitor {

    String modifySql(String sql, Database database);

    String getTagName();

    void setApplicableDbms(Collection modifySqlDbmsList);

    boolean isApplicable(Database database);

    void setApplyToRollback(boolean applyOnRollback);

    boolean isApplyToRollback();
}
