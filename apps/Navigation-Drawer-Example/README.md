# Navigation-Drawer-Example-Tutorial
An AIDE tutorial on creating a material design navigation drawer with fragments example

#Pre-tutorial needs & to do's list:
1. An IDE preferably AIDE which you can get it on google play!
2. Create/use a icon for your app with mipmap folders- the following link will generate the folders & rename the files automatically
https://romannurik.github.io/AndroidAssetStudio/index.html

#AIDE TUTORIAL

STEP 1: Starting the project

1. Either use a project already created or create a new project by  tapping on “New Android App”

2. Write a name  & package name for your app. The app’s name you write will become the default project name & your package name needs to be UNIQUE!

3. For example my app's name is "NavigationDrawerExample" & my pakage's name is "com.mcs.navigationdrawerexample" After that you will have generated a basic android app project!

4. extract/add the mipmap folders to the res folder inside your app project & only delete the other "ic_launcher" from the other drawable folders.

Step 2: Editing Resources

Go to the app's build.gradle & rewrite it in the following way:

NOTE: change the applicationId to your own package's name

      apply plugin: 'com.android.application'
      
      android {
      compileSdkVersion 23
      buildToolsVersion "23.0.2"
      
      defaultConfig {
        applicationId "com.mcs.navigationdrawerexample"
        minSdkVersion 16
        targetSdkVersion 23
        versionCode 1
        versionName "1.0"
      }
      buildTypes {
        release {
            minifyEnabled false
            proguardFiles getDefaultProguardFile('proguard-android.txt'), 'proguard-rules.pro'
        }
      }
      }
      dependencies {
      compile fileTree(dir: 'libs', include: ['*.jar'])
      testCompile 'junit:junit:4.12'
      compile 'com.android.support:appcompat-v7:23.1.1'
    compile 'com.android.support:design:23.1.1'
      }

Then Go to AndroidManifest.xml & edit it like the following:

        <application
        android:allowBackup="true"
        android:icon="@mipmap/ic_launcher"
        android:label="@string/app_name"
        android:supportsRtl="true"
        android:theme="@style/AppTheme" >
        <activity
            android:name=".activities.MainActivity"
            android:label="@string/app_name"
            android:theme="@style/AppTheme.NoActionBar" >
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />

                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity>
        </application>

Now we turned our basic app project into a empty material design project lets continue on editing the resources!

1. Go to "values" folder & do the following:

1.1 edit the "strings.xml" by adding the following:

        <resources>
        
        <string name="app_name">Navigation Drawer Example</string>
        <string name="navigation_drawer_open">Open navigation drawer</string>
        <string name="navigation_drawer_close">Close navigation drawer</string>
        <string name="action_settings">Settings</string>
        
        <!-- NAVIGATION DRAWER -->
        <string name="nav_camera">Camera</string>
        <string name="nav_gallery">Gallery</string>
        <string name="nav_slideshow">SlideShow</string>
        <string name="nav_manage">Manage</string>
        <string name="nav_share">Share</string>
        <string name="nav_send">Send</string>
        
        <!-- MainFragment -->
        <string name="main">Main Fragment</string>
        <string name="main2">In this tutorial You will only see this screen once!</string>
        
        <!-- CameraFragment -->
        <string name="camera">Camera Fragment</string>
        
        <!-- GalleryFragment -->
        <string name="gallery">Gallery Fragment</string>
        
        <!-- SlideShowFragment -->
        <string name="slideshow">SlideShow Fragment</string>
        
        <!-- ManageFragment -->
        <string name="manage">Manage Fragment</string>
        
        <!-- ShareFragment -->
        <string name="share">share Fragment</string>
        
        <!-- SendFragment -->
        <string name="send">Send Fragment</string>
        
        </resources>

1.2 Create a file called "colors.xml" inside the values folder & add the following:

        <?xml version="1.0" encoding="utf-8"?>
        <resources>
        <color name="colorPrimary">#3F51B5</color>
        <color name="colorPrimaryDark">#303F9F</color>
        <color name="colorAccent">#FF4081</color>
        </resources>

1.3 Create a file called "dimens.xml" inside values folder & add the following:

        <resources>
        <!-- Default screen margins, per the Android Design guidelines. -->
        <dimen name="nav_header_vertical_spacing">16dp</dimen>
        <dimen name="nav_header_height">160dp</dimen>
        <!-- Default screen margins, per the Android Design guidelines. -->
        <dimen name="activity_horizontal_margin">16dp</dimen>
        <dimen name="activity_vertical_margin">16dp</dimen>
        <dimen name="fab_margin">16dp</dimen>
        </resources>

1.4 Create a file called "drawables.xml" inside values folder and COPY & PASTE this snippet:
 
       <resources xmlns:android="http://schemas.android.com/apk/res/android">
       <item name="ic_menu_camera" type="drawable">@android:drawable/ic_menu_camera</item>
       <item name="ic_menu_gallery" type="drawable">@android:drawable/ic_menu_gallery</item>
       <item name="ic_menu_slideshow" type="drawable">@android:drawable/ic_menu_slideshow</item>
       <item name="ic_menu_manage" type="drawable">@android:drawable/ic_menu_manage</item>
       <item name="ic_menu_share" type="drawable">@android:drawable/ic_menu_share</item>
       <item name="ic_menu_send" type="drawable">@android:drawable/ic_menu_send</item>
       </resources>

NOTE: You will see errors since we didn't create the files that are referenced in this part.

1.5 Inside the "values" folder open "styles.xml" & edit it like this:

       <resources>
       
       <!-- Base application theme. -->
       <style name="AppTheme" parent="Theme.AppCompat.Light.DarkActionBar">
       <!-- Customize your theme here. -->
       <item name="colorPrimary">@color/colorPrimary</item>
       <item name="colorPrimaryDark">@color/colorPrimaryDark</item>
       <item name="colorAccent">@color/colorAccent</item>
       </style>
      
       <style name="AppTheme.NoActionBar">
        <item name="windowActionBar">false</item>
        <item name="windowNoTitle">true</item>
       </style>
       
       <style name="AppTheme.AppBarOverlay" parent="ThemeOverlay.AppCompat.Dark.ActionBar" />
       
       <style name="AppTheme.PopupOverlay" parent="ThemeOverlay.AppCompat.Light" />
       
       </resources>

