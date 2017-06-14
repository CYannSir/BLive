# BLive——Android UI Design

Report Name: AXSURE RP & ANDROID STUDIO实战演练——BLIVE
Name: 吴成洋(CYann)
No : 31401417
Group：G02
Date: 2017-6-14
Github Address: https://github.com/CYannSir/BLive.git


##分工页面的功能和内容
本次Bilive项目的界面原型的分工页面功能为：
1. “我的大会员”界面：该界面的主要功能为```Bilive```的```个人VIP会员界面```，即B Life的“我的大会员”。主要的内容为关于大会员的积分兑换会员界面，大会员福利介绍内容（其中包括钛合金画质的介绍、评论有表情的介绍、空间自主头图介绍），年度大会员专享福利介绍界面（其中包括每月返B币的介绍、尊贵粉色昵称的介绍、游戏福利礼包的介绍、周边折扣物语的介绍），友情提示相关内容介绍等等。
2. “离线缓存”界面：该界面的主要功能为```Bilive的个人离线缓存界面```，包括已缓存界面和缓存中界面。在已缓存界面中会有对缓存视频的显示和介绍；在缓存中界面中有对正在缓存中的视频的。
3. “会员积分”界面：该界面的主要功能为```Bilive的个人会员积分界面```，即主要功能为显示会员积分，让用户快速获取自己的会员积分；还包括大会员的兑换，其中包括大会员的兑换、年度大会员的兑换等信息介绍；如何获得会员积分介绍的显示界面

##Material Design规范
### “我的大会员”界面
![](D:\CYann_WorkSpace\AS_WorkSpace\BLive_CYann\doc\rec\1.png =300x500)
   上图为最终```Axsure RP```制作的显示效果
![](D:\CYann_WorkSpace\AS_WorkSpace\BLive_CYann\doc\rec\2.png)
   上图为最终```Android Studio```制作的显示效果
![](D:\CYann_WorkSpace\AS_WorkSpace\BLive_CYann\doc\rec\3.png)
   上图为使用```Asure RP```制作该功能的实际单页页面。其中本设计界面每个点的间距为```8px```（换算相当于```8dp```）,通过使用```Axsure RP```自带的参考线的帮助，参考```Meternal Design规范```，快速锁定尺寸，从而确定每一块的位置和大小，如上图所示。（图中隐藏部分为```ToolBar```预留部分）。
   上述的字体均为```思源黑-Regular字体```，“大会员福利”为```14```，“钛合金画质”为```20```，“钛合金画质下方内容”为```14```，符合```Material Design规范```的字体设计和实现
![](D:\CYann_WorkSpace\AS_WorkSpace\BLive_CYann\doc\rec\4.png)
   上图为```Meterial Design官方文档```的例子，其中
```markdown
1. 24dp 
2. 56dp 
3. 48dp 
4. 72dp
```
![](D:\CYann_WorkSpace\AS_WorkSpace\BLive_CYann\doc\rec\5.png)
   上图为```Meterial Design官方文档```的例子，其中
```markdown
1. 24dp
2. 56dp 
3. 72dp 
4. 48dp 
5. 8dp
```
###“离线缓存”界面
![](D:\CYann_WorkSpace\AS_WorkSpace\BLive_CYann\doc\rec\6.png)
![](D:\CYann_WorkSpace\AS_WorkSpace\BLive_CYann\doc\rec\7.png)
   上图为最终```Axsure RP```制作的显示效果
![](D:\CYann_WorkSpace\AS_WorkSpace\BLive_CYann\doc\rec\10.png)
![](D:\CYann_WorkSpace\AS_WorkSpace\BLive_CYann\doc\rec\11.png)
   上图为最终```Android Studio```制作的显示效果
![](D:\CYann_WorkSpace\AS_WorkSpace\BLive_CYann\doc\rec\8.png)
![](D:\CYann_WorkSpace\AS_WorkSpace\BLive_CYann\doc\rec\9.png)
   上图为使用```Asure RP```制作该功能的实际单页页面。该功能一个有3种状态：
   1.缓存中和已缓存都没有找到缓存
   2.缓存中有缓存视频存在
   3.已缓存中找到缓存
   为了能够在两张页面中显示出```3种状态```，我将两种状态归并成一张页面，即上左图。从左图可观察到，对于缓存的卡片设计要点遵循```Meterial Design的规范```
![](D:\CYann_WorkSpace\AS_WorkSpace\BLive_CYann\doc\rec\12.png)
![](D:\CYann_WorkSpace\AS_WorkSpace\BLive_CYann\doc\rec\13.png)
   上图为```Meterial Design官方文档```的例子，```卡片布局准则```：```字体设计```
   正文：```14 sp``` 或 ```16 sp```
   标题：```24 sp 或更大```
   扁平按钮：```Roboto Medium, 14 sp, 10 sp 字间距```
   移动设备上的卡片间距
   屏幕边界与卡片间留白：```8 dp```
   卡片间留白：```8 dp```
   内容留白：```16 dp```

### “会员积分”界面
![](D:\CYann_WorkSpace\AS_WorkSpace\BLive_CYann\doc\rec\14.png)
   上图为最终```Axsure RP```制作的显示效果
![](D:\CYann_WorkSpace\AS_WorkSpace\BLive_CYann\doc\rec\15.png)
   上图为最终```Android Studio```制作的显示效果
![](D:\CYann_WorkSpace\AS_WorkSpace\BLive_CYann\doc\rec\16.png)
   上图为使用```Asure RP```制作该功能的实际单页页面。其中本设计界面每个点的间距为8px（换算相当于8dp）,通过使用Axsure RP自带的参考线的帮助，参考```Meternal Design的规范```，快速锁定尺寸，从而确定每一块的位置和大小，如上图所示
![](D:\CYann_WorkSpace\AS_WorkSpace\BLive_CYann\doc\rec\17.png)
   上图为```Meterial Design官方文档```的例子，其中
```MARKDOWN
1. 24dp 
2. 56dp 
3. 48dp 
4. 72dp
```
![](D:\CYann_WorkSpace\AS_WorkSpace\BLive_CYann\doc\rec\18.png)
上图为```Meterial Design官方文档```的例子，其中
```MARKDOWN
1. 24dp 
2. 56dp 
3. 72dp 
4. 48dp
5. 8DP
```
##Axure RP 8 理想中实现APP UI
   ```Android Studio```中通过```LinearLayout```布局实现外框架的搭建，如下图所示，俩功能都具有线型关系明显且搭建起来容易，其中嵌入```List View```组件，进行内容的填充，可以达到一个可观的效果
![](D:\CYann_WorkSpace\AS_WorkSpace\BLive_CYann\doc\rec\19.png)
![](D:\CYann_WorkSpace\AS_WorkSpace\BLive_CYann\doc\rec\20.png)
   在细节处，可以使用```RelativeLayout```布局，如下图所示，使用相对布局在界面的排版上更加容易实现```Meternal Design```的规范
![](D:\CYann_WorkSpace\AS_WorkSpace\BLive_CYann\doc\rec\21.png)
![](D:\CYann_WorkSpace\AS_WorkSpace\BLive_CYann\doc\rec\22.png)
![](D:\CYann_WorkSpace\AS_WorkSpace\BLive_CYann\doc\rec\23.png)

##Android Studio实现APP UI
###我的大会员
   本界面使用```CoordinatorLayout```、```CollapsingToolbarLayout```、```NestedScrollView```等来优化整个界面；布局主要包括两个部分，一个是图片Toolbar的布局设计和一些大会员信息的内容界面
   图片Toolbar的布局设计，如下所示：
