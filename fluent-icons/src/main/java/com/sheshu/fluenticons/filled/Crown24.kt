package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Crown24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Crown24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14f, 5f)
            curveToRelative(0f, 0.53f, -0.206f, 1.012f, -0.543f, 1.37f)
            lineToRelative(2.624f, 3.28f)
            curveToRelative(0.073f, 0.092f, 0.201f, 0.12f, 0.307f, 0.068f)
            lineToRelative(2.65f, -1.326f)
            curveTo(19.014f, 8.265f, 19f, 8.134f, 19f, 8f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            reflectiveCurveToRelative(2f, 0.895f, 2f, 2f)
            curveToRelative(0f, 0.952f, -0.665f, 1.748f, -1.556f, 1.95f)
            lineToRelative(-1.804f, 9.623f)
            curveTo(19.485f, 20.4f, 18.762f, 21f, 17.92f, 21f)
            horizontalLineTo(6.08f)
            curveToRelative(-0.842f, 0f, -1.565f, -0.6f, -1.72f, -1.427f)
            lineTo(2.556f, 9.95f)
            curveTo(1.665f, 9.75f, 1f, 8.953f, 1f, 8f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            reflectiveCurveToRelative(2f, 0.895f, 2f, 2f)
            curveToRelative(0f, 0.134f, -0.013f, 0.265f, -0.038f, 0.392f)
            lineToRelative(2.65f, 1.326f)
            curveTo(7.718f, 9.77f, 7.846f, 9.742f, 7.92f, 9.65f)
            lineToRelative(2.624f, -3.28f)
            curveTo(10.206f, 6.012f, 10f, 5.53f, 10f, 5f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            reflectiveCurveToRelative(2f, 0.895f, 2f, 2f)
            close()
            moveToRelative(-2f, 12f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            reflectiveCurveToRelative(-0.895f, -2f, -2f, -2f)
            reflectiveCurveToRelative(-2f, 0.895f, -2f, 2f)
            reflectiveCurveToRelative(0.895f, 2f, 2f, 2f)
            close()
        }
    }.build()
}
