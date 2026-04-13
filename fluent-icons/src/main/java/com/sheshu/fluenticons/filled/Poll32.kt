package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Poll32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Poll32",
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
            moveTo(25.5f, 9f)
            curveToRelative(-1.933f, 0f, -3.5f, 1.567f, -3.5f, 3.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 1.933f, 1.567f, 3.5f, 3.5f, 3.5f)
            reflectiveCurveToRelative(3.5f, -1.567f, 3.5f, -3.5f)
            verticalLineToRelative(-13f)
            curveToRelative(0f, -1.933f, -1.567f, -3.5f, -3.5f, -3.5f)
            close()
            moveTo(2f, 18.5f)
            curveTo(2f, 16.567f, 3.567f, 15f, 5.5f, 15f)
            reflectiveCurveTo(9f, 16.567f, 9f, 18.5f)
            verticalLineToRelative(7f)
            curveTo(9f, 27.433f, 7.433f, 29f, 5.5f, 29f)
            reflectiveCurveTo(2f, 27.433f, 2f, 25.5f)
            verticalLineToRelative(-7f)
            close()
        }
    }.build()
}
