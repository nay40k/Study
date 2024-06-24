package org.equipmentmanager.model;
import lombok.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class OfficeEquipment {

    private String name;
    private int inventoryNumber;
    private String serialNumber;
    private String status;
    private String location;


    public OfficeEquipment(String name, String serialNumber, String status, String location) {
        this.name = name;
        this.inventoryNumber = (int) (Math.random() * 100000);
        this.serialNumber = serialNumber;
        this.status = status;
        this.location = location;
    }


}
