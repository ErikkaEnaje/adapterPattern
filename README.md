## Problem statement

Plugging Devices into Power Outlets
You are developing an application that helps users manage and control various electronic devices by plugging them into power outlets. Each device has different plug types, voltage, and amperage requirements. To ensure compatibility and safety, you need to create adapters for different devices to allow them to be plugged into standard power outlets.

ADAPTEE OBJECTS:
<li>Laptop - Represents a laptop device that needs to be plugged into a power source. It has the charge() method.
<li>Refrigerator - Represents a refrigerator device that requires a power source. It has the startCooling() method.
<li>SmartphoneCharger - Represents a smartphone charger that needs to be plugged in for charging. It has the chargePhone() method.

TARGET OBJECTS:
<li>PowerOutlet - Represents a standard power outlet with a common interface for plugging in devices. It defines the plugIn() method as the target method.

ADAPTER OBJECTS:
<li>LaptopAdapter - An adapter for plugging a laptop into a standard power outlet. It adapts the Laptop to the PowerOutlet interface, translating plugIn() to charge().
<li>RefrigeratorAdapter - An adapter for plugging a refrigerator into a standard power outlet. It adapts the Refrigerator to the PowerOutlet interface, translating plugIn() to startCooling().
<li>SmartphoneAdapter - An adapter for plugging a smartphone charger into a standard power outlet. It adapts the SmartphoneCharger to the PowerOutlet interface, translating plugIn() to chargePhone().

## UML Diagram
- AdapterPattern
![lll](https://github.com/ErikkaEnaje/adapterPattern/assets/142382057/f43746d5-e22b-4bc9-b5e4-5b66038182c5)
