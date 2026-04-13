package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Broom20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Broom20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.91f, 2.182f)
            curveToRelative(0.195f, 0.195f, 0.195f, 0.511f, 0f, 0.707f)
            lineTo(12.587f, 8.21f)
            curveToRelative(1.415f, 1.767f, 1.304f, 4.354f, -0.334f, 5.991f)
            lineToRelative(-0.664f, 0.664f)
            lineToRelative(-2.09f, 3.483f)
            curveToRelative(-0.078f, 0.132f, -0.214f, 0.22f, -0.367f, 0.239f)
            curveToRelative(-0.153f, 0.019f, -0.306f, -0.034f, -0.415f, -0.143f)
            lineToRelative(-7.07f, -7.071f)
            curveToRelative(-0.11f, -0.109f, -0.162f, -0.262f, -0.143f, -0.415f)
            curveToRelative(0.019f, -0.152f, 0.107f, -0.288f, 0.239f, -0.367f)
            lineToRelative(3.482f, -2.09f)
            lineToRelative(0.664f, -0.664f)
            curveTo(7.527f, 6.2f, 10.113f, 6.088f, 11.88f, 7.503f)
            lineToRelative(5.323f, -5.322f)
            curveToRelative(0.195f, -0.196f, 0.512f, -0.196f, 0.707f, 0f)
            close()
            moveTo(6.243f, 8.899f)
            lineToRelative(4.95f, 4.95f)
            lineToRelative(0.353f, -0.354f)
            curveToRelative(1.367f, -1.366f, 1.367f, -3.583f, 0f, -4.95f)
            curveToRelative(-1.367f, -1.366f, -3.583f, -1.366f, -4.95f, 0f)
            lineTo(6.243f, 8.9f)
            close()
            moveTo(5.458f, 9.53f)
            lineToRelative(-2.652f, 1.59f)
            lineToRelative(6.166f, 6.166f)
            lineToRelative(1.59f, -2.652f)
            lineTo(5.459f, 9.53f)
            close()
        }
    }.build()
}