1.6 Create a folder called "drawable-v21" inside the "res" folder:

Note: once you create the following files the errors from the previous steps will be gone!

NOTE: these files are vector drawables which we will use as icons for our navigation drawer!

Create the following files inside "drawable-v21":

1. "ic_menu_camera.xml"
2. "ic_menu_gallery.xml"
3. "ic_menu_manage.xml"
4. "ic_menu_send.xml"
5. "ic_menu_share.xml"
6. "ic_menu_slideshow.xml"

In "ic_menu_camera.xml" add the following:

        <vector xmlns:android="http://schemas.android.com/apk/res/android"
        android:width="24dp"
        android:height="24dp"
        android:viewportHeight="24.0"
        android:viewportWidth="24.0">
        <path
        android:fillColor="#FF000000"
        android:pathData="M12,12m-3.2,0a3.2,3.2 0,1 1,6.4 0a3.2,3.2 0,1 1,-6.4 0" />
        <path
        android:fillColor="#FF000000"
        android:pathData="M9,2L7.17,4H4c-1.1,0 -2,0.9 -2,2v12c0,1.1 0.9,2 2,2h16c1.1,0 2,-0.9 2,-2V6c0,-1.1 -0.9,-2        -2,-2h-3.17L15,2H9zm3,15c-2.76,0 -5,-2.24 -5,-5s2.24,-5 5,-5 5,2.24 5,5 -2.24,5 -5,5z" />
        </vector>

In "ic_menu_gallery.xml" add the following:

        <vector xmlns:android="http://schemas.android.com/apk/res/android"
        android:width="24dp"
        android:height="24dp"
        android:viewportHeight="24.0"
        android:viewportWidth="24.0">
        <path
        android:fillColor="#FF000000"
        android:pathData="M22,16V4c0,-1.1 -0.9,-2 -2,-2H8c-1.1,0 -2,0.9 -2,2v12c0,1.1 0.9,2 2,2h12c1.1,0 2,-0.9 2,-2zm-11,-4l2.03,2.71L16,11l4,5H8l3,-4zM2,6v14c0,1.1 0.9,2 2,2h14v-2H4V6H2z" />
        </vector>

In "ic_menu_manage.xml" add the following:

       <vector xmlns:android="http://schemas.android.com/apk/res/android"
       android:width="24dp"
       android:height="24dp"
       android:viewportHeight="24.0"
       android:viewportWidth="24.0">
       <path
        android:fillColor="#FF000000"
        android:pathData="M22.7,19l-9.1,-9.1c0.9,-2.3 0.4,-5 -1.5,-6.9 -2,-2 -5,-2.4 -7.4,-1.3L9,6 6,9 1.6,4.7C0.4,7.1 0.9,10.1 2.9,12.1c1.9,1.9 4.6,2.4 6.9,1.5l9.1,9.1c0.4,0.4 1,0.4 1.4,0l2.3,-2.3c0.5,-0.4 0.5,-1.1 0.1,-1.4z" />
       </vector>

In "ic_menu_send.xml" add the following:

       <vector xmlns:android="http://schemas.android.com/apk/res/android"
       android:width="24dp"
       android:height="24dp"
       android:viewportHeight="24.0"
       android:viewportWidth="24.0">
       <path
       android:fillColor="#FF000000"
       android:pathData="M2.01,21L23,12 2.01,3 2,10l15,2 -15,2z" />
       </vector>

In ic_menu_share.xml add the following:

       <vector xmlns:android="http://schemas.android.com/apk/res/android"
       android:width="24dp"
       android:height="24dp"
       android:viewportHeight="24.0"
       android:viewportWidth="24.0">
       <path
        android:fillColor="#FF000000"
        android:pathData="M18,16.08c-0.76,0 -1.44,0.3 -1.96,0.77L8.91,12.7c0.05,-0.23 0.09,-0.46 0.09,-0.7s-0.04,-0.47 -0.09,-0.7l7.05,-4.11c0.54,0.5 1.25,0.81 2.04,0.81 1.66,0 3,-1.34 3,-3s-1.34,-3 -3,-3 -3,1.34 -3,3c0,0.24 0.04,0.47 0.09,0.7L8.04,9.81C7.5,9.31 6.79,9 6,9c-1.66,0 -3,1.34 -3,3s1.34,3 3,3c0.79,0 1.5,-0.31 2.04,-0.81l7.12,4.16c-0.05,0.21 -0.08,0.43 -0.08,0.65 0,1.61 1.31,2.92 2.92,2.92 1.61,0 2.92,-1.31 2.92,-2.92s-1.31,-2.92 -2.92,-2.92z" />
       </vector>

In "ic_menu_slideshow.xml" add the following:

       <vector xmlns:android="http://schemas.android.com/apk/res/android"
       android:width="24dp"
       android:height="24dp"
       android:viewportHeight="24.0"
       android:viewportWidth="24.0">
       <path
       android:fillColor="#FF000000"
       android:pathData="M4,6H2v14c0,1.1 0.9,2 2,2h14v-2H4V6zm16,-4H8c-1.1,0 -2,0.9 -2,2v12c0,1.1 0.9,2 2,2h12c1.1,0 2,-0.9 2,-2V4c0,-1.1 -0.9,-2 -2,-2zm-8,12.5v-9l6,4.5 -6,4.5z" />
       </vector>

The errors should be gone now, but if not...check over what you have written for spelling errors or thoroughly read why the errors were caused by tapping on the error icon in the toolbar.

Now lets continue on!

