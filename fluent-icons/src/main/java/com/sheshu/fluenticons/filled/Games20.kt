package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Games20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Games20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.5f, 4f)
            curveTo(4.462f, 4f, 2f, 6.462f, 2f, 9.5f)
            reflectiveCurveTo(4.462f, 15f, 7.5f, 15f)
            horizontalLineToRelative(5f)
            curveToRelative(3.038f, 0f, 5.5f, -2.462f, 5.5f, -5.5f)
            reflectiveCurveTo(15.538f, 4f, 12.5f, 4f)
            horizontalLineToRelative(-5f)
            close()
            moveTo(6f, 7.5f)
            curveTo(6f, 7.224f, 6.224f, 7f, 6.5f, 7f)
            reflectiveCurveTo(7f, 7.224f, 7f, 7.5f)
            verticalLineTo(9f)
            horizontalLineToRelative(1.5f)
            curveTo(8.776f, 9f, 9f, 9.224f, 9f, 9.5f)
            reflectiveCurveTo(8.776f, 10f, 8.5f, 10f)
            horizontalLineTo(7f)
            verticalLineToRelative(1.5f)
            curveTo(7f, 11.776f, 6.776f, 12f, 6.5f, 12f)
            reflectiveCurveTo(6f, 11.776f, 6f, 11.5f)
            verticalLineTo(10f)
            horizontalLineTo(4.5f)
            curveTo(4.224f, 10f, 4f, 9.776f, 4f, 9.5f)
            reflectiveCurveTo(4.224f, 9f, 4.5f, 9f)
            horizontalLineTo(6f)
            verticalLineTo(7.5f)
            close()
            moveTo(15f, 8f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            reflectiveCurveToRelative(-1f, -0.448f, -1f, -1f)
            reflectiveCurveToRelative(0.448f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.448f, 1f, 1f)
            close()
            moveToRelative(-3f, 4f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            reflectiveCurveToRelative(0.448f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.448f, 1f, 1f)
            reflectiveCurveToRelative(-0.448f, 1f, -1f, 1f)
            close()
        }
    }.build()
}
