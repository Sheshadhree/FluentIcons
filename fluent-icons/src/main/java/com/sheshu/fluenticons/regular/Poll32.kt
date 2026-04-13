package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Poll32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Poll32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 6.5f)
            curveTo(12f, 4.567f, 13.567f, 3f, 15.5f, 3f)
            reflectiveCurveTo(19f, 4.567f, 19f, 6.5f)
            verticalLineToRelative(19f)
            curveToRelative(0f, 1.933f, -1.567f, 3.5f, -3.5f, 3.5f)
            reflectiveCurveTo(12f, 27.433f, 12f, 25.5f)
            verticalLineToRelative(-19f)
            close()
            moveTo(15.5f, 5f)
            curveTo(14.672f, 5f, 14f, 5.672f, 14f, 6.5f)
            verticalLineToRelative(19f)
            curveToRelative(0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-19f)
            curveTo(17f, 5.672f, 16.328f, 5f, 15.5f, 5f)
            close()
            moveToRelative(6.5f, 7.5f)
            curveToRelative(0f, -1.933f, 1.567f, -3.5f, 3.5f, -3.5f)
            reflectiveCurveToRelative(3.5f, 1.567f, 3.5f, 3.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 1.933f, -1.567f, 3.5f, -3.5f, 3.5f)
            reflectiveCurveTo(22f, 27.433f, 22f, 25.5f)
            verticalLineToRelative(-13f)
            close()
            moveToRelative(3.5f, -1.5f)
            curveToRelative(-0.828f, 0f, -1.5f, 0.672f, -1.5f, 1.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-13f)
            curveToRelative(0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
            close()
            moveToRelative(-20f, 4f)
            curveTo(3.567f, 15f, 2f, 16.567f, 2f, 18.5f)
            verticalLineToRelative(7f)
            curveTo(2f, 27.433f, 3.567f, 29f, 5.5f, 29f)
            reflectiveCurveTo(9f, 27.433f, 9f, 25.5f)
            verticalLineToRelative(-7f)
            curveTo(9f, 16.567f, 7.433f, 15f, 5.5f, 15f)
            close()
            moveTo(4f, 18.5f)
            curveTo(4f, 17.672f, 4.672f, 17f, 5.5f, 17f)
            reflectiveCurveTo(7f, 17.672f, 7f, 18.5f)
            verticalLineToRelative(7f)
            curveTo(7f, 26.328f, 6.328f, 27f, 5.5f, 27f)
            reflectiveCurveTo(4f, 26.328f, 4f, 25.5f)
            verticalLineToRelative(-7f)
            close()
        }
    }.build()
}