Inside values-v21 create a file called "styles.xml" and add the following:

       <resources>
       
        <style name="AppTheme.NoActionBar">
        <item name="windowActionBar">false</item>
        <item name="windowNoTitle">true</item>
        <item name="android:windowDrawsSystemBarBackgrounds">true</item>
        <item name="android:statusBarColor">@android:color/transparent</item>
        </style>
        
        </resources>


1.7 Inside the "res" folder create a folder called "menu" & create the following files:

1. "activity_main_drawer.xml"
2. "main.xml"

Inside the "activity_main_drawer.xml" add the following:

       <?xml version="1.0" encoding="utf-8"?>
       <menu xmlns:android="http://schemas.android.com/apk/res/android">
       
    <group android:checkableBehavior="single">
        <item
            android:id="@+id/nav_camera"
            android:icon="@drawable/ic_menu_camera"
            android:title="@string/nav_camera" />
        <item
            android:id="@+id/nav_gallery"
            android:icon="@drawable/ic_menu_gallery"
            android:title="@string/nav_gallery" />
        <item
            android:id="@+id/nav_slideshow"
            android:icon="@drawable/ic_menu_slideshow"
            android:title="@string/nav_slideshow" />
        <item
            android:id="@+id/nav_manage"
            android:icon="@drawable/ic_menu_manage"
            android:title="@string/nav_manage" />
    </group>
       
    <item android:title="Communicate">
        <menu>
            <item
                android:id="@+id/nav_share"
                android:icon="@drawable/ic_menu_share"
                android:title="@string/nav_share" />
            <item
                android:id="@+id/nav_send"
                android:icon="@drawable/ic_menu_send"
                android:title="@string/nav_send" />
        </menu>
    </item>
       
       </menu>

Inside "main.xml" add the following:

       <?xml version="1.0" encoding="utf-8"?>
       <menu xmlns:android="http://schemas.android.com/apk/res/android"
       xmlns:app="http://schemas.android.com/apk/res-auto">
       <item
       android:id="@+id/action_settings"
       android:orderInCategory="100"
       android:title="@string/action_settings"
       app:showAsAction="never" />
       </menu>

1.8 Inside "res" create a folder called "drawable" & create a file inside it called "side_nav_bar.xml" & add the following:

       <shape xmlns:android="http://schemas.android.com/apk/res/android"
       android:shape="rectangle">
       <gradient
       android:angle="135"
       android:centerColor="#4CAF50"
       android:endColor="#2E7D32"
       android:startColor="#81C784"
       android:type="linear" />
       </shape>

1.9 Go to "layout" folder & create the following files:

NOTE: delete the "main.xml" thats inside the layout folder:

1. 'activity_main.xml"
2. "app_bar_main.xml"
3. "fragment_camera.xml"
4. "fragment_gallery.xml"
5. "fragment_main.xml"
6. "fragment_manage.xml"
7. "fragment_send.xml"
8. "fragment_share.xml"
9. "fragment_slideshow.xml"
10. "nav_header_main.xml"

Inside "activity_main.xml" add the following:

       <?xml version="1.0" encoding="utf-8"?>
       <android.support.v4.widget.DrawerLayout xmlns:android="http://schemas.android.com/apk/res/android"
       xmlns:app="http://schemas.android.com/apk/res-auto"
       xmlns:tools="http://schemas.android.com/tools"
       android:id="@+id/drawer_layout"
       android:layout_width="match_parent"
       android:layout_height="match_parent"
       android:fitsSystemWindows="true"
       tools:openDrawer="start">
       
       <include
       layout="@layout/app_bar_main"
       android:layout_width="match_parent"
       android:layout_height="match_parent" />
       
       <android.support.design.widget.NavigationView
       android:id="@+id/nav_view"
       android:layout_width="wrap_content"
       android:layout_height="match_parent"
       android:layout_gravity="start"
       android:fitsSystemWindows="true"
       app:headerLayout="@layout/nav_header_main"
       app:menu="@menu/activity_main_drawer" />
       
       </android.support.v4.widget.DrawerLayout>

Inside "app_bar_main.xml" add the following:

       <?xml version="1.0" encoding="utf-8"?>
       <android.support.design.widget.CoordinatorLayout xmlns:android="http://schemas.android.com/apk/res/android"
       xmlns:app="http://schemas.android.com/apk/res-auto"
       xmlns:tools="http://schemas.android.com/tools"
       android:layout_width="match_parent"
       android:layout_height="match_parent"
       android:fitsSystemWindows="true"
       tools:context=".activities.MainActivity">
       
       <RelativeLayout
       android:layout_width="match_parent"
       android:layout_height="wrap_content">
       
        <android.support.design.widget.AppBarLayout
            android:id="@+id/actionBar"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:theme="@style/AppTheme.AppBarOverlay">
       
            <android.support.v7.widget.Toolbar
                android:id="@+id/toolbar"
                android:layout_width="match_parent"
                android:layout_height="?attr/actionBarSize"
                android:background="?attr/colorPrimary"
                app:popupTheme="@style/AppTheme.PopupOverlay" />
       
        </android.support.design.widget.AppBarLayout>
       
        <FrameLayout
            android:id="@+id/content"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:layout_below="@id/actionBar" />
       
       </RelativeLayout>
       
       
       </android.support.design.widget.CoordinatorLayout>

Inside "fragment_camera.xml" add the following:

       <?xml version="1.0" encoding="utf-8"?>
       <RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
       xmlns:app="http://schemas.android.com/apk/res-auto"
       xmlns:tools="http://schemas.android.com/tools"
       android:layout_width="match_parent"
       android:layout_height="match_parent"
       android:paddingBottom="@dimen/activity_vertical_margin"
       android:paddingLeft="@dimen/activity_horizontal_margin"
       android:paddingRight="@dimen/activity_horizontal_margin"
       android:paddingTop="@dimen/activity_vertical_margin"
       app:layout_behavior="@string/appbar_scrolling_view_behavior"
       tools:context=".fragments.CameraFragment">
       
       <TextView
       android:layout_width="wrap_content"
       android:layout_height="wrap_content"
       android:text="@string/camera" />
       
       <android.support.design.widget.FloatingActionButton
       android:id="@+id/fab"
       android:layout_width="wrap_content"
       android:layout_height="wrap_content"
       android:layout_alignParentBottom="true"
       android:layout_alignParentRight="true"
       android:layout_margin="@dimen/fab_margin"
       android:src="@android:drawable/ic_input_add" />
       </RelativeLayout>

