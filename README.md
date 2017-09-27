
# react-native-umc-open

## Getting started

`$ npm install react-native-umc-open --save`

### Mostly automatic installation

`$ react-native link react-native-umc-open`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-umc-open` and add `RNUmcOpen.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNUmcOpen.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNUmcOpenPackage;` to the imports at the top of the file
  - Add `new RNUmcOpenPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-umc-open'
  	project(':react-native-umc-open').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-umc-open/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-umc-open')
  	```

#### Windows
[Read it! :D](https://github.com/ReactWindows/react-native)

1. In Visual Studio add the `RNUmcOpen.sln` in `node_modules/react-native-umc-open/windows/RNUmcOpen.sln` folder to their solution, reference from their app.
2. Open up your `MainPage.cs` app
  - Add `using Umc.Open.RNUmcOpen;` to the usings at the top of the file
  - Add `new RNUmcOpenPackage()` to the `List<IReactPackage>` returned by the `Packages` method


## Usage
```javascript
import RNUmcOpen from 'react-native-umc-open';

// TODO: What to do with the module?
RNUmcOpen;
```
  