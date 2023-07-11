package HomeWork.Seminar3.Core.Personal;

import static HomeWork.Seminar3.Core.Clients.DoctorSpecialities.THERAPIST;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.LinkedHashMap;

import HomeWork.Seminar3.Core.Clients.DoctorSpecialities;
import HomeWork.Seminar3.Core.Clients.supports.Record;
import HomeWork.Seminar3.Core.drugStore.Marker;

public class Doc implements Marker {
    protected int vetPersonID;
    protected String fio;
    protected DoctorSpecialities speciality;
    protected String phoneNumber;
//    protected vetPersonSchedule doctorSchedule;

    public Doc(int id, String fio, DoctorSpecialities speciality, String phone) {
        vetPersonID = id;
        this.fio = fio;
        this.speciality = speciality;
        this.phoneNumber = phone;
    }
    public Doc(int id) {
        this(id, null, null, null);
    }
    public String getFIO () {
        return this.fio;
    }
    public void setFIO (String fio) {
        this.fio = fio;
    }
    public DoctorSpecialities getSpeciality () {
        return this.speciality;
    }
    public void setSpeciality (DoctorSpecialities speciality) {
        this.speciality = speciality;
    }
    protected int getDocID () { return this.vetPersonID; }
    public void showDoctorBriefInfo () {}
    public Record acceptPatient (int patientID) {
        // Метод возвращает запись в карточку пациента
        Record newRecord = new Record("", new Date());
        return newRecord;
    }


}
