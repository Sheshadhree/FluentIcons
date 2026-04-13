package com.sheshu.fluenticons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Light.Important32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.Important32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16f, 2f)
            curveToRelative(-3.314f, 0f, -6f, 2.686f, -6f, 6f)
            curveToRelative(0f, 3.523f, 1.986f, 8.536f, 3.16f, 11.19f)
            curveTo(13.654f, 20.31f, 14.773f, 21f, 16f, 21f)
            curveToRelative(1.226f, 0f, 2.345f, -0.69f, 2.84f, -1.81f)
            curveTo(20.015f, 16.535f, 22f, 11.522f, 22f, 8f)
            curveToRelative(0f, -3.314f, -2.686f, -6f, -6f, -6f)
            close()
            moveToRelative(-5f, 6f)
            curveToRelative(0f, -2.761f, 2.239f, -5f, 5f, -5f)
            reflectiveCurveToRelative(5f, 2.239f, 5f, 5f)
            curveToRelative(0f, 1.605f, -0.459f, 3.622f, -1.093f, 5.618f)
            curveToRelative(-0.628f, 1.978f, -1.402f, 3.859f, -1.98f, 5.167f)
            curveTo(17.6f, 19.524f, 16.852f, 20f, 16f, 20f)
            reflectiveCurveToRelative(-1.6f, -0.476f, -1.926f, -1.215f)
            curveToRelative(-0.579f, -1.308f, -1.353f, -3.189f, -1.981f, -5.167f)
            curveTo(11.459f, 11.622f, 11f, 9.605f, 11f, 8f)
            close()
            moveToRelative(8f, 19f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.343f, -3f, -3f)
            reflectiveCurveToRelative(1.343f, -3f, 3f, -3f)
            reflectiveCurveToRelative(3f, 1.343f, 3f, 3f)
            close()
            moveToRelative(-1f, 0f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            reflectiveCurveToRelative(-2f, 0.895f, -2f, 2f)
            reflectiveCurveToRelative(0.895f, 2f, 2f, 2f)
            reflectiveCurveToRelative(2f, -0.895f, 2f, -2f)
            close()
        }
    }.build()
}