```XML
<android.support.design.widget.AppBarLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:fitsSystemWindows="true">

        <android.support.design.widget.CollapsingToolbarLayout
            android:id="@+id/collapsing_toolbar"
            android:layout_width="match_parent"
            android:layout_height="@dimen/vip_head_layout_height"
            android:fitsSystemWindows="true"
            android:theme="@style/ThemeOverlay.AppCompat.Dark.ActionBar"
            app:collapsedTitleTextAppearance="@style/ToolBar.TitleText"
            app:contentScrim="?attr/colorPrimary"
            app:expandedTitleTextAppearance="@style/CollapsingToolbarTitleStyle.About"
            app:layout_scrollFlags="scroll|exitUntilCollapsed|snap">


            <FrameLayout
                android:layout_width="match_parent"
                android:layout_height="@dimen/vip_head_layout_height"
                android:fitsSystemWindows="true">


                <RelativeLayout
                    android:layout_width="match_parent"
                    android:layout_height="match_parent"
                    android:background="@drawable/ic_vip_header_bg">


                    <ImageView
                        android:id="@+id/vip_image"
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:layout_alignParentTop="true"
                        android:layout_centerInParent="true"
                        android:layout_marginTop="@dimen/vip_head_image_margin_top"
                        android:src="@drawable/ic_vip_open" />

                    <LinearLayout
                        android:id="@+id/vip_layout"
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:layout_below="@id/vip_image"
                        android:layout_centerInParent="true"
                        android:orientation="horizontal">

                        <TextView
                            android:layout_width="wrap_content"
                            android:layout_height="wrap_content"
                            android:text="@string/vip_message_1"
                            android:textColor="@color/white"
                            android:textSize="@dimen/default_small_text_size" />

                        <TextView
                            android:layout_width="wrap_content"
                            android:layout_height="wrap_content"
                            android:layout_marginEnd="@dimen/default_tiny_margin"
                            android:layout_marginStart="@dimen/default_tiny_margin"
                            android:text="@string/vip"
                            android:textColor="@color/white"
                            android:textSize="@dimen/default_big_large_text_size"
                            android:textStyle="bold" />

                        <TextView
                            android:layout_width="wrap_content"
                            android:layout_height="wrap_content"
                            android:text="@string/vip_message_2"
                            android:textColor="@color/white"
                            android:textSize="@dimen/default_small_text_size" />

                    </LinearLayout>

                    <TextView
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:layout_below="@id/vip_layout"
                        android:layout_centerInParent="true"
                        android:layout_marginTop="@dimen/default_tiny_margin"
                        android:text="@string/vip_message_3"
                        android:textColor="@color/white"
                        android:textSize="@dimen/default_tiny_text_size" />


                    <Button
                        android:layout_width="match_parent"
                        android:layout_height="@dimen/login_button_height"
                        android:layout_alignParentBottom="true"
                        android:layout_centerInParent="true"
                        android:layout_margin="@dimen/default_general_margin"
                        android:background="@drawable/vip_btn_bg"
                        android:text="@string/immediately_opened"
                        android:textColor="@color/vip_button_text_color"
                        android:textSize="@dimen/default_small_text_size" />


                </RelativeLayout>


            </FrameLayout>


            <android.support.v7.widget.Toolbar
                android:id="@+id/toolbar"
                android:layout_width="match_parent"
                android:layout_height="?attr/actionBarSize"
                android:minHeight="?attr/actionBarSize"
                app:contentInsetStart="@dimen/vip_toolbar_title_margin_start"
                app:layout_collapseMode="pin"
                app:popupTheme="@style/ThemeOverlay.AppCompat.Light"
                app:titleTextAppearance="@style/ToolBar.TitleText">


                <TextView
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:text="@string/vip"
                    android:textColor="@color/white"
                    android:textSize="20sp" />


            </android.support.v7.widget.Toolbar>

        </android.support.design.widget.CollapsingToolbarLayout>

    </android.support.design.widget.AppBarLayout>
```
   详细内容主要使用了```WebView```，如下：
```XML
 <android.support.v4.widget.NestedScrollView
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:overScrollMode="never"
        app:layout_behavior="@string/appbar_scrolling_view_behavior">


        <WebView
            android:id="@+id/vip_webView"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:overScrollMode="never"
            android:scrollbars="none" />

    </android.support.v4.widget.NestedScrollView>
```
   完整代码如下：
```XML
<?xml version="1.0" encoding="utf-8"?>
<android.support.design.widget.CoordinatorLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:fitsSystemWindows="true">

    <android.support.design.widget.AppBarLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:fitsSystemWindows="true">

        <android.support.design.widget.CollapsingToolbarLayout
            android:id="@+id/collapsing_toolbar"
            android:layout_width="match_parent"
            android:layout_height="@dimen/vip_head_layout_height"
            android:fitsSystemWindows="true"
            android:theme="@style/ThemeOverlay.AppCompat.Dark.ActionBar"
            app:collapsedTitleTextAppearance="@style/ToolBar.TitleText"
            app:contentScrim="?attr/colorPrimary"
            app:expandedTitleTextAppearance="@style/CollapsingToolbarTitleStyle.About"
            app:layout_scrollFlags="scroll|exitUntilCollapsed|snap">


            <FrameLayout
                android:layout_width="match_parent"
                android:layout_height="@dimen/vip_head_layout_height"
                android:fitsSystemWindows="true">


                <RelativeLayout
                    android:layout_width="match_parent"
                    android:layout_height="match_parent"
                    android:background="@drawable/ic_vip_header_bg">


                    <ImageView
                        android:id="@+id/vip_image"
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:layout_alignParentTop="true"
                        android:layout_centerInParent="true"
                        android:layout_marginTop="@dimen/vip_head_image_margin_top"
                        android:src="@drawable/ic_vip_open" />

                    <LinearLayout
                        android:id="@+id/vip_layout"
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:layout_below="@id/vip_image"
                        android:layout_centerInParent="true"
                        android:orientation="horizontal">

                        <TextView
                            android:layout_width="wrap_content"
                            android:layout_height="wrap_content"
                            android:text="@string/vip_message_1"
                            android:textColor="@color/white"
                            android:textSize="@dimen/default_small_text_size" />

                        <TextView
                            android:layout_width="wrap_content"
                            android:layout_height="wrap_content"
                            android:layout_marginEnd="@dimen/default_tiny_margin"
                            android:layout_marginStart="@dimen/default_tiny_margin"
                            android:text="@string/vip"
                            android:textColor="@color/white"
                            android:textSize="@dimen/default_big_large_text_size"
                            android:textStyle="bold" />

                        <TextView
                            android:layout_width="wrap_content"
                            android:layout_height="wrap_content"
                            android:text="@string/vip_message_2"
                            android:textColor="@color/white"
                            android:textSize="@dimen/default_small_text_size" />

                    </LinearLayout>

                    <TextView
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:layout_below="@id/vip_layout"
                        android:layout_centerInParent="true"
                        android:layout_marginTop="@dimen/default_tiny_margin"
                        android:text="@string/vip_message_3"
                        android:textColor="@color/white"
                        android:textSize="@dimen/default_tiny_text_size" />


                    <Button
                        android:layout_width="match_parent"
                        android:layout_height="@dimen/login_button_height"
                        android:layout_alignParentBottom="true"
                        android:layout_centerInParent="true"
                        android:layout_margin="@dimen/default_general_margin"
                        android:background="@drawable/vip_btn_bg"
                        android:text="@string/immediately_opened"
                        android:textColor="@color/vip_button_text_color"
                        android:textSize="@dimen/default_small_text_size" />


                </RelativeLayout>


            </FrameLayout>


            <android.support.v7.widget.Toolbar
                android:id="@+id/toolbar"
                android:layout_width="match_parent"
                android:layout_height="?attr/actionBarSize"
                android:minHeight="?attr/actionBarSize"
                app:contentInsetStart="@dimen/vip_toolbar_title_margin_start"
                app:layout_collapseMode="pin"
                app:popupTheme="@style/ThemeOverlay.AppCompat.Light"
                app:titleTextAppearance="@style/ToolBar.TitleText">


                <TextView
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:text="@string/vip"
                    android:textColor="@color/white"
                    android:textSize="20sp" />


            </android.support.v7.widget.Toolbar>

        </android.support.design.widget.CollapsingToolbarLayout>

    </android.support.design.widget.AppBarLayout>

    <android.support.v4.widget.NestedScrollView
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:overScrollMode="never"
        app:layout_behavior="@string/appbar_scrolling_view_behavior">


        <WebView
            android:id="@+id/vip_webView"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:overScrollMode="never"
            android:scrollbars="none" />

    </android.support.v4.widget.NestedScrollView>

</android.support.design.widget.CoordinatorLayout>
```
###会员积分
   使用布局方式和```我的大会员```界面类似，分为两部分：图片Toolbar和详细内容页
   图片ToolBar设计，如下：
