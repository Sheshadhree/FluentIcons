package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowCircleDownRight12: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowCircleDownRight12",
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
            moveToRelative(1.5f, 3f)
            curveTo(7.224f, 4f, 7f, 4.224f, 7f, 4.5f)
            verticalLineToRelative(1.793f)
            lineTo(4.854f, 4.146f)
            lineTo(4.775f, 4.082f)
            curveTo(4.581f, 3.954f, 4.317f, 3.976f, 4.146f, 4.146f)
            curveToRelative(-0.17f, 0.171f, -0.192f, 0.435f, -0.064f, 0.63f)
            lineToRelative(0.064f, 0.078f)
            lineTo(6.293f, 7f)
            horizontalLineTo(4.5f)
            curveTo(4.224f, 7f, 4f, 7.224f, 4f, 7.5f)
            reflectiveCurveTo(4.224f, 8f, 4.5f, 8f)
            horizontalLineToRelative(3f)
            curveTo(7.776f, 8f, 8f, 7.776f, 8f, 7.5f)
            verticalLineToRelative(-3f)
            curveTo(8f, 4.224f, 7.776f, 4f, 7.5f, 4f)
            close()
        }
    }.build()
}
