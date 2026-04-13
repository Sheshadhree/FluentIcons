package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.FStop24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.FStop24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.195f, 6.528f)
            curveToRelative(0.338f, -1.98f, 2.371f, -3.182f, 4.268f, -2.524f)
            lineToRelative(0.592f, 0.205f)
            curveToRelative(0.39f, 0.135f, 0.818f, -0.072f, 0.954f, -0.463f)
            curveToRelative(0.135f, -0.392f, -0.072f, -0.819f, -0.463f, -0.955f)
            lineToRelative(-0.592f, -0.205f)
            curveToRelative(-2.772f, -0.96f, -5.744f, 0.797f, -6.237f, 3.69f)
            lineTo(10.995f, 10.5f)
            horizontalLineTo(6.75f)
            curveTo(6.336f, 10.5f, 6f, 10.836f, 6f, 11.25f)
            reflectiveCurveTo(6.336f, 12f, 6.75f, 12f)
            horizontalLineToRelative(3.99f)
            lineToRelative(-0.783f, 4.584f)
            curveToRelative(-0.376f, 2.202f, -2.812f, 3.377f, -4.77f, 2.3f)
            lineToRelative(-0.075f, -0.041f)
            curveToRelative(-0.363f, -0.2f, -0.82f, -0.067f, -1.019f, 0.296f)
            curveToRelative(-0.2f, 0.363f, -0.067f, 0.819f, 0.296f, 1.018f)
            lineTo(4.464f, 20.2f)
            curveToRelative(2.862f, 1.574f, 6.422f, -0.144f, 6.971f, -3.363f)
            lineTo(12.261f, 12f)
            horizontalLineToRelative(3.99f)
            curveToRelative(0.413f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveToRelative(-0.337f, -0.75f, -0.75f, -0.75f)
            horizontalLineToRelative(-3.734f)
            lineToRelative(0.678f, -3.972f)
            close()
        }
    }.build()
}
