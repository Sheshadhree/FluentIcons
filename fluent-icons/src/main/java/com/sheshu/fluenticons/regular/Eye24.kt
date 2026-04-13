package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Eye24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Eye24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 9.005f)
            curveToRelative(2.209f, 0f, 4f, 1.79f, 4f, 4f)
            curveToRelative(0f, 2.209f, -1.791f, 4f, -4f, 4f)
            curveToRelative(-2.21f, 0f, -4f, -1.791f, -4f, -4f)
            curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
            close()
            moveToRelative(0f, 1.5f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.119f, -2.5f, 2.5f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
            curveToRelative(0f, -1.381f, -1.12f, -2.5f, -2.5f, -2.5f)
            close()
            moveTo(12f, 5.5f)
            curveToRelative(4.613f, 0f, 8.596f, 3.15f, 9.701f, 7.564f)
            curveToRelative(0.1f, 0.402f, -0.144f, 0.81f, -0.545f, 0.91f)
            curveToRelative(-0.402f, 0.1f, -0.81f, -0.143f, -0.91f, -0.545f)
            curveTo(19.307f, 9.678f, 15.92f, 7f, 12f, 7f)
            curveToRelative(-3.923f, 0f, -7.31f, 2.68f, -8.247f, 6.433f)
            curveToRelative(-0.1f, 0.402f, -0.508f, 0.646f, -0.91f, 0.546f)
            curveToRelative(-0.401f, -0.1f, -0.646f, -0.507f, -0.546f, -0.91f)
            curveTo(3.4f, 8.654f, 7.384f, 5.5f, 12f, 5.5f)
            close()
        }
    }.build()
}
