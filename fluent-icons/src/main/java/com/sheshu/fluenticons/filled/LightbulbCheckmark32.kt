package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.LightbulbCheckmark32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.LightbulbCheckmark32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23.5f, 1f)
            curveTo(27.642f, 1f, 31f, 4.358f, 31f, 8.5f)
            curveToRelative(0f, 4.142f, -3.358f, 7.5f, -7.5f, 7.5f)
            curveToRelative(-4.142f, 0f, -7.5f, -3.358f, -7.5f, -7.5f)
            curveTo(16f, 4.358f, 19.358f, 1f, 23.5f, 1f)
            close()
            moveToRelative(4.53f, 4.72f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            lineToRelative(-4.72f, 4.72f)
            lineToRelative(-1.97f, -1.97f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            lineToRelative(2.5f, 2.5f)
            curveToRelative(0.293f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            lineToRelative(5.25f, -5.25f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.767f, 0f, -1.06f)
            close()
            moveTo(16f, 2f)
            curveToRelative(0.407f, 0f, 0.808f, 0.024f, 1.201f, 0.071f)
            curveTo(15.534f, 3.705f, 14.5f, 5.981f, 14.5f, 8.5f)
            curveToRelative(0f, 4.97f, 4.03f, 9f, 9f, 9f)
            curveToRelative(0.297f, 0f, 0.59f, -0.014f, 0.88f, -0.043f)
            curveToRelative(-0.49f, 0.751f, -1.077f, 1.432f, -1.745f, 2.025f)
            curveToRelative(-0.343f, 0.304f, -0.561f, 0.645f, -0.64f, 0.986f)
            lineTo(21.18f, 24f)
            horizontalLineTo(10.82f)
            lineToRelative(-0.815f, -3.532f)
            curveToRelative(-0.079f, -0.34f, -0.297f, -0.682f, -0.64f, -0.986f)
            curveTo(7.302f, 17.652f, 6f, 14.977f, 6f, 12f)
            curveTo(6f, 6.477f, 10.477f, 2f, 16f, 2f)
            close()
            moveToRelative(-4.719f, 24f)
            lineToRelative(0.297f, 1.287f)
            curveTo(11.945f, 28.875f, 13.36f, 30f, 14.988f, 30f)
            horizontalLineToRelative(2.023f)
            curveToRelative(1.63f, 0f, 3.044f, -1.125f, 3.41f, -2.713f)
            lineTo(20.72f, 26f)
            horizontalLineToRelative(-9.44f)
            close()
        }
    }.build()
}
