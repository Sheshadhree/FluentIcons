package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Tag16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Tag16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11f, 6f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            reflectiveCurveToRelative(-1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            close()
            moveToRelative(-8.413f, 4.136f)
            curveToRelative(-0.783f, -0.78f, -0.783f, -2.043f, 0f, -2.822f)
            lineToRelative(4.74f, -4.716f)
            curveToRelative(0.374f, -0.372f, 0.88f, -0.582f, 1.41f, -0.584f)
            lineTo(11.986f, 2f)
            curveTo(13.103f, 1.995f, 14.008f, 2.899f, 14f, 4.01f)
            lineToRelative(-0.024f, 3.362f)
            curveToRelative(-0.004f, 0.525f, -0.215f, 1.026f, -0.588f, 1.397f)
            lineToRelative(-4.67f, 4.647f)
            curveToRelative(-0.782f, 0.779f, -2.052f, 0.779f, -2.835f, 0f)
            lineToRelative(-3.296f, -3.28f)
            close()
            moveToRelative(0.71f, -2.116f)
            curveToRelative(-0.392f, 0.39f, -0.392f, 1.02f, 0f, 1.41f)
            lineToRelative(3.295f, 3.28f)
            curveToRelative(0.392f, 0.39f, 1.026f, 0.39f, 1.418f, 0f)
            lineToRelative(4.67f, -4.647f)
            curveToRelative(0.186f, -0.185f, 0.291f, -0.436f, 0.293f, -0.698f)
            lineToRelative(0.024f, -3.363f)
            curveToRelative(0.005f, -0.555f, -0.448f, -1.007f, -1.006f, -1.004f)
            lineTo(8.74f, 3.01f)
            curveTo(8.475f, 3.012f, 8.222f, 3.117f, 8.035f, 3.303f)
            lineTo(3.296f, 8.02f)
            close()
        }
    }.build()
}
