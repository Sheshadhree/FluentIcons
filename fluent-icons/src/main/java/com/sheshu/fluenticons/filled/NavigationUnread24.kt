package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.NavigationUnread24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.NavigationUnread24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(19.25f, 8.5f)
            curveTo(20.769f, 8.5f, 22f, 7.269f, 22f, 5.75f)
            reflectiveCurveTo(20.769f, 3f, 19.25f, 3f)
            reflectiveCurveTo(16.5f, 4.231f, 16.5f, 5.75f)
            reflectiveCurveToRelative(1.231f, 2.75f, 2.75f, 2.75f)
            close()
            moveTo(15.713f, 7f)
            curveTo(15.575f, 6.609f, 15.5f, 6.188f, 15.5f, 5.75f)
            curveToRelative(0f, -0.257f, 0.026f, -0.508f, 0.075f, -0.75f)
            horizontalLineTo(3f)
            lineTo(2.883f, 5.007f)
            curveTo(2.386f, 5.065f, 2f, 5.487f, 2f, 6f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(12.713f)
            close()
            moveTo(21f, 17f)
            horizontalLineTo(3f)
            lineToRelative(-0.117f, 0.007f)
            curveTo(2.386f, 17.064f, 2f, 17.487f, 2f, 18f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(18f)
            lineToRelative(0.117f, -0.007f)
            curveTo(21.614f, 18.936f, 22f, 18.513f, 22f, 18f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            close()
            moveTo(3f, 11f)
            lineToRelative(18f, -0.002f)
            curveToRelative(0.552f, 0f, 1f, 0.447f, 1f, 1f)
            curveToRelative(0f, 0.513f, -0.386f, 0.935f, -0.883f, 0.993f)
            lineTo(21f, 12.998f)
            lineTo(3f, 13f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            curveToRelative(0f, -0.513f, 0.386f, -0.935f, 0.883f, -0.993f)
            lineTo(3f, 11f)
            close()
        }
    }.build()
}