```XML
<android.support.design.widget.AppBarLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:fitsSystemWindows="true">

        <android.support.design.widget.CollapsingToolbarLayout
            android:id="@+id/collapsing_toolbar"
            android:layout_width="match_parent"
            android:layout_height="232dp"
            android:fitsSystemWindows="true"
            android:theme="@style/ThemeOverlay.AppCompat.Dark.ActionBar"
            app:collapsedTitleTextAppearance="@style/ToolBar.TitleText"
            app:contentScrim="?attr/colorPrimary"
            app:expandedTitleTextAppearance="@style/CollapsingToolbarTitleStyle.About"
            app:layout_scrollFlags="scroll|exitUntilCollapsed|snap">
            <FrameLayout
                android:layout_width="match_parent"
                android:layout_height="232dp"
                android:fitsSystemWindows="true">


                <RelativeLayout
                    android:layout_width="match_parent"
                    android:layout_height="match_parent"
                    android:background="@drawable/ic_vip_header_bg">
                    <LinearLayout
                        android:id="@+id/vip_layout"
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"

                        android:layout_centerInParent="true"
                        android:orientation="horizontal">

                        <TextView
                            android:layout_width="wrap_content"
                            android:layout_height="wrap_content"
                            android:layout_marginTop="160dp"
                            android:text="1200"
                            android:textColor="@color/white"
                            android:textSize="48sp"
                            android:textStyle="bold" />

                    </LinearLayout>

                </RelativeLayout>


            </FrameLayout>

            <android.support.v7.widget.Toolbar
                android:id="@+id/toolbar"
                android:layout_width="match_parent"
                android:layout_height="?attr/actionBarSize"
                android:minHeight="?attr/actionBarSize"
                app:contentInsetStart="@dimen/vip_toolbar_title_margin_start"
                app:layout_collapseMode="pin"
                app:popupTheme="@style/ThemeOverlay.AppCompat.Light"
                app:titleTextAppearance="@style/ToolBar.TitleText">

                <TextView
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:text="会员积分"
                    android:textColor="@color/white"
                    android:textSize="20sp" />

            </android.support.v7.widget.Toolbar>


        </android.support.design.widget.CollapsingToolbarLayout>
    </android.support.design.widget.AppBarLayout>
```
   详细内容界面设计，如下：
```XML
<android.support.v4.widget.NestedScrollView
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:overScrollMode="never"
        app:layout_behavior="@string/appbar_scrolling_view_behavior">


        <include layout="@layout/layout_integration_1">

        </include>

    </android.support.v4.widget.NestedScrollView>
```
```XML
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:orientation="vertical" android:layout_width="match_parent"
    android:layout_height="match_parent">
    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="48dp"
        android:background="#E4E4E4"
        >
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginLeft="8dp"
            android:text="大会员兑换"
            android:textSize="16sp"
            android:layout_gravity="center_vertical"
        />

    </LinearLayout>

    <RelativeLayout
        android:layout_width="wrap_content"
        android:layout_height="72dp"
        >

        <TextView
            android:id="@+id/dahuiyuan_1"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_gravity="center_vertical"
            android:layout_marginTop="8dp"
            android:layout_marginLeft="8dp"
            android:text="大会员"
            android:textSize="20sp" />

        <TextView
            android:id="@+id/dahuiyuan_2"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_below="@+id/dahuiyuan_1"
            android:layout_gravity="center_vertical"
            android:layout_marginLeft="8dp"
            android:layout_marginTop="8dp"
            android:text="1250积分/月"
            android:textColor="@color/black_alpha_45"
            android:textSize="16sp" />

        <Button
            android:layout_width="88dp"
            android:layout_height="36dp"
            android:layout_marginTop="16dp"
            android:layout_marginRight="8dp"
            android:text="兑换"
            android:background="@drawable/btn"
            android:textSize="14sp"
            android:textColor="@color/nav_head_roung_text_background"
            android:layout_alignParentRight="true"
            />

    </RelativeLayout>

    <ImageView
        android:layout_width="match_parent"
        android:layout_height="1dp"
        android:background="@color/black_alpha_45"
        />

    <RelativeLayout
        android:layout_width="wrap_content"
        android:layout_height="72dp">

        <TextView
            android:id="@+id/dahuiyuan_1"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_gravity="center_vertical"
            android:layout_marginLeft="8dp"
            android:layout_marginTop="8dp"
            android:text="年度大会员"
            android:textSize="20sp" />

        <TextView
            android:id="@+id/dahuiyuan_2"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_below="@+id/dahuiyuan_1"
            android:layout_gravity="center_vertical"
            android:layout_marginLeft="8dp"
            android:layout_marginTop="8dp"
            android:text="11500积分/月"
            android:textColor="@color/black_alpha_45"
            android:textSize="16sp" />

        <Button
            android:layout_width="88dp"
            android:layout_height="36dp"
            android:layout_alignParentRight="true"
            android:layout_marginRight="8dp"
            android:layout_marginTop="16dp"
            android:background="@drawable/btn"
            android:text="兑换"
            android:textSize="14sp"
            android:textColor="@color/nav_head_roung_text_background" />

    </RelativeLayout>
    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="48dp"
        android:background="#E4E4E4"
        >
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginLeft="8dp"
            android:text="如何获得会员积分"
            android:textSize="16sp"
            android:layout_gravity="center_vertical"
            />

    </LinearLayout>
    <RelativeLayout
        android:layout_marginTop="8dp"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        >

        <TextView
            android:id="@+id/huiyuanjifen_1"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="找感兴趣的番剧"
            android:textSize="16sp"
            android:layout_marginLeft="8dp"

            />
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_below="@id/huiyuanjifen_1"
            android:layout_marginTop="8dp"
            android:text="去bilibili番剧区找可承包的感兴趣的番剧
去找番剧>>"
            android:textColor="@color/black_alpha_45"
            android:layout_marginLeft="8dp"
            android:id="@+id/textView" />

    </RelativeLayout>
    <ImageView
        android:layout_marginTop="8dp"
        android:layout_width="match_parent"
        android:layout_height="1dp"
        android:layout_marginLeft="8dp"
        android:background="@color/black_alpha_45"
        />
    <RelativeLayout
    android:layout_marginTop="8dp"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    >

    <TextView
        android:id="@+id/huiyuanjifen_1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="成功承包番剧"
        android:textSize="16sp"
        android:layout_marginLeft="8dp"

        />
    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_below="@id/huiyuanjifen_1"
        android:layout_marginTop="8dp"
        android:text="成功承包感兴趣的番剧
并获得会员积分"
        android:textColor="@color/black_alpha_45"
        android:layout_marginLeft="8dp"
        />

 </RelativeLayout>
    <ImageView
        android:layout_marginTop="8dp"
        android:layout_width="match_parent"
        android:layout_height="1dp"
        android:layout_marginLeft="8dp"
        android:background="@color/black_alpha_45"
        />
    <RelativeLayout
        android:layout_marginTop="8dp"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        >

        <TextView
            android:id="@+id/huiyuanjifen_1"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="获得会员积分"
            android:textSize="16sp"
            android:layout_marginLeft="8dp"

            />
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_below="@id/huiyuanjifen_1"
            android:layout_marginTop="8dp"
            android:text="每成功承包18币（不包含B币卷）
即可获得50点会员积分"
            android:textColor="@color/black_alpha_45"
            android:layout_marginLeft="8dp"
            />

    </RelativeLayout>
    <ImageView
        android:layout_marginTop="8dp"
        android:layout_width="match_parent"
        android:layout_height="1dp"
        android:layout_marginLeft="8dp"
        android:background="@color/black_alpha_45"
        />
    <RelativeLayout
        android:layout_marginTop="8dp"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        >

        <TextView
            android:id="@+id/huiyuanjifen_1"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="兑换大会员"
            android:textSize="16sp"
            android:layout_marginLeft="8dp"

            />
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_below="@id/huiyuanjifen_1"
            android:layout_marginTop="8dp"
            android:text="会员积分达到1250分
即可兑换1个月大会员"
            android:textColor="@color/black_alpha_45"
            android:layout_marginLeft="8dp"
            />

    </RelativeLayout>
    <ImageView
        android:layout_marginTop="8dp"
        android:layout_width="match_parent"
        android:layout_height="1dp"

        android:background="@color/black_alpha_45"
        />
    <RelativeLayout
        android:layout_width="wrap_content"
        android:layout_height="wrap_content">

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:id="@+id/wenxintishi_1"
            android:layout_marginTop="8dp"
            android:layout_marginLeft="8dp"
            android:text="温馨提示"
            android:textSize="16sp"
            android:textColor="@color/nav_head_roung_text_background"
            />

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:id="@+id/wenxintishi_2"
            android:layout_below="@+id/wenxintishi_1"
            android:layout_marginTop="8dp"
            android:layout_marginLeft="8dp"
            android:text="·承包中消费B币卷的部分不获得积分"
            android:textColor="@color/black_alpha_45"
            android:textSize="16sp"
            />
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:id="@+id/wenxintishi_3"
            android:layout_below="@id/wenxintishi_2"
            android:layout_marginLeft="8dp"
            android:text="·后续将推出更多获取积分的途径哦~"
            android:textColor="@color/black_alpha_45"
            android:textSize="16sp"
            />



    </RelativeLayout>

</LinearLayout>
```
   完整代码如下：