Inside "fragment_gallery.xml" add the following:

       <?xml version="1.0" encoding="utf-8"?>
       <RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
       xmlns:app="http://schemas.android.com/apk/res-auto"
       xmlns:tools="http://schemas.android.com/tools"
       android:layout_width="match_parent"
       android:layout_height="match_parent"
       android:paddingBottom="@dimen/activity_vertical_margin"
       android:paddingLeft="@dimen/activity_horizontal_margin"
       android:paddingRight="@dimen/activity_horizontal_margin"
       android:paddingTop="@dimen/activity_vertical_margin"
       app:layout_behavior="@string/appbar_scrolling_view_behavior"
       tools:context=".fragments.GalleryFragment">
       
       <TextView
       android:layout_width="wrap_content"
       android:layout_height="wrap_content"
       android:text="@string/gallery" />

       <android.support.design.widget.FloatingActionButton
       android:id="@+id/fab"
       android:layout_width="wrap_content"
       android:layout_height="wrap_content"
       android:layout_alignParentBottom="true"
       android:layout_alignParentRight="true"
       android:layout_margin="@dimen/fab_margin"
       android:src="@android:drawable/ic_input_add" />
       </RelativeLayout>

Inside "fragment_main.xml" add the following:

       <?xml version="1.0" encoding="utf-8"?>
       <RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
       xmlns:app="http://schemas.android.com/apk/res-auto"
       xmlns:tools="http://schemas.android.com/tools"
       android:layout_width="match_parent"
       android:layout_height="match_parent"
       android:paddingBottom="@dimen/activity_vertical_margin"
       android:paddingLeft="@dimen/activity_horizontal_margin"
       android:paddingRight="@dimen/activity_horizontal_margin"
       android:paddingTop="@dimen/activity_vertical_margin"
       app:layout_behavior="@string/appbar_scrolling_view_behavior"
       tools:context=".fragments.MainFragment">
       
       <TextView
       android:id="@+id/main"
       android:layout_width="wrap_content"
       android:layout_height="wrap_content"
       android:text="@string/main" />
       
       <TextView
       android:layout_below="@id/main"
       android:layout_width="wrap_content"
       android:layout_height="wrap_content"
       android:text="@string/main2" />
       
       <android.support.design.widget.FloatingActionButton
       android:id="@+id/fab"
       android:layout_width="wrap_content"
       android:layout_height="wrap_content"
       android:layout_alignParentBottom="true"
       android:layout_alignParentRight="true"
       android:layout_margin="@dimen/fab_margin"
       android:src="@android:drawable/ic_input_add" />
       </RelativeLayout>

Inside "fragment_manage.xml" add the following:

       <?xml version="1.0" encoding="utf-8"?>
       <RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
       xmlns:app="http://schemas.android.com/apk/res-auto"
       xmlns:tools="http://schemas.android.com/tools"
       android:layout_width="match_parent"
       android:layout_height="match_parent"
       android:paddingBottom="@dimen/activity_vertical_margin"
       android:paddingLeft="@dimen/activity_horizontal_margin"
       android:paddingRight="@dimen/activity_horizontal_margin"
       android:paddingTop="@dimen/activity_vertical_margin"
       app:layout_behavior="@string/appbar_scrolling_view_behavior"
       tools:context=".fragments.ManageFragment">
        
       <TextView
       android:layout_width="wrap_content"
       android:layout_height="wrap_content"
       android:text="@string/manage" />
        
       <android.support.design.widget.FloatingActionButton
       android:id="@+id/fab"
       android:layout_width="wrap_content"
       android:layout_height="wrap_content"
       android:layout_alignParentBottom="true"
       android:layout_alignParentRight="true"
       android:layout_margin="@dimen/fab_margin"
       android:src="@android:drawable/ic_input_add" />
       </RelativeLayout>

Inside "fragment_send.xml" add the following:

       <?xml version="1.0" encoding="utf-8"?>
       <RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
       xmlns:app="http://schemas.android.com/apk/res-auto"
       xmlns:tools="http://schemas.android.com/tools"
       android:layout_width="match_parent"
       android:layout_height="match_parent"
       android:paddingBottom="@dimen/activity_vertical_margin"
       android:paddingLeft="@dimen/activity_horizontal_margin"
       android:paddingRight="@dimen/activity_horizontal_margin"
       android:paddingTop="@dimen/activity_vertical_margin"
       app:layout_behavior="@string/appbar_scrolling_view_behavior"
       tools:context=".fragments.SendFragment">
        
       <TextView
       android:layout_width="wrap_content"
       android:layout_height="wrap_content"
       android:text="@string/send" />
        
       <android.support.design.widget.FloatingActionButton
       android:id="@+id/fab"
       android:layout_width="wrap_content"
       android:layout_height="wrap_content"
       android:layout_alignParentBottom="true"
       android:layout_alignParentRight="true"
       android:layout_margin="@dimen/fab_margin"
       android:src="@android:drawable/ic_input_add" />
       </RelativeLayout>


