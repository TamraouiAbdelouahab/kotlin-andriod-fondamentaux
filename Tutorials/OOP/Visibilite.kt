open class SmartDevice(val name: String, val category: String) {

    var deviceStatus = "online"
        public get() = field
        public set(value)
        {
            field = value
        }
}
fun main()
{
    val smartDevice = SmartDevice("Android TV", "Entertainment");
    smartDevice.deviceStatus = "offline"
    println(smartDevice.getdeviceStatus());

}