```XML
<?xml version="1.0" encoding="utf-8"?>
<android.support.design.widget.CoordinatorLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:fitsSystemWindows="true">

    <android.support.design.widget.AppBarLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:fitsSystemWindows="true">

        <android.support.design.widget.CollapsingToolbarLayout
            android:id="@+id/collapsing_toolbar"
            android:layout_width="match_parent"
            android:layout_height="232dp"
            android:fitsSystemWindows="true"
            android:theme="@style/ThemeOverlay.AppCompat.Dark.ActionBar"
            app:collapsedTitleTextAppearance="@style/ToolBar.TitleText"
            app:contentScrim="?attr/colorPrimary"
            app:expandedTitleTextAppearance="@style/CollapsingToolbarTitleStyle.About"
            app:layout_scrollFlags="scroll|exitUntilCollapsed|snap">
            <FrameLayout
                android:layout_width="match_parent"
                android:layout_height="232dp"
                android:fitsSystemWindows="true">


                <RelativeLayout
                    android:layout_width="match_parent"
                    android:layout_height="match_parent"
                    android:background="@drawable/ic_vip_header_bg">
                    <LinearLayout
                        android:id="@+id/vip_layout"
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"

                        android:layout_centerInParent="true"
                        android:orientation="horizontal">

                        <TextView
                            android:layout_width="wrap_content"
                            android:layout_height="wrap_content"
                            android:layout_marginTop="160dp"
                            android:text="1200"
                            android:textColor="@color/white"
                            android:textSize="48sp"
                            android:textStyle="bold" />

                    </LinearLayout>

                </RelativeLayout>


            </FrameLayout>

            <android.support.v7.widget.Toolbar
                android:id="@+id/toolbar"
                android:layout_width="match_parent"
                android:layout_height="?attr/actionBarSize"
                android:minHeight="?attr/actionBarSize"
                app:contentInsetStart="@dimen/vip_toolbar_title_margin_start"
                app:layout_collapseMode="pin"
                app:popupTheme="@style/ThemeOverlay.AppCompat.Light"
                app:titleTextAppearance="@style/ToolBar.TitleText">

                <TextView
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:text="会员积分"
                    android:textColor="@color/white"
                    android:textSize="20sp" />

            </android.support.v7.widget.Toolbar>


        </android.support.design.widget.CollapsingToolbarLayout>
    </android.support.design.widget.AppBarLayout>

    <android.support.v4.widget.NestedScrollView
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:overScrollMode="never"
        app:layout_behavior="@string/appbar_scrolling_view_behavior">


        <include layout="@layout/layout_integration_1">

        </include>
    </android.support.v4.widget.NestedScrollView>

</android.support.design.widget.CoordinatorLayout>
```
###离线下载
   使用了3个自定义的动画类```SpringScrollView```、```CustomEmptyView```、```NumberProgressBar```其他都是对于一些遵循```Meterial Design规范```的布局设计，不再细讲，完整代码如下：
```XML
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical">



    <FrameLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent">
        <include layout="@layout/app_bar_main" />

        <FrameLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent">


            <com.example.longinusl33t.blive.SpringScrollView
                android:id="@+id/download_scroll_view"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                android:fillViewport="true"
                android:overScrollMode="never"
                android:scrollbars="none" />

            <com.example.longinusl33t.blive.CustomEmptyView
                android:id="@+id/empty_layout"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_gravity="center"
                android:visibility="invisible"
                />

        </FrameLayout>

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="@dimen/bottom_layout_height"
            android:layout_gravity="bottom"
            android:orientation="vertical">


            <FrameLayout
                android:layout_width="match_parent"
                android:layout_height="wrap_content">

                <com.example.longinusl33t.blive.NumberProgressBar
                    android:id="@+id/progress_bar"
                    style="@style/NumberProgressBar_Beauty_Red"
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    app:progress_max="100"
                    app:progress_text_visibility="invisible" />

                <LinearLayout
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:layout_gravity="center"
                    android:orientation="horizontal">

                    <TextView
                        android:id="@+id/cache_size_text"
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:layout_gravity="center"
                        android:layout_marginStart="@dimen/default_general_margin"
                        android:gravity="center"
                        android:textColor="@color/font_normal"
                        android:textSize="@dimen/default_tiny_text_size" />
                </LinearLayout>
            </FrameLayout>

            <RelativeLayout
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                android:layout_gravity="bottom"
                android:paddingEnd="@dimen/default_general_margin"
                android:paddingStart="@dimen/default_grow_margin">

                <TextView
                    android:id="@+id/btn_start_all"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_alignParentStart="true"
                    android:layout_centerInParent="true"
                    android:text="@string/all_start"
                    android:textColor="@color/font_normal"
                    android:textSize="@dimen/default_small_text_size" />

                <View
                    android:id="@+id/line"
                    android:layout_width="@dimen/line_height"
                    android:layout_height="@dimen/default_general_margin"
                    android:layout_centerInParent="true"
                    android:layout_marginStart="@dimen/default_general_margin"
                    android:layout_toEndOf="@+id/btn_start_all"
                    android:background="@color/font_normal" />

                <TextView
                    android:id="@+id/btn_download_edit"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_centerInParent="true"
                    android:layout_marginStart="@dimen/default_general_margin"
                    android:layout_toEndOf="@+id/line"
                    android:text="@string/edit"
                    android:textColor="@color/font_normal"
                    android:textSize="@dimen/default_small_text_size" />


                <ImageView
                    android:id="@+id/download_refresh"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_alignParentEnd="true"
                    android:layout_centerInParent="true"
                    android:padding="@dimen/default_general_margin"
                    android:src="@drawable/ic_action_download_refresh" />

            </RelativeLayout>
        </LinearLayout>
    </FrameLayout>
</LinearLayout>
```
   ```SpringScrollView```的设计，如下：