Inside "fragment_share.xml" add the following:

       <?xml version="1.0" encoding="utf-8"?>
       <RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
       xmlns:app="http://schemas.android.com/apk/res-auto"
       xmlns:tools="http://schemas.android.com/tools"
       android:layout_width="match_parent"
       android:layout_height="match_parent"
       android:paddingBottom="@dimen/activity_vertical_margin"
       android:paddingLeft="@dimen/activity_horizontal_margin"
       android:paddingRight="@dimen/activity_horizontal_margin"
       android:paddingTop="@dimen/activity_vertical_margin"
       app:layout_behavior="@string/appbar_scrolling_view_behavior"
       tools:context=".fragments.ShareFragment">
        
       <TextView
       android:layout_width="wrap_content"
       android:layout_height="wrap_content"
       android:text="@string/share" />
        
       <android.support.design.widget.FloatingActionButton
       android:id="@+id/fab"
       android:layout_width="wrap_content"
       android:layout_height="wrap_content"
       android:layout_alignParentBottom="true"
       android:layout_alignParentRight="true"
       android:layout_margin="@dimen/fab_margin"
       android:src="@android:drawable/ic_input_add" />
       </RelativeLayout>


Inside "fragment_slideshow.xml" add the following:

       <?xml version="1.0" encoding="utf-8"?>
       <RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
       xmlns:app="http://schemas.android.com/apk/res-auto"
       xmlns:tools="http://schemas.android.com/tools"
       android:layout_width="match_parent"
       android:layout_height="match_parent"
       android:paddingBottom="@dimen/activity_vertical_margin"
       android:paddingLeft="@dimen/activity_horizontal_margin"
       android:paddingRight="@dimen/activity_horizontal_margin"
       android:paddingTop="@dimen/activity_vertical_margin"
       app:layout_behavior="@string/appbar_scrolling_view_behavior"
       tools:context=".fragments.SlideShowFragment">
        
       <TextView
       android:layout_width="wrap_content"
       android:layout_height="wrap_content"
       android:text="@string/slideshow" />
        
       <android.support.design.widget.FloatingActionButton
       android:id="@+id/fab"
       android:layout_width="wrap_content"
       android:layout_height="wrap_content"
       android:layout_alignParentBottom="true"
       android:layout_alignParentRight="true"
       android:layout_margin="@dimen/fab_margin"
       android:src="@android:drawable/ic_input_add" />
       </RelativeLayout>


Inside "nav_header_main.xml" add the following:

       <?xml version="1.0" encoding="utf-8"?>
       <LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
       android:layout_width="match_parent"
       android:layout_height="@dimen/nav_header_height"
       android:background="@drawable/side_nav_bar"
       android:gravity="bottom"
       android:orientation="vertical"
       android:paddingBottom="@dimen/activity_vertical_margin"
       android:paddingLeft="@dimen/activity_horizontal_margin"
       android:paddingRight="@dimen/activity_horizontal_margin"
       android:paddingTop="@dimen/activity_vertical_margin"
       android:theme="@style/ThemeOverlay.AppCompat.Dark">
       
       <ImageView
       android:id="@+id/imageView"
       android:layout_width="wrap_content"
       android:layout_height="wrap_content"
       android:paddingTop="@dimen/nav_header_vertical_spacing"
       android:src="@android:drawable/sym_def_app_icon" />
       
       <TextView
       android:layout_width="match_parent"
       android:layout_height="wrap_content"
       android:paddingTop="@dimen/nav_header_vertical_spacing"
       android:text="xstar97 NDE"
       android:textAppearance="@style/TextAppearance.AppCompat.Body1" />
       
       <TextView
       android:id="@+id/textView"
       android:layout_width="wrap_content"
       android:layout_height="wrap_content"
       android:text="xstar97@mail.com" />
       
       </LinearLayout>

Step 3: Activities & fragments

Go to where your "MainActivity" is located & delete it & create the following folders:

1. "activities"
2. "fragments"

Open the newly created "fragments" folder & create the following files:

1. "OnFragmentInteractionListener.java"
2. "MainFragment.java"
3. "CameraFragment.java"
4. "GalleryFragment.java"
5. "SlideShowFragment.java"
6. "ShareFragment.java"
7. "SendFragment.java"
 
Now open "OnFragmentInteractionListener.java" & add the following:

       import android.net.Uri;
       
       public interface OnFragmentInteractionListener {
       void onFragmentInteraction(Uri uri);
       
       }
This IS NEEDED for the activity to switch from fragment to fragment!

Inside "MainFragment.java" & add the following:

       public class MainFragment extends Fragment {
       // TODO: Rename parameter arguments, choose names that match
       // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
       private static final String main1 = "main";
       private static final String camera2 = "camera";
       private static final String gallery3 = "gallery";
       private static final String slideshow4 = "camera";
       private static final String manage5 = "manage";
       private static final String share6 = "share";
       private static final String send7 = "send";
       
       
       // TODO: Rename and change types of parameters
       private String mMain;
       private String mCamera;
       private String mGallery;
       private String mSlideShow;
       private String mManage;
       private String mShare;
       private String mSend;
       
       
       
       private OnFragmentInteractionListener mListener;
       
       /**
       * Use this factory method to create a new instance of
       * this fragment using the provided parameters.
       *
       * @param main Parameter 1.
       * @param camera Parameter 2.
       * @param gallery Parameter 3.
       * @param slideshow Parameter 4.
       * @param share Parameter 5.
       * @param send Parameter 6.
       *
       * @return A new instance of fragment MainFragment.
       */
       // TODO: Rename and change types and number of parameters
       public static MainFragment newInstance(String main, String camera, String gallery, String slideshow, String manage,     String share, String send) {
        MainFragment fragment = new MainFragment();
        Bundle args = new Bundle();
        args.putString(main1, main);
        args.putString(camera2, camera);
        args.putString(gallery3, gallery);
        args.putString(slideshow4, slideshow);
        args.putString(manage5, manage);
        args.putString(share6, share);
        args.putString(send7, send);
        fragment.setArguments(args);
        return fragment;
       }
       
       public MainFragment() {
       // Required empty public constructor
       }
       
        @Override
        public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mMain = getArguments().getString(main1);
            mCamera = getArguments().getString(camera2);
            mGallery = getArguments().getString(gallery3);
            mSlideShow = getArguments().getString(slideshow4);
            mManage = getArguments().getString(manage5);
            mShare = getArguments().getString(share6);
            mSend = getArguments().getString(send7);
        }
       }
       
       @Override
       public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
       }
       
        // TODO: Rename method, update argument and hook method into UI event
        public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
       }
       
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
       
        FloatingActionButton fab = (FloatingActionButton) view.findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
       }
       
        @Override
        public void onAttach(Context context) {
        super.onAttach(context);
        try {
            mListener = (OnFragmentInteractionListener) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
       }
       
        @Override
        public void onDetach() {
        super.onDetach();
        mListener = null;
        }
       }

