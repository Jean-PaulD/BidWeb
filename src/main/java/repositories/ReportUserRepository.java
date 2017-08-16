package repositories;

import domain.ReportUser;

/**
 * Created by Jean-Paul D on 2017-08-13.
 */
public interface ReportUserRepository {

    ReportUser create(ReportUser obj);

    ReportUser read(String id);

    ReportUser update(ReportUser obj);

    void delete(String id);
}
