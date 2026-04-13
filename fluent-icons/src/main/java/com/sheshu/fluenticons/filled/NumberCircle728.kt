package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.NumberCircle728: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.NumberCircle728",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 14f)
            curveTo(2f, 7.373f, 7.373f, 2f, 14f, 2f)
            reflectiveCurveToRelative(12f, 5.373f, 12f, 12f)
            reflectiveCurveToRelative(-5.373f, 12f, -12f, 12f)
            reflectiveCurveTo(2f, 20.627f, 2f, 14f)
            close()
            moveToRelative(7.75f, -6f)
            curveTo(9.336f, 8f, 9f, 8.336f, 9f, 8.75f)
            reflectiveCurveTo(9.336f, 9.5f, 9.75f, 9.5f)
            horizontalLineToRelative(6.995f)
            curveToRelative(-0.347f, 0.498f, -0.762f, 1.137f, -1.2f, 1.903f)
            curveToRelative(-1.13f, 1.976f, -2.419f, 4.807f, -3.033f, 8.214f)
            curveToRelative(-0.074f, 0.408f, 0.197f, 0.798f, 0.605f, 0.871f)
            curveToRelative(0.408f, 0.074f, 0.798f, -0.197f, 0.871f, -0.605f)
            curveToRelative(0.576f, -3.194f, 1.788f, -5.862f, 2.86f, -7.736f)
            curveToRelative(0.534f, -0.935f, 1.032f, -1.668f, 1.394f, -2.165f)
            curveToRelative(0.181f, -0.248f, 0.328f, -0.437f, 0.428f, -0.562f)
            lineToRelative(0.113f, -0.139f)
            lineToRelative(0.028f, -0.033f)
            lineToRelative(0.006f, -0.006f)
            verticalLineTo(9.24f)
            curveToRelative(0.192f, -0.222f, 0.237f, -0.536f, 0.115f, -0.803f)
            curveTo(18.81f, 8.171f, 18.544f, 8f, 18.25f, 8f)
            horizontalLineToRelative(-8.5f)
            close()
        }
    }.build()
}