Inside "CameraFragment.java" & add the following:

       public class CameraFragment extends Fragment {
       // TODO: Rename parameter arguments, choose names that match
       // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
       private static final String main1 = "main";
       private static final String camera2 = "camera";
       private static final String gallery3 = "gallery";
       private static final String slideshow4 = "camera";
       private static final String manage5 = "manage";
       private static final String share6 = "share";
       private static final String send7 = "send";
       
       
       // TODO: Rename and change types of parameters
       private String mMain;
       private String mCamera;
       private String mGallery;
       private String mSlideShow;
       private String mManage;
       private String mShare;
       private String mSend;
       
       
       
       private OnFragmentInteractionListener mListener;
       
       /**
       * Use this factory method to create a new instance of
       * this fragment using the provided parameters.
       *
       * @param main Parameter 1.
       * @param camera Parameter 2.
       * @param gallery Parameter 3.
       * @param slideshow Parameter 4.
       * @param share Parameter 5.
       * @param send Parameter 6.
       *
       * @return A new instance of fragment CameraFragment.
       */
       // TODO: Rename and change types and number of parameters
       public static CameraFragment newInstance(String main, String camera, String gallery, String slideshow, String manage,     String share, String send) {
        CameraFragment fragment = new CameraFragment();
        Bundle args = new Bundle();
        args.putString(main1, main);
        args.putString(camera2, camera);
        args.putString(gallery3, gallery);
        args.putString(slideshow4, slideshow);
        args.putString(manage5, manage);
        args.putString(share6, share);
        args.putString(send7, send);
        fragment.setArguments(args);
        return fragment;
       }
       
       public CameraFragment() {
       // Required empty public constructor
       }
       
        @Override
        public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mMain = getArguments().getString(main1);
            mCamera = getArguments().getString(camera2);
            mGallery = getArguments().getString(gallery3);
            mSlideShow = getArguments().getString(slideshow4);
            mManage = getArguments().getString(manage5);
            mShare = getArguments().getString(share6);
            mSend = getArguments().getString(send7);
        }
       }
       
       @Override
       public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_camera, container, false);
       }
       
        // TODO: Rename method, update argument and hook method into UI event
        public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
       }
       
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
       
        FloatingActionButton fab = (FloatingActionButton) view.findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
       }
       
        @Override
        public void onAttach(Context context) {
        super.onAttach(context);
        try {
            mListener = (OnFragmentInteractionListener) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
       }
       
        @Override
        public void onDetach() {
        super.onDetach();
        mListener = null;
        }
       }

Inside "GalleryFragment.java" & add the following:

       public class GalleryFragment extends Fragment {
       // TODO: Rename parameter arguments, choose names that match
       // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
       private static final String main1 = "main";
       private static final String camera2 = "camera";
       private static final String gallery3 = "gallery";
       private static final String slideshow4 = "camera";
       private static final String manage5 = "manage";
       private static final String share6 = "share";
       private static final String send7 = "send";
       
       
       // TODO: Rename and change types of parameters
       private String mMain;
       private String mCamera;
       private String mGallery;
       private String mSlideShow;
       private String mManage;
       private String mShare;
       private String mSend;
       
       
       
       private OnFragmentInteractionListener mListener;
       
       /**
       * Use this factory method to create a new instance of
       * this fragment using the provided parameters.
       *
       * @param main Parameter 1.
       * @param camera Parameter 2.
       * @param gallery Parameter 3.
       * @param slideshow Parameter 4.
       * @param share Parameter 5.
       * @param send Parameter 6.
       *
       * @return A new instance of fragment GalleryFragment.
       */
       // TODO: Rename and change types and number of parameters
       public static GalleryFragment newInstance(String main, String camera, String gallery, String slideshow, String manage,     String share, String send) {
        GalleryFragment fragment = new GalleryFragment();
        Bundle args = new Bundle();
        args.putString(main1, main);
        args.putString(camera2, camera);
        args.putString(gallery3, gallery);
        args.putString(slideshow4, slideshow);
        args.putString(manage5, manage);
        args.putString(share6, share);
        args.putString(send7, send);
        fragment.setArguments(args);
        return fragment;
       }
       
       public GalleryFragment() {
       // Required empty public constructor
       }
       
        @Override
        public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mMain = getArguments().getString(main1);
            mCamera = getArguments().getString(camera2);
            mGallery = getArguments().getString(gallery3);
            mSlideShow = getArguments().getString(slideshow4);
            mManage = getArguments().getString(manage5);
            mShare = getArguments().getString(share6);
            mSend = getArguments().getString(send7);
        }
       }
       
       @Override
       public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_gallery, container, false);
       }
       
        // TODO: Rename method, update argument and hook method into UI event
        public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
       }
       
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
       
        FloatingActionButton fab = (FloatingActionButton) view.findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
       }
       
        @Override
        public void onAttach(Context context) {
        super.onAttach(context);
        try {
            mListener = (OnFragmentInteractionListener) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
       }
       
        @Override
        public void onDetach() {
        super.onDetach();
        mListener = null;
        }
       }

