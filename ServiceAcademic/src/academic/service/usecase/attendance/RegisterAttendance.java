package academic.service.usecase.attendance;

import academic.DTO.AttendanceDTO;
import academic.domain.AttendanceDomain;
import academic.service.usecase.UseCase;

public interface RegisterAttendance extends UseCase<AttendanceDomain> {

	void execute(AttendanceDTO dto);

}
