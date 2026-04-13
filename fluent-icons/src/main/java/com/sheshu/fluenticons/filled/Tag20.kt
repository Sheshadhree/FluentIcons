package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Tag20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Tag20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.006f, 4.033f)
            curveToRelative(-0.001f, -1.098f, -0.888f, -1.99f, -1.986f, -1.997f)
            lineToRelative(-4.89f, -0.032f)
            curveTo(10.594f, 2f, 10.081f, 2.211f, 9.703f, 2.588f)
            lineTo(3.022f, 9.252f)
            curveToRelative(-0.783f, 0.781f, -0.783f, 2.049f, -0.002f, 2.83f)
            lineToRelative(4.949f, 4.95f)
            curveToRelative(0.78f, 0.78f, 2.047f, 0.78f, 2.828f, 0f)
            lineToRelative(6.631f, -6.632f)
            curveToRelative(0.376f, -0.376f, 0.587f, -0.886f, 0.586f, -1.417f)
            lineToRelative(-0.008f, -4.95f)
            close()
            moveTo(14f, 7f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            reflectiveCurveToRelative(0.448f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.448f, 1f, 1f)
            reflectiveCurveToRelative(-0.448f, 1f, -1f, 1f)
            close()
        }
    }.build()
}
