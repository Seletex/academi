package academic.service.facade.implementation;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import academic.DTO.AttendanceDTO;
import academic.domain.AttendanceDomain;
import academic.service.usecase.attendance.RegisterAttendance;
import academic.service.usecase.attendance.RegisterAttendanceFacade;

@Service
@Transactional
public class RegisterAttendanceFacadeImpl implements RegisterAttendance{
	
	private RegisterAttendance registerAttendance;

	public void execute(AttendanceDTO dto) {
		// TODO Auto-generated method stub
		AttendanceDomain domain = null;
		registerAttendance.execute(domain);
		
	}

	@Override
	public void execute(AttendanceDomain domain) {
		// TODO Auto-generated method stub
		
	}

	

}