```JAVA
package com.example.longinusl33t.blive;


import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.ScrollView;

/**
 * Created by wcy62 on 2017-05-24.
 */

public class SpringScrollView extends ScrollView {

    private static final float MOVE_FACTOR = 0.5f; // 移动因子,手指移动100px,那么View就只移动50px

    private static final int ANIM_TIME = 300; // 松开手指后, 界面回到正常位置需要的动画时间

    private float startY;// 手指按下时的Y值, 用于在移动时计算移动距离,如果按下时不能上拉和下拉，
    // 会在手指移动时更新为当前手指的Y值

    // ui
    private View contentView; // ScrollView的唯一内容控件

    private Rect originalRect = new Rect();// 用于记录正常的布局位置

    // flag
    private boolean canPullDown = false; // 是否可以继续下拉

    private boolean canPullUp = false; // 是否可以继续上拉

    private boolean isMoved = false; // 记录是否移动了布局


    public SpringScrollView(Context context) {

        super(context);
    }


    public SpringScrollView(Context context, AttributeSet attrs) {

        super(context, attrs);
    }


    public SpringScrollView(Context context, AttributeSet attrs, int defStyle) {

        super(context, attrs, defStyle);
    }


    @SuppressLint("MissingSuperCall")
    @Override
    protected void onFinishInflate() {

        if (getChildCount() > 0) {
            contentView = getChildAt(0);
        }
    }


    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {

        super.onLayout(changed, l, t, r, b);
        if (contentView == null) {
            return;
        }
        // ScrollView中的唯一子控件的位置信息, 这个位置信息在整个控件的生命周期中保持不变
        originalRect.set(contentView.getLeft(), contentView.getTop(), contentView.getRight(),
                contentView.getBottom());
    }


    /**
     * 在触摸事件中, 处理上拉和下拉的逻辑
     */
    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {

        if (contentView == null) {
            return super.dispatchTouchEvent(ev);
        }
        // 手指是否移动到了当前ScrollView控件之外
        boolean isTouchOutOfScrollView = ev.getY() >= this.getHeight() || ev.getY() <= 0;
        if (isTouchOutOfScrollView) { // 如果移动到了当前ScrollView控件之外
            if (isMoved) // 如果当前contentView已经被移动, 首先把布局移到原位置, 然后消费点这个事件
            {
                boundBack();
            }
            return true;
        }
        int action = ev.getAction();
        switch (action) {
            case MotionEvent.ACTION_DOWN:
                // 判断是否可以上拉和下拉
                canPullDown = isCanPullDown();
                canPullUp = isCanPullUp();
                // 记录按下时的Y值
                startY = ev.getY();
                break;
            case MotionEvent.ACTION_UP:
                boundBack();
                break;
            case MotionEvent.ACTION_MOVE:
                // 在移动的过程中， 既没有滚动到可以上拉的程度， 也没有滚动到可以下拉的程度
                if (!canPullDown && !canPullUp) {
                    startY = ev.getY();
                    canPullDown = isCanPullDown();
                    canPullUp = isCanPullUp();
                    break;
                }
                // 计算手指移动的距离
                float nowY = ev.getY();
                int deltaY = (int) (nowY - startY);

                // 是否应该移动布局
                boolean shouldMove = (canPullDown && deltaY > 0) // 可以下拉， 并且手指向下移动
                        || (canPullUp && deltaY < 0) // 可以上拉， 并且手指向上移动
                        || (canPullUp && canPullDown); // 既可以上拉也可以下拉（这种情况出现在ScrollView包裹的控件比ScrollView还小）
                if (shouldMove) {
                    // 计算偏移量
                    int offset = (int) (deltaY * MOVE_FACTOR);
                    // 随着手指的移动而移动布局
                    contentView.layout(originalRect.left, originalRect.top + offset, originalRect.right,
                            originalRect.bottom + offset);
                    isMoved = true; // 记录移动了布局
                }
                break;
        }
        return super.dispatchTouchEvent(ev);
    }


    /**
     * 将内容布局移动到原位置 可以在UP事件中调用, 也可以在其他需要的地方调用, 如手指移动到当前ScrollView外时
     */
    private void boundBack() {

        if (!isMoved) {
            return; // 如果没有移动布局， 则跳过执行
        }
        // 开启动画
        TranslateAnimation anim = new TranslateAnimation(0, 0, contentView.getTop(), originalRect.top);
        anim.setDuration(ANIM_TIME);
        contentView.startAnimation(anim);
        // 设置回到正常的布局位置
        contentView.layout(originalRect.left, originalRect.top, originalRect.right,
                originalRect.bottom);
        // 将标志位设回false
        canPullDown = false;
        canPullUp = false;
        isMoved = false;
    }


    /**
     * 判断是否滚动到顶部
     */
    private boolean isCanPullDown() {

        return getScrollY() == 0 || contentView.getHeight() < getHeight() + getScrollY();
    }


    /**
     * 判断是否滚动到底部
     */
    private boolean isCanPullUp() {

        return contentView.getHeight() <= getHeight() + getScrollY();
    }
}
```
   ```CustomEmptyView```设计和实现，主要是用于没有缓存的时候的处理工具类。
```JAVA
package com.example.longinusl33t.blive;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
/**
 * Created by wcy62 on 2017-05-24.
 */

public class CustomEmptyView extends FrameLayout {

    private ImageView mEmptyImg;

    private TextView mEmptyText;


    public CustomEmptyView(Context context, AttributeSet attrs, int defStyleAttr) {

        super(context, attrs, defStyleAttr);
        init();
    }


    public CustomEmptyView(Context context) {

        this(context, null);
    }


    public CustomEmptyView(Context context, AttributeSet attrs) {

        this(context, attrs, 0);
    }


    public void init() {

        View view = LayoutInflater.from(getContext()).inflate(R.layout.layout_empty, this);
        mEmptyImg = (ImageView) view.findViewById(R.id.empty_img);
        mEmptyText = (TextView) view.findViewById(R.id.empty_text);
    }


    public void setEmptyImage(int imgRes) {

        mEmptyImg.setImageResource(imgRes);
    }


    public void setEmptyText(String text) {

        mEmptyText.setText(text);
    }
}

```
   ```NumberProgressBar```设计和实现，主要是用于进度条的设计和显示内存大小的进度条的设计和使用，具体如下：
