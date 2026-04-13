package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.AddSubtractCircle16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.AddSubtractCircle16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9f, 10.5f)
            curveTo(9f, 10.224f, 9.224f, 10f, 9.5f, 10f)
            horizontalLineTo(12f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(12.276f, 11f, 12f, 11f)
            horizontalLineTo(9.5f)
            curveTo(9.224f, 11f, 9f, 10.776f, 9f, 10.5f)
            close()
            moveToRelative(-3f, -6f)
            curveTo(6f, 4.224f, 5.776f, 4f, 5.5f, 4f)
            reflectiveCurveTo(5f, 4.224f, 5f, 4.5f)
            verticalLineToRelative(1f)
            horizontalLineTo(4f)
            curveTo(3.724f, 5.5f, 3.5f, 5.724f, 3.5f, 6f)
            reflectiveCurveTo(3.724f, 6.5f, 4f, 6.5f)
            horizontalLineToRelative(1f)
            verticalLineToRelative(0.8f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveTo(6f, 7.576f, 6f, 7.3f)
            verticalLineTo(6.5f)
            horizontalLineToRelative(1f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(7.276f, 5.5f, 7f, 5.5f)
            horizontalLineTo(6f)
            verticalLineToRelative(-1f)
            close()
            moveTo(8f, 15f)
            curveToRelative(3.866f, 0f, 7f, -3.134f, 7f, -7f)
            reflectiveCurveToRelative(-3.134f, -7f, -7f, -7f)
            reflectiveCurveToRelative(-7f, 3.134f, -7f, 7f)
            reflectiveCurveToRelative(3.134f, 7f, 7f, 7f)
            close()
            moveToRelative(0f, -1f)
            curveToRelative(-1.477f, 0f, -2.83f, -0.534f, -3.874f, -1.418f)
            lineToRelative(8.456f, -8.456f)
            curveTo(13.466f, 5.17f, 14f, 6.523f, 14f, 8f)
            curveToRelative(0f, 3.314f, -2.686f, 6f, -6f, 6f)
            close()
            moveToRelative(-4.582f, -2.126f)
            curveTo(2.534f, 10.83f, 2f, 9.477f, 2f, 8f)
            curveToRelative(0f, -3.314f, 2.686f, -6f, 6f, -6f)
            curveToRelative(1.477f, 0f, 2.83f, 0.534f, 3.874f, 1.418f)
            lineToRelative(-8.456f, 8.456f)
            close()
        }
    }.build()
}
