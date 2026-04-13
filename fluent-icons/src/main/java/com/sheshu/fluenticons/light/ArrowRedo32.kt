package com.sheshu.fluenticons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Light.ArrowRedo32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.ArrowRedo32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(25.995f, 3.5f)
            curveToRelative(0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
            reflectiveCurveToRelative(0.5f, 0.224f, 0.5f, 0.5f)
            verticalLineToRelative(12f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            horizontalLineToRelative(-12f)
            curveToRelative(-0.276f, 0f, -0.5f, -0.224f, -0.5f, -0.5f)
            reflectiveCurveToRelative(0.224f, -0.5f, 0.5f, -0.5f)
            horizontalLineToRelative(10.793f)
            lineToRelative(-9.07f, -9.07f)
            curveToRelative(-2.476f, -2.476f, -6.459f, -2.576f, -9.056f, -0.227f)
            curveToRelative(-2.786f, 2.522f, -2.895f, 6.862f, -0.237f, 9.52f)
            lineToRelative(12.924f, 12.923f)
            curveToRelative(0.195f, 0.196f, 0.195f, 0.512f, 0f, 0.708f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.707f, 0f)
            lineTo(6.218f, 15.93f)
            curveTo(3.156f, 12.868f, 3.28f, 7.867f, 6.492f, 4.962f)
            curveToRelative(2.991f, -2.707f, 7.58f, -2.592f, 10.433f, 0.26f)
            lineToRelative(9.07f, 9.07f)
            verticalLineTo(3.5f)
            close()
        }
    }.build()
}