```JAVA
package com.example.longinusl33t.blive;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;



/**
 * Created by wcy62 on 2017-05-24.
 */

class NumberProgressBar extends View {

    private int mMaxProgress = 100;

    /**
     * Current progress, can not exceed the max progress.
     */
    private int mCurrentProgress = 0;

    /**
     * The progress area bar color.
     */
    private int mReachedBarColor;

    /**
     * The bar unreached area color.
     */
    private int mUnreachedBarColor;

    /**
     * The progress text color.
     */
    private int mTextColor;

    /**
     * The progress text size.
     */
    private float mTextSize;

    /**
     * The height of the reached area.
     */
    private float mReachedBarHeight;

    /**
     * The height of the unreached area.
     */
    private float mUnreachedBarHeight;

    /**
     * The suffix of the number.
     */
    private String mSuffix = "%";

    /**
     * The prefix.
     */
    private String mPrefix = "";

    private final int default_text_color = Color.rgb(66, 145, 241);

    private final int default_reached_color = Color.rgb(66, 145, 241);

    private final int default_unreached_color = Color.rgb(204, 204, 204);

    private final float default_progress_text_offset;

    private final float default_text_size;

    private final float default_reached_bar_height;

    private final float default_unreached_bar_height;

    /**
     * For save and restore instance of progressbar.
     */
    private static final String INSTANCE_STATE = "saved_instance";

    private static final String INSTANCE_TEXT_COLOR = "text_color";

    private static final String INSTANCE_TEXT_SIZE = "text_size";

    private static final String INSTANCE_REACHED_BAR_HEIGHT = "reached_bar_height";

    private static final String INSTANCE_REACHED_BAR_COLOR = "reached_bar_color";

    private static final String INSTANCE_UNREACHED_BAR_HEIGHT = "unreached_bar_height";

    private static final String INSTANCE_UNREACHED_BAR_COLOR = "unreached_bar_color";

    private static final String INSTANCE_MAX = "max";

    private static final String INSTANCE_PROGRESS = "progress";

    private static final String INSTANCE_SUFFIX = "suffix";

    private static final String INSTANCE_PREFIX = "prefix";

    private static final String INSTANCE_TEXT_VISIBILITY = "text_visibility";

    private static final int PROGRESS_TEXT_VISIBLE = 0;

    /**
     * The width of the text that to be drawn.
     */
    private float mDrawTextWidth;

    /**
     * The drawn text start.
     */
    private float mDrawTextStart;

    /**
     * The drawn text end.
     */
    private float mDrawTextEnd;

    /**
     * The text that to be drawn in onDraw().
     */
    private String mCurrentDrawText;

    /**
     * The Paint of the reached area.
     */
    private Paint mReachedBarPaint;

    /**
     * The Paint of the unreached area.
     */
    private Paint mUnreachedBarPaint;

    /**
     * The Paint of the progress text.
     */
    private Paint mTextPaint;

    /**
     * Unreached bar area to draw rect.
     */
    private RectF mUnreachedRectF = new RectF(0, 0, 0, 0);

    /**
     * Reached bar area rect.
     */
    private RectF mReachedRectF = new RectF(0, 0, 0, 0);

    /**
     * The progress text offset.
     */
    private float mOffset;

    /**
     * Determine if need to draw unreached area.
     */
    private boolean mDrawUnreachedBar = true;

    private boolean mDrawReachedBar = true;

    private boolean mIfDrawText = true;

    /**
     * Listener
     */
    private OnProgressBarListener mListener;

    public enum ProgressTextVisibility {
        Visible, Invisible
    }


    public NumberProgressBar(Context context) {

        this(context, null);
    }


    public NumberProgressBar(Context context, AttributeSet attrs) {

        this(context, attrs, R.attr.numberProgressBarStyle);
    }


    public NumberProgressBar(Context context, AttributeSet attrs, int defStyleAttr) {

        super(context, attrs, defStyleAttr);

        default_reached_bar_height = dp2px(1.5f);
        default_unreached_bar_height = dp2px(1.0f);
        default_text_size = sp2px(10);
        default_progress_text_offset = dp2px(3.0f);


        //R.styleable.NumberProgressBar

        // load styled attributes.
        final TypedArray attributes = context.getTheme()
                .obtainStyledAttributes(attrs, R.styleable.NumberProgressBar, defStyleAttr, 0);

        mReachedBarColor = attributes.getColor(R.styleable.NumberProgressBar_progress_reached_color,
                default_reached_color);
        mUnreachedBarColor = attributes.getColor(R.styleable.NumberProgressBar_progress_unreached_color,
                default_unreached_color);
        mTextColor = attributes.getColor(R.styleable.NumberProgressBar_progress_text_color,
                default_text_color);
        mTextSize = attributes.getDimension(R.styleable.NumberProgressBar_progress_text_size,
                default_text_size);

        mReachedBarHeight = attributes.getDimension(
                R.styleable.NumberProgressBar_progress_reached_bar_height, default_reached_bar_height);
        mUnreachedBarHeight = attributes.getDimension(
                R.styleable.NumberProgressBar_progress_unreached_bar_height, default_unreached_bar_height);
        mOffset = attributes.getDimension(R.styleable.NumberProgressBar_progress_text_offset,
                default_progress_text_offset);

        int textVisible = attributes.getInt(R.styleable.NumberProgressBar_progress_text_visibility,
                PROGRESS_TEXT_VISIBLE);
        if (textVisible != PROGRESS_TEXT_VISIBLE) {
            mIfDrawText = false;
        }

        setProgress(attributes.getInt(R.styleable.NumberProgressBar_progress_current, 0));
        setMax(attributes.getInt(R.styleable.NumberProgressBar_progress_max, 100));

        attributes.recycle();
        initializePainters();
    }


    @Override
    protected int getSuggestedMinimumWidth() {

        return (int) mTextSize;
    }


    @Override
    protected int getSuggestedMinimumHeight() {

        return Math.max((int) mTextSize, Math.max((int) mReachedBarHeight, (int) mUnreachedBarHeight));
    }


    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {

        setMeasuredDimension(measure(widthMeasureSpec, true), measure(heightMeasureSpec, false));
    }


    private int measure(int measureSpec, boolean isWidth) {

        int result;
        int mode = MeasureSpec.getMode(measureSpec);
        int size = MeasureSpec.getSize(measureSpec);
        int padding = isWidth
                ? getPaddingLeft() + getPaddingRight()
                : getPaddingTop() + getPaddingBottom();
        if (mode == MeasureSpec.EXACTLY) {
            result = size;
        } else {
            result = isWidth ? getSuggestedMinimumWidth() : getSuggestedMinimumHeight();
            result += padding;
            if (mode == MeasureSpec.AT_MOST) {
                if (isWidth) {
                    result = Math.max(result, size);
                } else {
                    result = Math.min(result, size);
                }
            }
        }
        return result;
    }


    @Override
    protected void onDraw(Canvas canvas) {

        if (mIfDrawText) {
            calculateDrawRectF();
        } else {
            calculateDrawRectFWithoutProgressText();
        }

        if (mDrawReachedBar) {
            canvas.drawRect(mReachedRectF, mReachedBarPaint);
        }

        if (mDrawUnreachedBar) {
            canvas.drawRect(mUnreachedRectF, mUnreachedBarPaint);
        }

        if (mIfDrawText) {
            canvas.drawText(mCurrentDrawText, mDrawTextStart, mDrawTextEnd, mTextPaint);
        }
    }


    private void initializePainters() {

        mReachedBarPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mReachedBarPaint.setColor(mReachedBarColor);

        mUnreachedBarPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mUnreachedBarPaint.setColor(mUnreachedBarColor);

        mTextPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mTextPaint.setColor(mTextColor);
        mTextPaint.setTextSize(mTextSize);
    }


    private void calculateDrawRectFWithoutProgressText() {

        mReachedRectF.left = getPaddingLeft();
        mReachedRectF.top = getHeight() / 2.0f - mReachedBarHeight / 2.0f;
        mReachedRectF.right =
                (getWidth() - getPaddingLeft() - getPaddingRight()) / (getMax() * 1.0f) * getProgress() +
                        getPaddingLeft();
        mReachedRectF.bottom = getHeight() / 2.0f + mReachedBarHeight / 2.0f;

        mUnreachedRectF.left = mReachedRectF.right;
        mUnreachedRectF.right = getWidth() - getPaddingRight();
        mUnreachedRectF.top = getHeight() / 2.0f + -mUnreachedBarHeight / 2.0f;
        mUnreachedRectF.bottom = getHeight() / 2.0f + mUnreachedBarHeight / 2.0f;
    }


    private void calculateDrawRectF() {

        mCurrentDrawText = String.format("%d", getProgress() * 100 / getMax());
        mCurrentDrawText = mPrefix + mCurrentDrawText + mSuffix;
        mDrawTextWidth = mTextPaint.measureText(mCurrentDrawText);

        if (getProgress() == 0) {
            mDrawReachedBar = false;
            mDrawTextStart = getPaddingLeft();
        } else {
            mDrawReachedBar = true;
            mReachedRectF.left = getPaddingLeft();
            mReachedRectF.top = getHeight() / 2.0f - mReachedBarHeight / 2.0f;
            mReachedRectF.right =
                    (getWidth() - getPaddingLeft() - getPaddingRight()) / (getMax() * 1.0f) * getProgress() -
                            mOffset + getPaddingLeft();
            mReachedRectF.bottom = getHeight() / 2.0f + mReachedBarHeight / 2.0f;
            mDrawTextStart = (mReachedRectF.right + mOffset);
        }

        mDrawTextEnd = (int) ((getHeight() / 2.0f) -
                ((mTextPaint.descent() + mTextPaint.ascent()) / 2.0f));

        if ((mDrawTextStart + mDrawTextWidth) >= getWidth() - getPaddingRight()) {
            mDrawTextStart = getWidth() - getPaddingRight() - mDrawTextWidth;
            mReachedRectF.right = mDrawTextStart - mOffset;
        }

        float unreachedBarStart = mDrawTextStart + mDrawTextWidth + mOffset;
        if (unreachedBarStart >= getWidth() - getPaddingRight()) {
            mDrawUnreachedBar = false;
        } else {
            mDrawUnreachedBar = true;
            mUnreachedRectF.left = unreachedBarStart;
            mUnreachedRectF.right = getWidth() - getPaddingRight();
            mUnreachedRectF.top = getHeight() / 2.0f + -mUnreachedBarHeight / 2.0f;
            mUnreachedRectF.bottom = getHeight() / 2.0f + mUnreachedBarHeight / 2.0f;
        }
    }


    /**
     * Get progress text color.
     *
     * @return progress text color.
     */
    public int getTextColor() {

        return mTextColor;
    }


    /**
     * Get progress text size.
     *
     * @return progress text size.
     */
    public float getProgressTextSize() {

        return mTextSize;
    }


    public int getUnreachedBarColor() {

        return mUnreachedBarColor;
    }


    public int getReachedBarColor() {

        return mReachedBarColor;
    }


    public int getProgress() {

        return mCurrentProgress;
    }


    public int getMax() {

        return mMaxProgress;
    }


    public float getReachedBarHeight() {

        return mReachedBarHeight;
    }


    public float getUnreachedBarHeight() {

        return mUnreachedBarHeight;
    }


    public void setProgressTextSize(float textSize) {

        this.mTextSize = textSize;
        mTextPaint.setTextSize(mTextSize);
        invalidate();
    }


    public void setProgressTextColor(int textColor) {

        this.mTextColor = textColor;
        mTextPaint.setColor(mTextColor);
        invalidate();
    }


    public void setUnreachedBarColor(int barColor) {

        this.mUnreachedBarColor = barColor;
        mUnreachedBarPaint.setColor(mReachedBarColor);
        invalidate();
    }


    public void setReachedBarColor(int progressColor) {

        this.mReachedBarColor = progressColor;
        mReachedBarPaint.setColor(mReachedBarColor);
        invalidate();
    }


    public void setReachedBarHeight(float height) {

        mReachedBarHeight = height;
    }


    public void setUnreachedBarHeight(float height) {

        mUnreachedBarHeight = height;
    }


    public void setMax(int maxProgress) {

        if (maxProgress > 0) {
            this.mMaxProgress = maxProgress;
            invalidate();
        }
    }


    public void setSuffix(String suffix) {

        if (suffix == null) {
            mSuffix = "";
        } else {
            mSuffix = suffix;
        }
    }


    public String getSuffix() {

        return mSuffix;
    }


    public void setPrefix(String prefix) {

        if (prefix == null) {
            mPrefix = "";
        } else {
            mPrefix = prefix;
        }
    }


    public String getPrefix() {

        return mPrefix;
    }


    public void incrementProgressBy(int by) {

        if (by > 0) {
            setProgress(getProgress() + by);
        }

        if (mListener != null) {
            mListener.onProgressChange(getProgress(), getMax());
        }
    }


    public void setProgress(int progress) {

        if (progress <= getMax() && progress >= 0) {
            this.mCurrentProgress = progress;
            invalidate();
        }
    }


    @Override
    protected Parcelable onSaveInstanceState() {

        final Bundle bundle = new Bundle();
        bundle.putParcelable(INSTANCE_STATE, super.onSaveInstanceState());
        bundle.putInt(INSTANCE_TEXT_COLOR, getTextColor());
        bundle.putFloat(INSTANCE_TEXT_SIZE, getProgressTextSize());
        bundle.putFloat(INSTANCE_REACHED_BAR_HEIGHT, getReachedBarHeight());
        bundle.putFloat(INSTANCE_UNREACHED_BAR_HEIGHT, getUnreachedBarHeight());
        bundle.putInt(INSTANCE_REACHED_BAR_COLOR, getReachedBarColor());
        bundle.putInt(INSTANCE_UNREACHED_BAR_COLOR, getUnreachedBarColor());
        bundle.putInt(INSTANCE_MAX, getMax());
        bundle.putInt(INSTANCE_PROGRESS, getProgress());
        bundle.putString(INSTANCE_SUFFIX, getSuffix());
        bundle.putString(INSTANCE_PREFIX, getPrefix());
        bundle.putBoolean(INSTANCE_TEXT_VISIBILITY, getProgressTextVisibility());
        return bundle;
    }


    @Override
    protected void onRestoreInstanceState(Parcelable state) {

        if (state instanceof Bundle) {
            final Bundle bundle = (Bundle) state;
            mTextColor = bundle.getInt(INSTANCE_TEXT_COLOR);
            mTextSize = bundle.getFloat(INSTANCE_TEXT_SIZE);
            mReachedBarHeight = bundle.getFloat(INSTANCE_REACHED_BAR_HEIGHT);
            mUnreachedBarHeight = bundle.getFloat(INSTANCE_UNREACHED_BAR_HEIGHT);
            mReachedBarColor = bundle.getInt(INSTANCE_REACHED_BAR_COLOR);
            mUnreachedBarColor = bundle.getInt(INSTANCE_UNREACHED_BAR_COLOR);
            initializePainters();
            setMax(bundle.getInt(INSTANCE_MAX));
            setProgress(bundle.getInt(INSTANCE_PROGRESS));
            setPrefix(bundle.getString(INSTANCE_PREFIX));
            setSuffix(bundle.getString(INSTANCE_SUFFIX));
            setProgressTextVisibility(bundle.getBoolean(INSTANCE_TEXT_VISIBILITY)
                    ? ProgressTextVisibility.Visible
                    : ProgressTextVisibility.Invisible);
            super.onRestoreInstanceState(bundle.getParcelable(INSTANCE_STATE));
            return;
        }
        super.onRestoreInstanceState(state);
    }


    public float dp2px(float dp) {

        final float scale = getResources().getDisplayMetrics().density;
        return dp * scale + 0.5f;
    }


    public float sp2px(float sp) {

        final float scale = getResources().getDisplayMetrics().scaledDensity;
        return sp * scale;
    }


    public void setProgressTextVisibility(ProgressTextVisibility visibility) {

        mIfDrawText = visibility == ProgressTextVisibility.Visible;
        invalidate();
    }


    public boolean getProgressTextVisibility() {

        return mIfDrawText;
    }


    public void setOnProgressBarListener(OnProgressBarListener listener) {

        mListener = listener;
    }
}
```
   这边需要实现对上面类的接口，如下
