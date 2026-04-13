package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.LightbulbCircle20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.LightbulbCircle20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 18f)
            curveToRelative(4.418f, 0f, 8f, -3.582f, 8f, -8f)
            reflectiveCurveToRelative(-3.582f, -8f, -8f, -8f)
            reflectiveCurveToRelative(-8f, 3.582f, -8f, 8f)
            reflectiveCurveToRelative(3.582f, 8f, 8f, 8f)
            close()
            moveTo(6.5f, 8.5f)
            curveTo(6.5f, 6.567f, 8.067f, 5f, 10f, 5f)
            reflectiveCurveToRelative(3.5f, 1.567f, 3.5f, 3.5f)
            curveToRelative(0f, 1.151f, -0.556f, 2.173f, -1.413f, 2.81f)
            curveToRelative(-0.183f, 0.136f, -0.284f, 0.289f, -0.31f, 0.43f)
            lineTo(11.726f, 12f)
            horizontalLineTo(8.273f)
            lineToRelative(-0.05f, -0.26f)
            curveToRelative(-0.026f, -0.141f, -0.127f, -0.294f, -0.31f, -0.43f)
            curveTo(7.056f, 10.673f, 6.5f, 9.65f, 6.5f, 8.5f)
            close()
            moveToRelative(2.182f, 5.684f)
            lineTo(8.46f, 13f)
            horizontalLineToRelative(3.08f)
            lineToRelative(-0.222f, 1.184f)
            curveTo(11.229f, 14.657f, 10.816f, 15f, 10.335f, 15f)
            horizontalLineToRelative(-0.67f)
            curveToRelative(-0.481f, 0f, -0.894f, -0.343f, -0.983f, -0.816f)
            close()
        }
    }.build()
}
