import java.util.ArrayList;
import java.util.List;

class OfficeEquipmentManager implements RecordManager {

    // TODO Хранить в файле/БД, переписать методы под работу с файлами
    private List<OfficeEquipment> equipmentList = new ArrayList<>();

    @Override
    public void addRecord(OfficeEquipment equipment) {
        equipmentList.add(equipment);
    }

    @Override
    public void deleteRecord(OfficeEquipment equipment) {
        equipmentList.remove(equipment);
    }

    @Override
    public void editRecord(OfficeEquipment equipment) {
        // Реализация редактирования записи
    }

    @Override
    public void viewRecords() {
        for (OfficeEquipment equipment : equipmentList) {
            equipment.displayInfo();
        }
    }
}