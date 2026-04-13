package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Heart32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Heart32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.384f, 7.13f)
            curveTo(6.356f, 2.96f, 12.55f, 2.957f, 15.53f, 7.123f)
            lineToRelative(0.465f, 0.65f)
            lineToRelative(0.417f, -0.593f)
            curveToRelative(2.955f, -4.195f, 9.16f, -4.236f, 12.17f, -0.081f)
            curveToRelative(2.098f, 2.895f, 1.854f, 6.87f, -0.583f, 9.485f)
            lineTo(16.732f, 28.681f)
            curveTo(16.543f, 28.884f, 16.278f, 29f, 16f, 29f)
            curveToRelative(-0.278f, 0f, -0.543f, -0.116f, -0.732f, -0.32f)
            lineTo(3.992f, 16.54f)
            curveToRelative(-2.41f, -2.595f, -2.664f, -6.526f, -0.608f, -9.41f)
            close()
            moveToRelative(10.52f, 1.155f)
            curveToRelative(-2.181f, -3.05f, -6.716f, -3.046f, -8.892f, 0.007f)
            curveToRelative(-1.504f, 2.11f, -1.318f, 4.988f, 0.446f, 6.887f)
            lineTo(16.002f, 26.53f)
            lineToRelative(10.534f, -11.31f)
            curveToRelative(1.785f, -1.917f, 1.964f, -4.829f, 0.427f, -6.95f)
            curveToRelative(-2.205f, -3.044f, -6.751f, -3.014f, -8.916f, 0.06f)
            lineToRelative(-1.229f, 1.744f)
            curveToRelative(-0.186f, 0.265f, -0.49f, 0.423f, -0.814f, 0.425f)
            curveToRelative(-0.324f, 0f, -0.628f, -0.155f, -0.817f, -0.419f)
            lineToRelative(-1.284f, -1.796f)
            close()
        }
    }.build()
}
