package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CalendarArrowRight20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CalendarArrowRight20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17f, 5.5f)
            curveTo(17f, 4.12f, 15.88f, 3f, 14.5f, 3f)
            horizontalLineToRelative(-9f)
            curveTo(4.12f, 3f, 3f, 4.12f, 3f, 5.5f)
            verticalLineTo(6f)
            horizontalLineToRelative(14f)
            verticalLineTo(5.5f)
            close()
            moveToRelative(0f, 4.1f)
            verticalLineTo(7f)
            horizontalLineTo(3f)
            verticalLineToRelative(7.5f)
            curveTo(3f, 15.88f, 4.12f, 17f, 5.5f, 17f)
            horizontalLineToRelative(4.1f)
            curveTo(9.216f, 16.25f, 9f, 15.4f, 9f, 14.5f)
            curveTo(9f, 11.462f, 11.462f, 9f, 14.5f, 9f)
            curveToRelative(0.9f, 0f, 1.75f, 0.216f, 2.5f, 0.6f)
            close()
            moveToRelative(2f, 4.9f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            reflectiveCurveTo(10f, 16.985f, 10f, 14.5f)
            reflectiveCurveToRelative(2.015f, -4.5f, 4.5f, -4.5f)
            reflectiveCurveToRelative(4.5f, 2.015f, 4.5f, 4.5f)
            close()
            moveToRelative(-2.147f, 0.354f)
            lineToRelative(0.003f, -0.003f)
            curveToRelative(0.047f, -0.047f, 0.082f, -0.102f, 0.106f, -0.16f)
            curveTo(16.986f, 14.633f, 17f, 14.57f, 17f, 14.503f)
            verticalLineToRelative(-0.006f)
            curveToRelative(0f, -0.067f, -0.014f, -0.13f, -0.038f, -0.188f)
            curveToRelative(-0.024f, -0.06f, -0.06f, -0.115f, -0.108f, -0.163f)
            lineToRelative(-2f, -2f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.708f)
            lineTo(15.293f, 14f)
            horizontalLineTo(12.5f)
            curveToRelative(-0.276f, 0f, -0.5f, 0.224f, -0.5f, 0.5f)
            reflectiveCurveToRelative(0.224f, 0.5f, 0.5f, 0.5f)
            horizontalLineToRelative(2.793f)
            lineToRelative(-1.147f, 1.146f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.708f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            lineToRelative(2f, -2f)
            close()
        }
    }.build()
}
