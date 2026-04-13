package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.NumberCircle732: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.NumberCircle732",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 16f)
            curveTo(2f, 8.268f, 8.268f, 2f, 16f, 2f)
            reflectiveCurveToRelative(14f, 6.268f, 14f, 14f)
            reflectiveCurveToRelative(-6.268f, 14f, -14f, 14f)
            reflectiveCurveTo(2f, 23.732f, 2f, 16f)
            close()
            moveToRelative(9f, -7f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(8.01f)
            curveToRelative(-0.383f, 0.562f, -0.83f, 1.259f, -1.3f, 2.077f)
            curveToRelative(-1.345f, 2.34f, -2.894f, 5.694f, -3.691f, 9.73f)
            curveToRelative(-0.107f, 0.541f, 0.245f, 1.067f, 0.787f, 1.174f)
            curveToRelative(0.542f, 0.107f, 1.068f, -0.246f, 1.175f, -0.787f)
            curveToRelative(0.743f, -3.765f, 2.194f, -6.912f, 3.464f, -9.12f)
            curveToRelative(0.633f, -1.104f, 1.22f, -1.967f, 1.643f, -2.552f)
            curveToRelative(0.212f, -0.293f, 0.384f, -0.515f, 0.5f, -0.662f)
            lineToRelative(0.132f, -0.163f)
            lineToRelative(0.032f, -0.038f)
            lineToRelative(0.007f, -0.008f)
            curveToRelative(0.254f, -0.297f, 0.313f, -0.714f, 0.15f, -1.069f)
            curveTo(21.745f, 9.227f, 21.39f, 9f, 21f, 9f)
            horizontalLineTo(11f)
            close()
        }
    }.build()
}