```JAVA
package com.example.longinusl33t.blive;

/**
 * Created by wcy62 on 2017-05-24.
 */

public interface OnProgressBarListener {
    /**
     * 数字进度条进度回调接口
     */

    void onProgressChange(int current, int max);
}
```
   当然，需要获取手机的现有内存和全部内存的获取，如下的工具类：
```JAVA
package com.example.longinusl33t.blive;

import android.os.Environment;
import android.os.StatFs;

import java.io.File;

/**
 * Created by wcy62 on 2017-06-04.
 */

public class CommonUtil {

    /**
     * 检查SD卡是否存在
     */
    private static boolean checkSdCard() {

        return Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED);
    }


    /**
     * 获取手机SD卡总空间
     */
    private static long getSDcardTotalSize() {

        if (checkSdCard()) {
            File path = Environment.getExternalStorageDirectory();
            StatFs mStatFs = new StatFs(path.getPath());
            long blockSizeLong = mStatFs.getBlockSizeLong();
            long blockCountLong = mStatFs.getBlockCountLong();

            return blockSizeLong * blockCountLong;
        } else {
            return 0;
        }
    }


    /**
     * 获取SDka可用空间
     */
    private static long getSDcardAvailableSize() {

        if (checkSdCard()) {
            File path = Environment.getExternalStorageDirectory();
            StatFs mStatFs = new StatFs(path.getPath());
            long blockSizeLong = mStatFs.getBlockSizeLong();
            long availableBlocksLong = mStatFs.getAvailableBlocksLong();
            return blockSizeLong * availableBlocksLong;
        } else {
            return 0;
        }
    }


    /**
     * 获取手机内部存储总空间
     */
    public static long getPhoneTotalSize() {

        if (!checkSdCard()) {
            File path = Environment.getDataDirectory();
            StatFs mStatFs = new StatFs(path.getPath());
            long blockSizeLong = mStatFs.getBlockSizeLong();
            long blockCountLong = mStatFs.getBlockCountLong();
            return blockSizeLong * blockCountLong;
        } else {
            return getSDcardTotalSize();
        }
    }


    /**
     * 获取手机内存存储可用空间
     */
    public static long getPhoneAvailableSize() {

        if (!checkSdCard()) {
            File path = Environment.getDataDirectory();
            StatFs mStatFs = new StatFs(path.getPath());
            long blockSizeLong = mStatFs.getBlockSizeLong();
            long availableBlocksLong = mStatFs.getAvailableBlocksLong();
            return blockSizeLong * availableBlocksLong;
        } else
            return getSDcardAvailableSize();
    }
}

```
##动画实现
###Snakebar的实现
   离线下载的```Snakebar```实现