Inside "SlideShowFragment.java" & add the following:

       public class SlideShowFragment extends Fragment {
       // TODO: Rename parameter arguments, choose names that match
       // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
       private static final String main1 = "main";
       private static final String camera2 = "camera";
       private static final String gallery3 = "gallery";
       private static final String slideshow4 = "camera";
       private static final String manage5 = "manage";
       private static final String share6 = "share";
       private static final String send7 = "send";
       
       
       // TODO: Rename and change types of parameters
       private String mMain;
       private String mCamera;
       private String mGallery;
       private String mSlideShow;
       private String mManage;
       private String mShare;
       private String mSend;
       
       
       
       private OnFragmentInteractionListener mListener;
       
       /**
       * Use this factory method to create a new instance of
       * this fragment using the provided parameters.
       *
       * @param main Parameter 1.
       * @param camera Parameter 2.
       * @param gallery Parameter 3.
       * @param slideshow Parameter 4.
       * @param share Parameter 5.
       * @param send Parameter 6.
       *
       * @return A new instance of fragment SlideShowFragment.
       */
       // TODO: Rename and change types and number of parameters
       public static SlideShowFragment newInstance(String main, String camera, String gallery, String slideshow, String manage,     String share, String send) {
        SlideShowFragment fragment = new SlideShowFragment();
        Bundle args = new Bundle();
        args.putString(main1, main);
        args.putString(camera2, camera);
        args.putString(gallery3, gallery);
        args.putString(slideshow4, slideshow);
        args.putString(manage5, manage);
        args.putString(share6, share);
        args.putString(send7, send);
        fragment.setArguments(args);
        return fragment;
       }
       
       public SlideShowFragment() {
       // Required empty public constructor
       }
       
        @Override
        public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mMain = getArguments().getString(main1);
            mCamera = getArguments().getString(camera2);
            mGallery = getArguments().getString(gallery3);
            mSlideShow = getArguments().getString(slideshow4);
            mManage = getArguments().getString(manage5);
            mShare = getArguments().getString(share6);
            mSend = getArguments().getString(send7);
        }
       }
       
       @Override
       public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_slideshow, container, false);
       }
       
        // TODO: Rename method, update argument and hook method into UI event
        public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
       }
       
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
       
        FloatingActionButton fab = (FloatingActionButton) view.findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
       }
       
        @Override
        public void onAttach(Context context) {
        super.onAttach(context);
        try {
            mListener = (OnFragmentInteractionListener) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
       }
       
        @Override
        public void onDetach() {
        super.onDetach();
        mListener = null;
        }
       }

Inside "ManageFragment.java" & add the following:

       public class ManageFragment extends Fragment {
       // TODO: Rename parameter arguments, choose names that match
       // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
       private static final String main1 = "main";
       private static final String camera2 = "camera";
       private static final String gallery3 = "gallery";
       private static final String slideshow4 = "camera";
       private static final String manage5 = "manage";
       private static final String share6 = "share";
       private static final String send7 = "send";
       
       
       // TODO: Rename and change types of parameters
       private String mMain;
       private String mCamera;
       private String mGallery;
       private String mSlideShow;
       private String mManage;
       private String mShare;
       private String mSend;
       
       
       
       private OnFragmentInteractionListener mListener;
       
       /**
       * Use this factory method to create a new instance of
       * this fragment using the provided parameters.
       *
       * @param main Parameter 1.
       * @param camera Parameter 2.
       * @param gallery Parameter 3.
       * @param slideshow Parameter 4.
       * @param share Parameter 5.
       * @param send Parameter 6.
       *
       * @return A new instance of fragment ManageFragment.
       */
       // TODO: Rename and change types and number of parameters
       public static ManageFragment newInstance(String main, String camera, String gallery, String slideshow, String manage,     String share, String send) {
        ManageFragment fragment = new ManageFragment();
        Bundle args = new Bundle();
        args.putString(main1, main);
        args.putString(camera2, camera);
        args.putString(gallery3, gallery);
        args.putString(slideshow4, slideshow);
        args.putString(manage5, manage);
        args.putString(share6, share);
        args.putString(send7, send);
        fragment.setArguments(args);
        return fragment;
       }
       
       public ManageFragment() {
       // Required empty public constructor
       }
       
        @Override
        public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mMain = getArguments().getString(main1);
            mCamera = getArguments().getString(camera2);
            mGallery = getArguments().getString(gallery3);
            mSlideShow = getArguments().getString(slideshow4);
            mManage = getArguments().getString(manage5);
            mShare = getArguments().getString(share6);
            mSend = getArguments().getString(send7);
        }
       }
       
       @Override
       public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_manage, container, false);
       }
       
        // TODO: Rename method, update argument and hook method into UI event
        public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
       }
       
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
       
        FloatingActionButton fab = (FloatingActionButton) view.findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
       }
       
        @Override
        public void onAttach(Context context) {
        super.onAttach(context);
        try {
            mListener = (OnFragmentInteractionListener) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
       }
       
        @Override
        public void onDetach() {
        super.onDetach();
        mListener = null;
        }
       }

