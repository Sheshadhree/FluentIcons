package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PollOff32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PollOff32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(27.165f, 28.58f)
            lineToRelative(1.128f, 1.127f)
            curveToRelative(0.39f, 0.39f, 1.024f, 0.39f, 1.414f, 0f)
            curveToRelative(0.39f, -0.39f, 0.39f, -1.024f, 0f, -1.414f)
            lineToRelative(-26f, -26f)
            curveToRelative(-0.39f, -0.39f, -1.024f, -0.39f, -1.414f, 0f)
            curveToRelative(-0.39f, 0.39f, -0.39f, 1.024f, 0f, 1.414f)
            lineTo(12f, 13.415f)
            verticalLineTo(25.5f)
            curveToRelative(0f, 1.933f, 1.567f, 3.5f, 3.5f, 3.5f)
            reflectiveCurveToRelative(3.5f, -1.567f, 3.5f, -3.5f)
            verticalLineToRelative(-5.086f)
            lineToRelative(3f, 3f)
            verticalLineTo(25.5f)
            curveToRelative(0f, 1.933f, 1.567f, 3.5f, 3.5f, 3.5f)
            curveToRelative(0.603f, 0f, 1.17f, -0.152f, 1.665f, -0.42f)
            close()
            moveTo(22f, 18.464f)
            lineToRelative(7f, 7f)
            verticalLineTo(12.5f)
            curveToRelative(0f, -1.933f, -1.567f, -3.5f, -3.5f, -3.5f)
            reflectiveCurveTo(22f, 10.567f, 22f, 12.5f)
            verticalLineToRelative(5.965f)
            close()
            moveToRelative(-10f, -10f)
            lineToRelative(7f, 7f)
            verticalLineTo(6.5f)
            curveTo(19f, 4.567f, 17.433f, 3f, 15.5f, 3f)
            reflectiveCurveTo(12f, 4.567f, 12f, 6.5f)
            verticalLineToRelative(1.966f)
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
