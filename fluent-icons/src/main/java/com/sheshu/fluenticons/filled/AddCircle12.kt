package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.AddCircle12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.AddCircle12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(1f, 6f)
            curveToRelative(0f, -2.761f, 2.239f, -5f, 5f, -5f)
            reflectiveCurveToRelative(5f, 2.239f, 5f, 5f)
            reflectiveCurveToRelative(-2.239f, 5f, -5f, 5f)
            reflectiveCurveToRelative(-5f, -2.239f, -5f, -5f)
            close()
            moveToRelative(5f, -2.5f)
            curveToRelative(-0.23f, 0f, -0.417f, 0.187f, -0.417f, 0.417f)
            verticalLineToRelative(1.666f)
            horizontalLineTo(3.917f)
            curveTo(3.687f, 5.583f, 3.5f, 5.77f, 3.5f, 6f)
            curveToRelative(0f, 0.23f, 0.187f, 0.417f, 0.417f, 0.417f)
            horizontalLineToRelative(1.666f)
            verticalLineToRelative(1.666f)
            curveTo(5.583f, 8.313f, 5.77f, 8.5f, 6f, 8.5f)
            curveToRelative(0.23f, 0f, 0.417f, -0.187f, 0.417f, -0.417f)
            verticalLineTo(6.417f)
            horizontalLineToRelative(1.666f)
            curveTo(8.313f, 6.417f, 8.5f, 6.23f, 8.5f, 6f)
            curveToRelative(0f, -0.23f, -0.187f, -0.417f, -0.417f, -0.417f)
            horizontalLineTo(6.417f)
            verticalLineTo(3.917f)
            curveTo(6.417f, 3.687f, 6.23f, 3.5f, 6f, 3.5f)
            close()
        }
    }.build()
}
