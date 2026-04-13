package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.NumberCircle032: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.NumberCircle032",
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
            moveToRelative(10.5f, 0f)
            curveToRelative(0f, -1.867f, 0.277f, -3.416f, 0.859f, -4.464f)
            curveTo(13.898f, 10.564f, 14.7f, 10f, 16f, 10f)
            reflectiveCurveToRelative(2.102f, 0.564f, 2.641f, 1.536f)
            curveTo(19.223f, 12.584f, 19.5f, 14.133f, 19.5f, 16f)
            curveToRelative(0f, 1.867f, -0.277f, 3.416f, -0.859f, 4.464f)
            curveTo(18.102f, 21.436f, 17.3f, 22f, 16f, 22f)
            reflectiveCurveToRelative(-2.102f, -0.564f, -2.641f, -1.536f)
            curveTo(12.777f, 19.416f, 12.5f, 17.867f, 12.5f, 16f)
            close()
            moveTo(16f, 8f)
            curveToRelative(-2.075f, 0f, -3.523f, 1.003f, -4.39f, 2.565f)
            curveTo(10.786f, 12.05f, 10.5f, 14f, 10.5f, 16f)
            curveToRelative(0f, 2f, 0.286f, 3.95f, 1.11f, 5.435f)
            curveTo(12.477f, 22.997f, 13.925f, 24f, 16f, 24f)
            curveToRelative(2.076f, 0f, 3.523f, -1.003f, 4.39f, -2.565f)
            curveTo(21.214f, 19.95f, 21.5f, 18f, 21.5f, 16f)
            curveToRelative(0f, -2f, -0.286f, -3.95f, -1.11f, -5.435f)
            curveTo(19.523f, 9.003f, 18.076f, 8f, 16f, 8f)
            close()
        }
    }.build()
}
