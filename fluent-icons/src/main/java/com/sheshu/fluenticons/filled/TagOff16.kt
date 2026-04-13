package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TagOff16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TagOff16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.719f, 11.426f)
            lineToRelative(3.427f, 3.428f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            lineToRelative(-13f, -13f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.708f)
            lineToRelative(3.456f, 3.455f)
            lineToRelative(-2.015f, 2.005f)
            curveToRelative(-0.783f, 0.78f, -0.783f, 2.043f, 0f, 2.822f)
            lineToRelative(3.296f, 3.28f)
            curveToRelative(0.783f, 0.779f, 2.053f, 0.779f, 2.836f, 0f)
            lineToRelative(2f, -1.99f)
            close()
            moveToRelative(2.67f, -2.657f)
            lineToRelative(-1.253f, 1.246f)
            lineTo(6.02f, 3.898f)
            lineToRelative(1.307f, -1.3f)
            curveToRelative(0.374f, -0.372f, 0.88f, -0.582f, 1.41f, -0.584f)
            lineTo(11.986f, 2f)
            curveTo(13.103f, 1.995f, 14.008f, 2.899f, 14f, 4.01f)
            lineToRelative(-0.024f, 3.362f)
            curveToRelative(-0.004f, 0.525f, -0.215f, 1.026f, -0.588f, 1.397f)
            close()
            moveTo(11f, 6f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            reflectiveCurveToRelative(-1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            close()
        }
    }.build()
}
