package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Delete16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Delete16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7f, 3f)
            horizontalLineToRelative(2f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            reflectiveCurveTo(7f, 2.448f, 7f, 3f)
            close()
            moveTo(6f, 3f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            reflectiveCurveToRelative(2f, 0.895f, 2f, 2f)
            horizontalLineToRelative(4f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(14.276f, 4f, 14f, 4f)
            horizontalLineToRelative(-0.564f)
            lineToRelative(-1.205f, 8.838f)
            curveTo(12.062f, 14.077f, 11.004f, 15f, 9.754f, 15f)
            horizontalLineTo(6.246f)
            curveToRelative(-1.25f, 0f, -2.308f, -0.924f, -2.477f, -2.162f)
            lineTo(2.563f, 4f)
            horizontalLineTo(2f)
            curveTo(1.724f, 4f, 1.5f, 3.776f, 1.5f, 3.5f)
            reflectiveCurveTo(1.724f, 3f, 2f, 3f)
            horizontalLineToRelative(4f)
            close()
            moveToRelative(1f, 3.5f)
            curveTo(7f, 6.224f, 6.776f, 6f, 6.5f, 6f)
            reflectiveCurveTo(6f, 6.224f, 6f, 6.5f)
            verticalLineToRelative(5f)
            curveTo(6f, 11.776f, 6.224f, 12f, 6.5f, 12f)
            reflectiveCurveTo(7f, 11.776f, 7f, 11.5f)
            verticalLineToRelative(-5f)
            close()
            moveTo(9.5f, 6f)
            curveTo(9.224f, 6f, 9f, 6.224f, 9f, 6.5f)
            verticalLineToRelative(5f)
            curveTo(9f, 11.776f, 9.224f, 12f, 9.5f, 12f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineToRelative(-5f)
            curveTo(10f, 6.224f, 9.776f, 6f, 9.5f, 6f)
            close()
        }
    }.build()
}
