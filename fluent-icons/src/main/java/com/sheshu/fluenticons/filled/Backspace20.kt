package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Backspace20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Backspace20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.283f, 4f)
            curveToRelative(-0.63f, 0f, -1.235f, 0.237f, -1.697f, 0.664f)
            lineToRelative(-3.787f, 3.5f)
            curveToRelative(-1.07f, 0.99f, -1.07f, 2.682f, 0f, 3.672f)
            lineToRelative(3.787f, 3.5f)
            curveTo(7.048f, 15.763f, 7.654f, 16f, 8.283f, 16f)
            horizontalLineTo(15.5f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-7f)
            curveTo(18f, 5.12f, 16.88f, 4f, 15.5f, 4f)
            horizontalLineTo(8.283f)
            close()
            moveToRelative(0.864f, 3.146f)
            curveToRelative(0.195f, -0.195f, 0.511f, -0.195f, 0.707f, 0f)
            lineTo(12f, 9.293f)
            lineToRelative(2.146f, -2.146f)
            curveToRelative(0.196f, -0.196f, 0.512f, -0.196f, 0.708f, 0f)
            curveToRelative(0.195f, 0.195f, 0.195f, 0.511f, 0f, 0.707f)
            lineTo(12.707f, 10f)
            lineToRelative(2.147f, 2.146f)
            curveToRelative(0.195f, 0.196f, 0.195f, 0.512f, 0f, 0.708f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.708f, 0f)
            lineTo(12f, 10.707f)
            lineToRelative(-2.146f, 2.147f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.707f, 0f)
            curveToRelative(-0.196f, -0.196f, -0.196f, -0.512f, 0f, -0.707f)
            lineTo(11.293f, 10f)
            lineTo(9.147f, 7.854f)
            curveToRelative(-0.196f, -0.196f, -0.196f, -0.512f, 0f, -0.708f)
            close()
        }
    }.build()
}
