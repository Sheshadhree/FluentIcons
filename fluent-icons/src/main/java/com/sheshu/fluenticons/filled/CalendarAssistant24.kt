package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CalendarAssistant24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CalendarAssistant24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(21f, 8.5f)
            verticalLineToRelative(3.522f)
            curveTo(19.99f, 11.375f, 18.789f, 11f, 17.5f, 11f)
            curveToRelative(-3.59f, 0f, -6.5f, 2.91f, -6.5f, 6.5f)
            curveToRelative(0f, 1.289f, 0.375f, 2.49f, 1.022f, 3.5f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
            verticalLineTo(8.5f)
            horizontalLineToRelative(18f)
            close()
            moveTo(17.75f, 3f)
            curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
            verticalLineTo(7f)
            horizontalLineTo(3f)
            verticalLineTo(6.25f)
            curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
            horizontalLineToRelative(11.5f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.5f, 23f)
            curveToRelative(3.038f, 0f, 5.5f, -2.462f, 5.5f, -5.5f)
            reflectiveCurveTo(20.538f, 12f, 17.5f, 12f)
            reflectiveCurveTo(12f, 14.462f, 12f, 17.5f)
            reflectiveCurveToRelative(2.462f, 5.5f, 5.5f, 5.5f)
            close()
            moveToRelative(-0.404f, -9f)
            horizontalLineToRelative(1.433f)
            curveToRelative(0.349f, 0f, 0.59f, 0.349f, 0.468f, 0.676f)
            lineTo(18.5f, 16f)
            horizontalLineToRelative(0.634f)
            curveToRelative(0.373f, 0f, 0.597f, 0.413f, 0.394f, 0.726f)
            lineToRelative(-2.625f, 4.038f)
            curveTo(16.808f, 20.911f, 16.644f, 21f, 16.47f, 21f)
            curveToRelative(-0.354f, 0f, -0.604f, -0.346f, -0.492f, -0.682f)
            lineTo(16.75f, 18f)
            horizontalLineToRelative(-0.778f)
            curveToRelative(-0.35f, 0f, -0.591f, -0.349f, -0.469f, -0.676f)
            lineToRelative(1.125f, -3f)
            curveTo(16.701f, 14.13f, 16.888f, 14f, 17.096f, 14f)
            close()
        }
    }.build()
}