![](D:\CYann_WorkSpace\AS_WorkSpace\BLive_CYann\doc\rec\26.png)
###AppBarLayout+CollapsingToolbarLayout的上拉式动画实现
![](D:\CYann_WorkSpace\AS_WorkSpace\BLive_CYann\doc\rec\25.png)
###进度条的设计与动画
   模拟下载进度的动画
![](D:\CYann_WorkSpace\AS_WorkSpace\BLive_CYann\doc\rec\24.png)
   获取整个机子的内存大小
![](D:\CYann_WorkSpace\AS_WorkSpace\BLive_CYann\doc\rec\27.png)
   代码实现：
```JAVA
package com.example.longinusl33t.blive;

import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.format.Formatter;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class DownloadActivity extends AppCompatActivity {


    private TabLayout tabs;
    private ViewPager viewPager ;
    private List<String> DTitle = new ArrayList<String>();
    private List<Fragment> DFragment = new ArrayList<Fragment>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_download);

        initView();
        MyAdapter adapter = new MyAdapter(getSupportFragmentManager(), DTitle, DFragment);
        viewPager.setAdapter(adapter);
        tabs.setupWithViewPager(viewPager);
        tabs.setTabsFromPagerAdapter(adapter);


        //toolbar实例添加
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //使得TOOLBAR像actionbar一样运行
        setSupportActionBar(toolbar);
        //设置返回按钮显示
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        long phoneTotalSize = CommonUtil.getPhoneTotalSize();
        long phoneAvailableSize = CommonUtil.getPhoneAvailableSize();
        //转换为G的显示单位
        String totalSizeStr = Formatter.formatFileSize(this, phoneTotalSize);
        String availabSizeStr = Formatter.formatFileSize(this, phoneAvailableSize);
        //计算占用空间的百分比
        int progress = countProgress(phoneTotalSize, phoneAvailableSize);

        NumberProgressBar mProgressBar = (NumberProgressBar) findViewById(R.id.progress_bar);
        TextView mCacheSize =(TextView) findViewById(R.id.cache_size_text);

        mProgressBar.setProgress(progress);
        mCacheSize.setText("主存储:" + totalSizeStr + "/" + "可用:" + availabSizeStr);

        CustomEmptyView mEmptyLayout = (CustomEmptyView) findViewById(R.id.empty_layout);

        assert mEmptyLayout != null;
        mEmptyLayout.setEmptyImage(R.drawable.img_tips_error_no_downloads);
        mEmptyLayout.setEmptyText("没有找到你的缓存哟");
    }

    //调用toolbar布局
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.download_toolbar,menu);
        return true;
    }
    //toolbar按钮点击事件
    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId()){
            //导航按钮点击事件，位于toolbar左端
            case android.R.id.home:
                finish();
                break;
            case R.id.id_action_download:
                Snackbar.make(findViewById(android.R.id.content), "离线下载", Snackbar.LENGTH_SHORT)
                .show();
                break;
            default:
                break;
        }
        return true;
    }


    //初始化V
    private void initView() {

        tabs = (TabLayout) findViewById(R.id.tabs);
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        DTitle.add("已缓存");
        DTitle.add("缓存中");

        DFragment.add(new Download_Ok());
        DFragment.add(new Download_Loading());


    }



    private int countProgress(long phoneTotalSize, long phoneAvailableSize) {

        double totalSize = phoneTotalSize / (1024 * 3);
        double availabSize = phoneAvailableSize / (1024 * 3);
        //取整相减
        int size = (int) (Math.floor(totalSize) - Math.floor(availabSize));
        double v = (size / Math.floor(totalSize)) * 100;
        return (int) Math.floor(v);
    }


}

```
   离线下载界面相关的```已缓存```和```缓存中```的```Fragment```的设计与实现，如下是```缓存中```的代码，如下：
```JAVA
package com.example.longinusl33t.blive;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;


/**
 * Created by wcy62 on 2017-05-31.
 */

public class Download_Loading extends Fragment implements OnProgressBarListener {

    private Button button;
    private NumberProgressBar mProgressBar;
    private Timer timer;
    private CardView cardView;
    private CardView cardView_ok;
    private CustomEmptyView customEmptyView;
    private CustomEmptyView customEmptyView_ok;



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.layout_download_loading, null);
        button = (Button) view.findViewById(R.id.xiangqing_download_loding_example);
        cardView= (CardView) view.findViewById(R.id.Cardview_download_loading_example);
        cardView_ok = (CardView) getActivity().findViewById(R.id.Cardview_download_ok_example);


        customEmptyView = (CustomEmptyView) view.findViewById(R.id.empty_loading_layout);
        customEmptyView_ok = (CustomEmptyView) getActivity().findViewById(R.id.empty_ok_layout);

        mProgressBar = (NumberProgressBar) view.findViewById(R.id.progress_bar_download);
        mProgressBar.setOnProgressBarListener(this);
        button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        button.setBackgroundResource(R.drawable.ic_pause_grey600_24dp);

                        timer = new Timer();
                        timer.schedule(new TimerTask() {

                            @Override
                            public void run() {
                                if (getActivity() == null)
                                    return;
                                getActivity().runOnUiThread(new Runnable() {

                                    @Override
                                    public void run() {
                                        //递增progress数值
                                        mProgressBar.incrementProgressBy(5);
                                    }
                                });
                            }
                        }, 1000, 100);

                    }
                });
        return view;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }



 @Override
    public void onProgressChange(int current, int max) {
        if (current == max) {
            mProgressBar.setProgress(100);
            cardView.setVisibility(View.INVISIBLE);
            customEmptyView.setVisibility(View.VISIBLE);
            assert customEmptyView != null;
            customEmptyView.setEmptyImage(R.drawable.img_tips_error_no_downloads);
            customEmptyView.setEmptyText("没有找到你的缓存哟");

            cardView_ok.setVisibility(View.VISIBLE);
            customEmptyView_ok.setVisibility(View.INVISIBLE);

        }

    }

}

```
   ```已缓存```的代码，如下：
```JAVA
package com.example.longinusl33t.blive;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.format.Formatter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by wcy62 on 2017-05-31.
 */

public class Download_Ok extends Fragment{
    private CustomEmptyView customEmptyView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.layout_download_ok, null);

        customEmptyView = (CustomEmptyView) view.findViewById(R.id.empty_ok_layout);
        assert customEmptyView != null;
        customEmptyView.setEmptyImage(R.drawable.img_tips_error_no_downloads);
        customEmptyView.setEmptyText("没有找到你的缓存哟");

        return view;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}

```
##参考文献 Reference
1. [Material Design 中文版](http://wiki.jikexueyuan.com/project/material-design/)
2. [bilibili](http://www.bilibili.com/)

##评价和打分
   完成度：99%
   效果呈现度：95%（仍然有一些不足）
   动画效果呈现度：90%
   整体排版规范度：100%
   任务难度：50%
   小计：90分/100分
##总结
   本次分配的任务相较于其他人而言相对简单，主要是对于排版和字体排版要求较高，在动画交互上的要求不高，所以整体难度相对较低。个人主要时间也是主要花费在一些字体排版和线框排版的细节的处理上。由于本次项目为模仿的作品，所以只是尊重原作，在动画上并未处理过多，只增加了对```Tab的切换```的动画、```下载与暂停```和```Toolbar滚动的效果```动画效果，还通过编写一些工具类，从而获取本机的已用内存和所有内存。
   通过17周的Meternal Design的了解和学习，很多的细节上感觉在实际设计的时候并不能熟练的信手拈来，还是得需要一边研究一边练习。对于原型设计的整体实践下来，更多的感触便是Meternal Design在使用过程的便捷以及最终呈现出的效果惊人，具有美感；以及对于Android的设计和编写，进一步对安卓编写程序有了飞跃性的提升。