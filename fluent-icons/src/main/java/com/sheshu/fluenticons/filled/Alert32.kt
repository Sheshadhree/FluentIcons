package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Alert32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Alert32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7f, 13f)
            curveToRelative(0f, -4.97f, 4.03f, -9f, 9f, -9f)
            reflectiveCurveToRelative(9f, 4.03f, 9f, 9f)
            verticalLineToRelative(3.807f)
            lineToRelative(1.928f, 4.822f)
            curveToRelative(0.124f, 0.308f, 0.086f, 0.657f, -0.1f, 0.932f)
            curveTo(26.642f, 22.835f, 26.332f, 23f, 26f, 23f)
            horizontalLineTo(6f)
            curveToRelative(-0.332f, 0f, -0.642f, -0.165f, -0.828f, -0.44f)
            curveToRelative(-0.186f, -0.274f, -0.224f, -0.623f, -0.1f, -0.931f)
            lineTo(7f, 16.807f)
            verticalLineTo(13f)
            close()
            moveToRelative(5.125f, 12f)
            curveToRelative(0.441f, 1.73f, 2.004f, 3f, 3.875f, 3f)
            reflectiveCurveToRelative(3.433f, -1.27f, 3.875f, -3f)
            horizontalLineToRelative(-7.75f)
            close()
        }
    }.build()
}
