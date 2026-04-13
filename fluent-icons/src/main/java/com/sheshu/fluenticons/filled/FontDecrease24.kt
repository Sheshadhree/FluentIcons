package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.FontDecrease24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.FontDecrease24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16.625f, 2.22f)
            curveToRelative(-0.431f, -0.346f, -1.06f, -0.276f, -1.406f, 0.155f)
            curveToRelative(-0.345f, 0.432f, -0.275f, 1.06f, 0.157f, 1.406f)
            lineToRelative(2.5f, 2f)
            curveToRelative(0.365f, 0.292f, 0.883f, 0.292f, 1.249f, 0f)
            lineToRelative(2.5f, -2f)
            curveToRelative(0.43f, -0.345f, 0.5f, -0.974f, 0.156f, -1.406f)
            curveToRelative(-0.345f, -0.43f, -0.974f, -0.5f, -1.406f, -0.156f)
            lineTo(18.5f, 3.72f)
            lineToRelative(-1.875f, -1.5f)
            close()
            moveTo(12f, 4f)
            curveToRelative(0.4f, 0f, 0.762f, 0.238f, 0.92f, 0.606f)
            lineToRelative(5.999f, 14f)
            curveToRelative(0.218f, 0.507f, -0.018f, 1.095f, -0.525f, 1.313f)
            curveToRelative(-0.508f, 0.217f, -1.096f, -0.018f, -1.313f, -0.525f)
            lineTo(15.198f, 15f)
            horizontalLineTo(8.802f)
            lineTo(6.92f, 19.394f)
            curveToRelative(-0.217f, 0.507f, -0.805f, 0.742f, -1.313f, 0.525f)
            curveTo(5.1f, 19.7f, 4.864f, 19.113f, 5.081f, 18.606f)
            lineToRelative(6f, -14f)
            curveTo(11.239f, 4.238f, 11.6f, 4f, 12f, 4f)
            close()
            moveToRelative(0f, 3.538f)
            lineTo(9.66f, 13f)
            horizontalLineToRelative(4.68f)
            lineTo(12f, 7.538f)
            close()
        }
    }.build()
}
