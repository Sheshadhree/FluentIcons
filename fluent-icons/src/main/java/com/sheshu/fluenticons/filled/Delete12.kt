package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Delete12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Delete12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5f, 3f)
            horizontalLineToRelative(2f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            reflectiveCurveTo(5f, 2.448f, 5f, 3f)
            close()
            moveTo(4f, 3f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            reflectiveCurveToRelative(2f, 0.895f, 2f, 2f)
            horizontalLineToRelative(2.5f)
            curveTo(10.776f, 3f, 11f, 3.224f, 11f, 3.5f)
            reflectiveCurveTo(10.776f, 4f, 10.5f, 4f)
            horizontalLineToRelative(-0.441f)
            lineTo(9.616f, 9.17f)
            curveTo(9.527f, 10.206f, 8.66f, 11f, 7.623f, 11f)
            horizontalLineTo(4.377f)
            curveToRelative(-1.038f, 0f, -1.904f, -0.795f, -1.993f, -1.83f)
            lineTo(1.941f, 4f)
            horizontalLineTo(1.5f)
            curveTo(1.224f, 4f, 1f, 3.776f, 1f, 3.5f)
            reflectiveCurveTo(1.224f, 3f, 1.5f, 3f)
            horizontalLineTo(4f)
            close()
            moveToRelative(3.5f, 3f)
            curveToRelative(0f, -0.276f, -0.224f, -0.5f, -0.5f, -0.5f)
            reflectiveCurveTo(6.5f, 5.724f, 6.5f, 6f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveTo(7.5f, 8.276f, 7.5f, 8f)
            verticalLineTo(6f)
            close()
            moveTo(5f, 5.5f)
            curveTo(4.724f, 5.5f, 4.5f, 5.724f, 4.5f, 6f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveTo(5.5f, 8.276f, 5.5f, 8f)
            verticalLineTo(6f)
            curveToRelative(0f, -0.276f, -0.224f, -0.5f, -0.5f, -0.5f)
            close()
        }
    }.build()
}
