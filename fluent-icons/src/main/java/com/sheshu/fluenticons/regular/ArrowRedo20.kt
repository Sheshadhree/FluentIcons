package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowRedo20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowRedo20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.003f, 2.5f)
            curveToRelative(0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
            reflectiveCurveToRelative(0.5f, 0.224f, 0.5f, 0.5f)
            verticalLineToRelative(4.9f)
            curveToRelative(0f, 0.331f, -0.269f, 0.6f, -0.6f, 0.6f)
            horizontalLineToRelative(-4.9f)
            curveToRelative(-0.276f, 0f, -0.5f, -0.224f, -0.5f, -0.5f)
            reflectiveCurveToRelative(0.224f, -0.5f, 0.5f, -0.5f)
            horizontalLineToRelative(3.594f)
            lineToRelative(-3.473f, -3.019f)
            curveTo(8.957f, 2.531f, 6.431f, 2.71f, 4.981f, 4.376f)
            curveTo(3.531f, 6.043f, 3.71f, 8.57f, 5.376f, 10.019f)
            lineToRelative(8.172f, 7.104f)
            curveToRelative(0.208f, 0.18f, 0.23f, 0.497f, 0.05f, 0.705f)
            curveToRelative(-0.182f, 0.208f, -0.498f, 0.23f, -0.706f, 0.05f)
            lineTo(4.72f, 10.773f)
            curveTo(2.636f, 8.962f, 2.415f, 5.804f, 4.226f, 3.72f)
            curveToRelative(1.812f, -2.084f, 4.97f, -2.305f, 7.054f, -0.494f)
            lineToRelative(3.723f, 3.237f)
            verticalLineTo(2.5f)
            close()
        }
    }.build()
}
