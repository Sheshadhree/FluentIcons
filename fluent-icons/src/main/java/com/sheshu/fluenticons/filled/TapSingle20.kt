package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TapSingle20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TapSingle20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 8.5f)
            curveTo(6f, 6.567f, 7.567f, 5f, 9.5f, 5f)
            reflectiveCurveTo(13f, 6.567f, 13f, 8.5f)
            curveToRelative(0f, 0.054f, -0.001f, 0.107f, -0.004f, 0.16f)
            lineToRelative(0.992f, 0.174f)
            curveTo(13.996f, 8.724f, 14f, 8.612f, 14f, 8.5f)
            curveTo(14f, 6.015f, 11.985f, 4f, 9.5f, 4f)
            reflectiveCurveTo(5f, 6.015f, 5f, 8.5f)
            curveToRelative(0f, 0.648f, 0.137f, 1.264f, 0.384f, 1.821f)
            curveToRelative(0.308f, -0.08f, 0.623f, -0.123f, 0.94f, -0.133f)
            lineToRelative(0.108f, -0.002f)
            curveTo(6.157f, 9.686f, 6f, 9.111f, 6f, 8.5f)
            close()
            moveTo(9.5f, 6f)
            curveTo(8.672f, 6f, 8f, 6.672f, 8f, 7.5f)
            verticalLineToRelative(4.251f)
            curveToRelative(-0.584f, -0.197f, -1.243f, -0.316f, -1.866f, -0.248f)
            curveToRelative(-0.458f, 0.05f, -0.916f, 0.201f, -1.301f, 0.515f)
            curveToRelative(-0.39f, 0.317f, -0.67f, 0.77f, -0.818f, 1.36f)
            curveToRelative(-0.035f, 0.14f, -0.008f, 0.289f, 0.075f, 0.407f)
            curveToRelative(0.082f, 0.119f, 0.211f, 0.196f, 0.355f, 0.212f)
            curveToRelative(2.592f, 0.288f, 3.914f, 1.7f, 4.553f, 2.728f)
            curveToRelative(0.48f, 0.772f, 1.41f, 1.407f, 2.435f, 1.229f)
            lineToRelative(1.517f, -0.264f)
            curveToRelative(0.879f, -0.153f, 1.61f, -0.762f, 1.918f, -1.599f)
            lineToRelative(0.983f, -2.67f)
            curveToRelative(0.54f, -1.463f, -0.378f, -3.058f, -1.914f, -3.327f)
            lineTo(11f, 9.58f)
            verticalLineTo(7.5f)
            curveTo(11f, 6.672f, 10.33f, 6f, 9.5f, 6f)
            close()
        }
    }.build()
}
