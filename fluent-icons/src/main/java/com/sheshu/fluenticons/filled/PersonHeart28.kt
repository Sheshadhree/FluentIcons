package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PersonHeart28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PersonHeart28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20.628f, 16.128f)
            curveToRelative(1.458f, -1.503f, 3.87f, -1.503f, 5.327f, 0f)
            curveToRelative(1.396f, 1.44f, 1.396f, 3.728f, 0f, 5.168f)
            lineToRelative(-5.236f, 5.398f)
            curveToRelative(-0.393f, 0.405f, -1.043f, 0.405f, -1.436f, 0f)
            lineToRelative(-5.236f, -5.398f)
            curveToRelative(-1.396f, -1.44f, -1.396f, -3.729f, 0f, -5.168f)
            curveToRelative(1.458f, -1.503f, 3.87f, -1.503f, 5.328f, 0f)
            lineToRelative(0.626f, 0.645f)
            lineToRelative(0.627f, -0.645f)
            close()
            moveTo(12.858f, 16f)
            curveToRelative(-1.284f, 1.82f, -1.127f, 4.344f, 0.471f, 5.992f)
            lineToRelative(3.639f, 3.752f)
            curveTo(16.04f, 25.91f, 15.046f, 26f, 14f, 26f)
            curveToRelative(-5.79f, 0f, -10f, -2.567f, -10f, -6.285f)
            verticalLineTo(19f)
            curveToRelative(0f, -1.657f, 1.343f, -3f, 3f, -3f)
            horizontalLineToRelative(5.858f)
            close()
            moveTo(14f, 2f)
            curveToRelative(3.314f, 0f, 6f, 2.686f, 6f, 6f)
            reflectiveCurveToRelative(-2.686f, 6f, -6f, 6f)
            reflectiveCurveToRelative(-6f, -2.686f, -6f, -6f)
            reflectiveCurveToRelative(2.686f, -6f, 6f, -6f)
            close()
        }
    }.build()
}
