# Profile Design

<img src="/screenshots/video.gif" alt="sample" title="sample" width="320" height="800" align="right" vspace="52" />

[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)
[![Platform](https://img.shields.io/badge/platform-android-green.svg)](http://developer.android.com/index.html)
[![API](https://img.shields.io/badge/API-16%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=16)


Created this cool design from [Abdullah Sajol](https://www.uplabs.com/mdabdullahsajol) as an android application. 


  <img alt="Design on Uplabs" src="/screenshots/preview.jpg" width="396" height="380" />


USAGE
-----

Just add LightProgress view in your layout XML and LightProgress library in your project via Gradle:

```gradle
dependencies {
  implementation 'com.bitvale:lightprogress:1.0.0'
}
```

XML
-----

```xml
<com.bitvale.lightprogress.LightProgress
    android:id="@+id/light"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:textSize="@dimen/text_size"
    android:textColor="@color/text_color"
    android:text="@string/light_text"
    app:light_color="@color/light_color"/>
```

You must use the following properties in your XML to change your PacButton.


##### Properties:

* `android:text`                    (string)    -> default  "Loading"
* `android:textSize`                (dimension) -> default  56sp
* `android:textColor`               (color)     -> default  #484848
* `app:light_color`                 (color)     -> default  #FFFFFF

Kotlin
-----

```kotlin
light.setOnClickListener {
    if (!light.isOn()) light.on()
    else light.off()
}
```

LICENCE
-----

LightProgress by [Alexander Kolpakov](https://play.google.com/store/apps/dev?id=7044571013168957413) is licensed under an [Apache License 2.0](http://www.apache.org/licenses/LICENSE-2.0).
