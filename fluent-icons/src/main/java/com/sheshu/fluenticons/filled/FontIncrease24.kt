package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.FontIncrease24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.FontIncrease24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16.625f, 5.78f)
            curveToRelative(-0.432f, 0.346f, -1.06f, 0.276f, -1.406f, -0.155f)
            curveToRelative(-0.345f, -0.432f, -0.275f, -1.06f, 0.156f, -1.406f)
            lineToRelative(2.5f, -2f)
            curveToRelative(0.366f, -0.292f, 0.884f, -0.292f, 1.25f, 0f)
            lineToRelative(2.5f, 2f)
            curveToRelative(0.43f, 0.345f, 0.5f, 0.974f, 0.156f, 1.406f)
            curveToRelative(-0.345f, 0.43f, -0.974f, 0.5f, -1.406f, 0.156f)
            lineTo(18.5f, 4.28f)
            lineToRelative(-1.875f, 1.5f)
            close()
            moveToRelative(-3.706f, -1.174f)
            curveTo(12.762f, 4.24f, 12.4f, 4f, 12f, 4f)
            reflectiveCurveToRelative(-0.76f, 0.24f, -0.919f, 0.606f)
            lineToRelative(-6f, 14f)
            curveTo(4.864f, 19.113f, 5.1f, 19.7f, 5.606f, 19.919f)
            curveToRelative(0.508f, 0.217f, 1.096f, -0.018f, 1.313f, -0.525f)
            lineTo(8.803f, 15f)
            horizontalLineToRelative(6.395f)
            lineToRelative(1.883f, 4.394f)
            curveToRelative(0.218f, 0.507f, 0.806f, 0.742f, 1.313f, 0.525f)
            curveToRelative(0.508f, -0.218f, 0.743f, -0.806f, 0.525f, -1.313f)
            lineToRelative(-6f, -14f)
            close()
            moveTo(12f, 7.54f)
            lineTo(14.34f, 13f)
            horizontalLineTo(9.66f)
            lineTo(12f, 7.54f)
            close()
        }
    }.build()
}
