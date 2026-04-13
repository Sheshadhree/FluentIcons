package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PersonAdd20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PersonAdd20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9f, 2f)
            curveTo(6.79f, 2f, 5f, 3.79f, 5f, 6f)
            reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
            reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
            reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
            close()
            moveToRelative(-4.991f, 9f)
            curveTo(2.903f, 11f, 2f, 11.887f, 2f, 13f)
            curveToRelative(0f, 1.691f, 0.833f, 2.966f, 2.135f, 3.797f)
            curveTo(5.417f, 17.614f, 7.145f, 18f, 9f, 18f)
            curveToRelative(0.41f, 0f, 0.816f, -0.019f, 1.21f, -0.057f)
            curveTo(9.454f, 17f, 9f, 15.803f, 9f, 14.5f)
            curveToRelative(0f, -1.33f, 0.472f, -2.55f, 1.257f, -3.5f)
            horizontalLineTo(4.01f)
            close()
            moveTo(14.5f, 19f)
            curveToRelative(2.485f, 0f, 4.5f, -2.015f, 4.5f, -4.5f)
            reflectiveCurveTo(16.985f, 10f, 14.5f, 10f)
            reflectiveCurveTo(10f, 12.015f, 10f, 14.5f)
            reflectiveCurveToRelative(2.015f, 4.5f, 4.5f, 4.5f)
            close()
            moveToRelative(0f, -7f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            verticalLineTo(14f)
            horizontalLineToRelative(1.5f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(16.776f, 15f, 16.5f, 15f)
            horizontalLineTo(15f)
            verticalLineToRelative(1.5f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            reflectiveCurveTo(14f, 16.776f, 14f, 16.5f)
            verticalLineTo(15f)
            horizontalLineToRelative(-1.5f)
            curveToRelative(-0.276f, 0f, -0.5f, -0.224f, -0.5f, -0.5f)
            reflectiveCurveToRelative(0.224f, -0.5f, 0.5f, -0.5f)
            horizontalLineTo(14f)
            verticalLineToRelative(-1.5f)
            curveToRelative(0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
            close()
        }
    }.build()
}
