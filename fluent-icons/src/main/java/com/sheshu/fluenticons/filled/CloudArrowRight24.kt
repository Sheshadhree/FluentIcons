package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CloudArrowRight24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CloudArrowRight24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 3f)
            curveTo(9.02f, 3f, 6.548f, 5.172f, 6.08f, 8.02f)
            curveTo(3.792f, 8.23f, 2f, 10.155f, 2f, 12.5f)
            curveTo(2f, 14.985f, 4.015f, 17f, 6.5f, 17f)
            horizontalLineToRelative(3.519f)
            curveTo(10.006f, 16.835f, 10f, 16.668f, 10f, 16.5f)
            curveToRelative(0f, -3.59f, 2.91f, -6.5f, 6.5f, -6.5f)
            curveToRelative(2.298f, 0f, 4.317f, 1.193f, 5.473f, 2.992f)
            curveTo(21.991f, 12.832f, 22f, 12.666f, 22f, 12.5f)
            curveToRelative(0f, -2.344f, -1.791f, -4.269f, -4.08f, -4.48f)
            curveTo(17.452f, 5.171f, 14.98f, 3f, 12f, 3f)
            close()
            moveToRelative(4.5f, 8f)
            curveToRelative(3.038f, 0f, 5.5f, 2.462f, 5.5f, 5.5f)
            reflectiveCurveTo(19.538f, 22f, 16.5f, 22f)
            reflectiveCurveTo(11f, 19.538f, 11f, 16.5f)
            reflectiveCurveToRelative(2.462f, -5.5f, 5.5f, -5.5f)
            close()
            moveToRelative(-3f, 5f)
            curveToRelative(-0.276f, 0f, -0.5f, 0.224f, -0.5f, 0.5f)
            reflectiveCurveToRelative(0.224f, 0.5f, 0.5f, 0.5f)
            horizontalLineToRelative(4.793f)
            lineToRelative(-1.647f, 1.646f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.708f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            lineToRelative(2.5f, -2.5f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            lineToRelative(-2.5f, -2.5f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.708f)
            lineTo(18.293f, 16f)
            horizontalLineTo(13.5f)
            close()
        }
    }.build()
}
