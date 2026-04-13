package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Fluent20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Fluent20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.276f, 2.053f)
            curveToRelative(0.141f, -0.07f, 0.307f, -0.07f, 0.448f, 0f)
            lineToRelative(5f, 2.5f)
            curveTo(15.893f, 4.638f, 16f, 4.81f, 16f, 5f)
            reflectiveCurveToRelative(-0.107f, 0.362f, -0.276f, 0.447f)
            lineTo(11.618f, 7.5f)
            lineToRelative(4.106f, 2.053f)
            curveTo(15.893f, 9.637f, 16f, 9.81f, 16f, 10f)
            reflectiveCurveToRelative(-0.107f, 0.363f, -0.276f, 0.447f)
            lineTo(11f, 12.81f)
            verticalLineToRelative(4.69f)
            curveToRelative(0f, 0.18f, -0.097f, 0.346f, -0.254f, 0.435f)
            curveToRelative(-0.156f, 0.089f, -0.349f, 0.086f, -0.503f, -0.006f)
            lineToRelative(-5f, -3f)
            curveTo(5.093f, 14.839f, 5f, 14.676f, 5f, 14.5f)
            verticalLineTo(5f)
            curveToRelative(0f, -0.19f, 0.107f, -0.362f, 0.276f, -0.447f)
            lineToRelative(5f, -2.5f)
            close()
            moveTo(6f, 5.309f)
            verticalLineToRelative(8.908f)
            lineToRelative(4f, 2.4f)
            verticalLineToRelative(-3.808f)
            curveToRelative(0f, -0.379f, 0.214f, -0.725f, 0.553f, -0.894f)
            lineTo(14.382f, 10f)
            lineToRelative(-4.106f, -2.053f)
            curveTo(10.107f, 7.862f, 10f, 7.69f, 10f, 7.5f)
            reflectiveCurveToRelative(0.107f, -0.362f, 0.276f, -0.447f)
            lineTo(14.382f, 5f)
            lineTo(10.5f, 3.059f)
            lineTo(6f, 5.309f)
            close()
        }
    }.build()
}
