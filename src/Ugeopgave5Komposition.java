public class Ugeopgave5Komposition {

    public static void main(String[] args) {

        Building building = new Building("Headquarters");

        Room meetingRoom = new Room("Meetingroom");

        meetingRoom.addLamp(new Lamp(40));
        meetingRoom.addLamp(new Lamp(60));
        meetingRoom.addWindow(new Window(120, 90));
        meetingRoom.addWindow(new Window(200, 90));

        Room breakRoom = new Room("Breakroom");

        breakRoom.addLamp(new Lamp(140));
        breakRoom.addLamp(new Lamp(80));
        breakRoom.addWindow(new Window(200, 120));

        Room office = new Room("Office");

        office.addLamp(new Lamp(80));
        office.addLamp(new Lamp(120));
        office.addWindow(new Window(120, 120));

        building.addRoom(meetingRoom);
        building.addRoom(breakRoom);
        building.addRoom(office);

        building.printBuilding();
    }
}
