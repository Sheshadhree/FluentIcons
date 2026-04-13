package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Tag16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Tag16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.587f, 7.314f)
            curveToRelative(-0.783f, 0.78f, -0.783f, 2.043f, 0f, 2.822f)
            lineToRelative(3.296f, 3.28f)
            curveToRelative(0.783f, 0.779f, 2.053f, 0.779f, 2.836f, 0f)
            lineToRelative(4.67f, -4.647f)
            curveToRelative(0.372f, -0.37f, 0.583f, -0.872f, 0.587f, -1.397f)
            lineTo(14f, 4.01f)
            curveToRelative(0.008f, -1.111f, -0.897f, -2.015f, -2.013f, -2.01f)
            lineToRelative(-3.25f, 0.014f)
            curveTo(8.206f, 2.015f, 7.7f, 2.226f, 7.326f, 2.598f)
            lineToRelative(-4.74f, 4.716f)
            close()
            moveTo(11f, 6f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            reflectiveCurveToRelative(0.448f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.448f, 1f, 1f)
            reflectiveCurveToRelative(-0.448f, 1f, -1f, 1f)
            close()
        }
    }.build()
}
