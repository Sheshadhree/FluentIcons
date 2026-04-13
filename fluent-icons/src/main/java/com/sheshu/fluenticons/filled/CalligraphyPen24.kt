package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CalligraphyPen24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CalligraphyPen24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.5f, 2.75f)
            curveTo(7.5f, 2.336f, 7.164f, 2f, 6.75f, 2f)
            reflectiveCurveTo(6f, 2.336f, 6f, 2.75f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 0.896f, 0.674f, 1.636f, 1.543f, 1.738f)
            lineTo(6.527f, 9.993f)
            curveToRelative(-0.408f, 1.006f, -0.363f, 2.182f, 0.119f, 3.143f)
            lineToRelative(3.99f, 7.95f)
            curveToRelative(0.149f, 0.298f, 0.363f, 0.535f, 0.614f, 0.693f)
            verticalLineTo(12.3f)
            curveToRelative(-0.448f, -0.26f, -0.75f, -0.745f, -0.75f, -1.3f)
            curveToRelative(0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
            curveToRelative(0f, 0.555f, -0.302f, 1.04f, -0.75f, 1.3f)
            verticalLineToRelative(9.48f)
            curveToRelative(0.251f, -0.159f, 0.465f, -0.396f, 0.615f, -0.693f)
            lineToRelative(3.99f, -7.951f)
            curveToRelative(0.481f, -0.96f, 0.526f, -2.137f, 0.118f, -3.143f)
            lineToRelative(-1.016f, -2.505f)
            curveTo(17.326f, 7.385f, 18f, 6.646f, 18f, 5.75f)
            verticalLineToRelative(-3f)
            curveTo(18f, 2.336f, 17.664f, 2f, 17.25f, 2f)
            reflectiveCurveTo(16.5f, 2.336f, 16.5f, 2.75f)
            verticalLineToRelative(3f)
            curveTo(16.5f, 5.888f, 16.388f, 6f, 16.25f, 6f)
            horizontalLineToRelative(-8.5f)
            curveTo(7.612f, 6f, 7.5f, 5.888f, 7.5f, 5.75f)
            verticalLineToRelative(-3f)
            close()
        }
    }.build()
}
