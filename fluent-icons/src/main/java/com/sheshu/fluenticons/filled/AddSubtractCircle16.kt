package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.AddSubtractCircle16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.AddSubtractCircle16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.5f, 10f)
            curveTo(9.224f, 10f, 9f, 10.224f, 9f, 10.5f)
            reflectiveCurveTo(9.224f, 11f, 9.5f, 11f)
            horizontalLineTo(12f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(12.276f, 10f, 12f, 10f)
            horizontalLineTo(9.5f)
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
            moveTo(3.5f, 6f)
            curveToRelative(0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
            horizontalLineToRelative(1f)
            verticalLineToRelative(-1f)
            curveTo(5f, 4.224f, 5.224f, 4f, 5.5f, 4f)
            reflectiveCurveTo(6f, 4.224f, 6f, 4.5f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(1f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(7.276f, 6.5f, 7f, 6.5f)
            horizontalLineTo(6f)
            verticalLineToRelative(0.8f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            reflectiveCurveTo(5f, 7.576f, 5f, 7.3f)
            verticalLineTo(6.5f)
            horizontalLineTo(4f)
            curveTo(3.724f, 6.5f, 3.5f, 6.276f, 3.5f, 6f)
            close()
        }
    }.build()
}
