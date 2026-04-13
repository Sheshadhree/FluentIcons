package com.sheshu.fluenticons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Light.Poll32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.Poll32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.5f, 3f)
            curveTo(17.433f, 3f, 19f, 4.567f, 19f, 6.5f)
            verticalLineToRelative(19f)
            curveToRelative(0f, 1.933f, -1.567f, 3.5f, -3.5f, 3.5f)
            reflectiveCurveTo(12f, 27.433f, 12f, 25.5f)
            verticalLineToRelative(-19f)
            curveTo(12f, 4.567f, 13.567f, 3f, 15.5f, 3f)
            close()
            moveToRelative(0f, 1f)
            curveTo(14.12f, 4f, 13f, 5.12f, 13f, 6.5f)
            verticalLineToRelative(19f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-19f)
            curveTo(18f, 5.12f, 16.88f, 4f, 15.5f, 4f)
            close()
            moveTo(29f, 12.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 1.933f, -1.567f, 3.5f, -3.5f, 3.5f)
            reflectiveCurveTo(22f, 27.433f, 22f, 25.5f)
            verticalLineToRelative(-13f)
            curveToRelative(0f, -1.933f, 1.567f, -3.5f, 3.5f, -3.5f)
            reflectiveCurveToRelative(3.5f, 1.567f, 3.5f, 3.5f)
            close()
            moveTo(25.5f, 10f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-13f)
            curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
            close()
            moveTo(9f, 25.5f)
            verticalLineToRelative(-7f)
            curveTo(9f, 16.567f, 7.433f, 15f, 5.5f, 15f)
            reflectiveCurveTo(2f, 16.567f, 2f, 18.5f)
            verticalLineToRelative(7f)
            curveTo(2f, 27.433f, 3.567f, 29f, 5.5f, 29f)
            reflectiveCurveTo(9f, 27.433f, 9f, 25.5f)
            close()
            moveToRelative(-6f, -7f)
            curveTo(3f, 17.12f, 4.12f, 16f, 5.5f, 16f)
            reflectiveCurveTo(8f, 17.12f, 8f, 18.5f)
            verticalLineToRelative(7f)
            curveTo(8f, 26.88f, 6.88f, 28f, 5.5f, 28f)
            reflectiveCurveTo(3f, 26.88f, 3f, 25.5f)
            verticalLineToRelative(-7f)
            close()
        }
    }.build()
}
