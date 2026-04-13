package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowCounterclockwise12: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowCounterclockwise12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 2.5f)
            curveTo(2f, 2.224f, 2.224f, 2f, 2.5f, 2f)
            reflectiveCurveTo(3f, 2.224f, 3f, 2.5f)
            verticalLineToRelative(0.854f)
            curveTo(3.733f, 2.524f, 4.805f, 2f, 6f, 2f)
            curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
            reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
            curveToRelative(-2.025f, 0f, -3.698f, -1.504f, -3.963f, -3.456f)
            curveTo(1.997f, 6.246f, 2.244f, 6f, 2.545f, 6f)
            curveToRelative(0.252f, 0f, 0.451f, 0.205f, 0.489f, 0.453f)
            curveTo(3.252f, 7.895f, 4.497f, 9f, 6f, 9f)
            curveToRelative(1.657f, 0f, 3f, -1.343f, 3f, -3f)
            reflectiveCurveTo(7.657f, 3f, 6f, 3f)
            curveTo(5.112f, 3f, 4.313f, 3.386f, 3.764f, 4f)
            horizontalLineTo(4.5f)
            curveTo(4.776f, 4f, 5f, 4.224f, 5f, 4.5f)
            reflectiveCurveTo(4.776f, 5f, 4.5f, 5f)
            horizontalLineToRelative(-2f)
            curveTo(2.224f, 5f, 2f, 4.776f, 2f, 4.5f)
            verticalLineToRelative(-2f)
            close()
        }
    }.build()
}
