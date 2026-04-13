package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowCircleDownRight12: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowCircleDownRight12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 1f)
            curveToRelative(2.761f, 0f, 5f, 2.239f, 5f, 5f)
            reflectiveCurveToRelative(-2.239f, 5f, -5f, 5f)
            reflectiveCurveToRelative(-5f, -2.239f, -5f, -5f)
            reflectiveCurveToRelative(2.239f, -5f, 5f, -5f)
            close()
            moveToRelative(0f, 1f)
            curveTo(3.79f, 2f, 2f, 3.79f, 2f, 6f)
            reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
            reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
            reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
            close()
            moveToRelative(1.5f, 2f)
            curveTo(7.776f, 4f, 8f, 4.224f, 8f, 4.5f)
            verticalLineToRelative(3f)
            curveTo(8f, 7.776f, 7.776f, 8f, 7.5f, 8f)
            horizontalLineToRelative(-3f)
            curveTo(4.224f, 8f, 4f, 7.776f, 4f, 7.5f)
            reflectiveCurveTo(4.224f, 7f, 4.5f, 7f)
            horizontalLineToRelative(1.793f)
            lineTo(4.146f, 4.854f)
            lineTo(4.082f, 4.775f)
            curveTo(3.954f, 4.581f, 3.976f, 4.317f, 4.146f, 4.146f)
            curveToRelative(0.171f, -0.17f, 0.435f, -0.192f, 0.63f, -0.064f)
            lineToRelative(0.078f, 0.064f)
            lineTo(7f, 6.293f)
            verticalLineTo(4.5f)
            curveTo(7f, 4.224f, 7.224f, 4f, 7.5f, 4f)
            close()
        }
    }.build()
}
