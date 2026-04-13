package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowHookDownLeft24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowHookDownLeft24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7f, 4.75f)
            curveTo(7f, 4.336f, 7.336f, 4f, 7.75f, 4f)
            horizontalLineTo(14f)
            curveToRelative(1.979f, 0f, 3.504f, 0.823f, 4.52f, 2.074f)
            curveTo(19.52f, 7.307f, 20f, 8.92f, 20f, 10.5f)
            reflectiveCurveToRelative(-0.48f, 3.193f, -1.48f, 4.426f)
            curveTo(17.504f, 16.177f, 15.979f, 17f, 14f, 17f)
            horizontalLineTo(7.56f)
            lineToRelative(2.47f, 2.47f)
            curveToRelative(0.293f, 0.293f, 0.293f, 0.767f, 0f, 1.06f)
            curveToRelative(-0.293f, 0.293f, -0.767f, 0.293f, -1.06f, 0f)
            lineToRelative(-3.75f, -3.75f)
            curveToRelative(-0.293f, -0.293f, -0.293f, -0.767f, 0f, -1.06f)
            lineToRelative(3.75f, -3.75f)
            curveToRelative(0.293f, -0.293f, 0.767f, -0.293f, 1.06f, 0f)
            curveToRelative(0.293f, 0.293f, 0.293f, 0.767f, 0f, 1.06f)
            lineTo(7.56f, 15.5f)
            horizontalLineTo(14f)
            curveToRelative(1.521f, 0f, 2.62f, -0.615f, 3.355f, -1.52f)
            curveToRelative(0.75f, -0.923f, 1.145f, -2.185f, 1.145f, -3.48f)
            reflectiveCurveToRelative(-0.396f, -2.557f, -1.145f, -3.48f)
            curveTo(16.621f, 6.114f, 15.521f, 5.5f, 14f, 5.5f)
            horizontalLineTo(7.75f)
            curveTo(7.336f, 5.5f, 7f, 5.164f, 7f, 4.75f)
            close()
        }
    }.build()
}
