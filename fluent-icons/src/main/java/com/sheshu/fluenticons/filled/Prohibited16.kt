package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Prohibited16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Prohibited16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.323f, 3.616f)
            curveTo(9.167f, 1.978f, 6.079f, 2.143f, 4.11f, 4.111f)
            reflectiveCurveToRelative(-2.133f, 5.056f, -0.495f, 7.212f)
            lineToRelative(7.707f, -7.707f)
            close()
            moveToRelative(1.06f, 1.061f)
            lineToRelative(-7.706f, 7.707f)
            curveToRelative(2.156f, 1.638f, 5.244f, 1.473f, 7.212f, -0.495f)
            reflectiveCurveToRelative(2.133f, -5.056f, 0.495f, -7.212f)
            close()
            moveTo(3.05f, 3.05f)
            curveToRelative(2.734f, -2.733f, 7.166f, -2.733f, 9.9f, 0f)
            curveToRelative(2.733f, 2.734f, 2.733f, 7.166f, 0f, 9.9f)
            curveToRelative(-2.734f, 2.733f, -7.166f, 2.733f, -9.9f, 0f)
            curveToRelative(-2.733f, -2.734f, -2.733f, -7.166f, 0f, -9.9f)
            close()
        }
    }.build()
}