Inside "ShareFragment.java" & add the following:

       public class ShareFragment extends Fragment {
       // TODO: Rename parameter arguments, choose names that match
       // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
       private static final String main1 = "main";
       private static final String camera2 = "camera";
       private static final String gallery3 = "gallery";
       private static final String slideshow4 = "camera";
       private static final String manage5 = "manage";
       private static final String share6 = "share";
       private static final String send7 = "send";
       
       
       // TODO: Rename and change types of parameters
       private String mMain;
       private String mCamera;
       private String mGallery;
       private String mSlideShow;
       private String mManage;
       private String mShare;
       private String mSend;
       
       
       
       private OnFragmentInteractionListener mListener;
       
       /**
       * Use this factory method to create a new instance of
       * this fragment using the provided parameters.
       *
       * @param main Parameter 1.
       * @param camera Parameter 2.
       * @param gallery Parameter 3.
       * @param slideshow Parameter 4.
       * @param share Parameter 5.
       * @param send Parameter 6.
       *
       * @return A new instance of fragment ShareFragment.
       */
       // TODO: Rename and change types and number of parameters
       public static ShareFragment newInstance(String main, String camera, String gallery, String slideshow, String manage,     String share, String send) {
        ShareFragment fragment = new ShareFragment();
        Bundle args = new Bundle();
        args.putString(main1, main);
        args.putString(camera2, camera);
        args.putString(gallery3, gallery);
        args.putString(slideshow4, slideshow);
        args.putString(manage5, manage);
        args.putString(share6, share);
        args.putString(send7, send);
        fragment.setArguments(args);
        return fragment;
       }
       
       public ShareFragment() {
       // Required empty public constructor
       }
       
        @Override
        public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mMain = getArguments().getString(main1);
            mCamera = getArguments().getString(camera2);
            mGallery = getArguments().getString(gallery3);
            mSlideShow = getArguments().getString(slideshow4);
            mManage = getArguments().getString(manage5);
            mShare = getArguments().getString(share6);
            mSend = getArguments().getString(send7);
        }
       }
       
       @Override
       public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_share, container, false);
       }
       
        // TODO: Rename method, update argument and hook method into UI event
        public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
       }
       
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
       
        FloatingActionButton fab = (FloatingActionButton) view.findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
       }
       
        @Override
        public void onAttach(Context context) {
        super.onAttach(context);
        try {
            mListener = (OnFragmentInteractionListener) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
       }
       
        @Override
        public void onDetach() {
        super.onDetach();
        mListener = null;
        }
       }

Inside "SendFragment.java" & add the following:

       public class SendFragment extends Fragment {
       // TODO: Rename parameter arguments, choose names that match
       // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
       private static final String main1 = "main";
       private static final String camera2 = "camera";
       private static final String gallery3 = "gallery";
       private static final String slideshow4 = "camera";
       private static final String manage5 = "manage";
       private static final String share6 = "share";
       private static final String send7 = "send";
       
       
       // TODO: Rename and change types of parameters
       private String mMain;
       private String mCamera;
       private String mGallery;
       private String mSlideShow;
       private String mManage;
       private String mShare;
       private String mSend;
       
       
       
       private OnFragmentInteractionListener mListener;
       
       /**
       * Use this factory method to create a new instance of
       * this fragment using the provided parameters.
       *
       * @param main Parameter 1.
       * @param camera Parameter 2.
       * @param gallery Parameter 3.
       * @param slideshow Parameter 4.
       * @param share Parameter 5.
       * @param send Parameter 6.
       *
       * @return A new instance of fragment SendFragment.
       */
       // TODO: Rename and change types and number of parameters
       public static SendFragment newInstance(String main, String camera, String gallery, String slideshow, String manage,     String share, String send) {
        SendFragment fragment = new SendFragment();
        Bundle args = new Bundle();
        args.putString(main1, main);
        args.putString(camera2, camera);
        args.putString(gallery3, gallery);
        args.putString(slideshow4, slideshow);
        args.putString(manage5, manage);
        args.putString(share6, share);
        args.putString(send7, send);
        fragment.setArguments(args);
        return fragment;
       }
       
       public SendFragment() {
       // Required empty public constructor
       }
       
        @Override
        public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mMain = getArguments().getString(main1);
            mCamera = getArguments().getString(camera2);
            mGallery = getArguments().getString(gallery3);
            mSlideShow = getArguments().getString(slideshow4);
            mManage = getArguments().getString(manage5);
            mShare = getArguments().getString(share6);
            mSend = getArguments().getString(send7);
        }
       }
       
       @Override
       public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_send, container, false);
       }
       
        // TODO: Rename method, update argument and hook method into UI event
        public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
       }
       
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
       
        FloatingActionButton fab = (FloatingActionButton) view.findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
       }
       
        @Override
        public void onAttach(Context context) {
        super.onAttach(context);
        try {
            mListener = (OnFragmentInteractionListener) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
       }
       
        @Override
        public void onDetach() {
        super.onDetach();
        mListener = null;
        }
       }


Now, the last thing we need to do is to create our activity!

So go to the folder called "activities" & create a new file:

1. "MainActivity.java"

Inside "MainActivity.java" & add the following:

        public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, OnFragmentInteractionListener {
       
        @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
       
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();
       
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
       
        // Set the home as default
        Fragment fragment = new MainFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.content, fragment)
                .commit();
       }
       
        @Override
        public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
       }
       
        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
       }
       
        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
       
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
       
        return super.onOptionsItemSelected(item);
       }
       
        @SuppressWarnings("StatementWithEmptyBody")
        @Override
        public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
       
        // Create a new fragment and specify the planet to show based on position
        Fragment fragment;
       
        if (id == R.id.nav_camera) {
            // Handle the settings action
            fragment = new CameraFragment();
        } else {
            // Anything else is home
       
            if (id == R.id.nav_gallery) {
                // Handle the settings action
                fragment = new GalleryFragment();
            } else {
                // Anything else is home
                if (id == R.id.nav_slideshow) {
                    // Handle the settings action
                    fragment = new SlideShowFragment();
                } else {
                    // Anything else is home
                    if (id == R.id.nav_manage) {
                        // Handle the settings action
                        fragment = new ManageFragment();
                    } else {
                        // Anything else is home
                        if (id == R.id.nav_share) {
                            // Handle the settings action
                            fragment = new ShareFragment();
                        } else {
                            // Anything else is home
                            if (id == R.id.nav_send) {
                                // Handle the settings action
                                fragment = new SendFragment();
                            } else {
                                fragment = new ManageFragment();
                            }
                        }
                    }
                }
            }
        }
       
        // Insert the fragment by replacing any existing fragment
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.content, fragment)
                .commit();
       
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
       }
       
       @Override
       public void onFragmentInteraction(Uri uri) {
       
        }
       }

Great job! Now compile & run your new app...You came a long way & finally made a material navigation drawer android app!

NOTES:

1. You do NOT need to use vectors at all for the nav drawer icons...You can use regular 24-48dp png instead, but just make sure to delete the drawables.xml & the menu xmls from drawable v21 folders too & place your icons inside the drawables folders.
