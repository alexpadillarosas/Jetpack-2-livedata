# Jetpack-2-livedata
The livedata component allows data to be observable. 
Live data is aware of the states of its observers therefore, it will send an event to the observer to update the UI with the latest value in the viewmodel.

## Adding LiveData to the viewmodel component is represented in the following diagram
![29EFF6CB-6510-4EC1-8590-1E5F25DA4C40](https://user-images.githubusercontent.com/4823319/69490316-f0457f80-0ed9-11ea-9261-cd72b7b841f7.jpg)

## Portrait of the app, it should work as in [Jetpack-1-viewmodeldemo](https://github.com/alexpadillarosas/Jetpack-1-viewmodeldemo)
![Screenshot_1574574335](https://user-images.githubusercontent.com/4823319/69490317-f0de1600-0ed9-11ea-8ec9-4c9b28546611.png)

## Landscape of the app, as it uses the viewmodel with live data it kept the data in the UI when the device was rotated.
   As soon as the Fragment get recreated(lifecycle) Livedata will send an event to the observer to update the UI with the latest value in the viewmodel.
![Screenshot_1574574344](https://user-images.githubusercontent.com/4823319/69490318-f0de1600-0ed9-11ea-9256-21616e4067e2.png)
