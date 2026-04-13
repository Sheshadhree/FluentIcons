package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Pulse20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Pulse20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.004f, 3f)
            curveToRelative(0.225f, 0.002f, 0.42f, 0.153f, 0.479f, 0.37f)
            lineToRelative(3.043f, 11.303f)
            lineToRelative(2.495f, -8.317f)
            curveTo(13.083f, 6.151f, 13.27f, 6.008f, 13.483f, 6f)
            curveToRelative(0.215f, -0.007f, 0.41f, 0.123f, 0.485f, 0.324f)
            lineTo(15.347f, 10f)
            horizontalLineTo(17.5f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(17.776f, 11f, 17.5f, 11f)
            horizontalLineTo(15f)
            curveToRelative(-0.208f, 0f, -0.395f, -0.13f, -0.468f, -0.324f)
            lineToRelative(-0.98f, -2.611f)
            lineToRelative(-2.573f, 8.579f)
            curveToRelative(-0.064f, 0.214f, -0.263f, 0.36f, -0.486f, 0.356f)
            curveToRelative(-0.223f, -0.003f, -0.418f, -0.154f, -0.476f, -0.37f)
            lineTo(6.986f, 5.37f)
            lineTo(5.48f, 10.637f)
            curveTo(5.419f, 10.852f, 5.223f, 11f, 5f, 11f)
            horizontalLineTo(2.5f)
            curveTo(2.224f, 11f, 2f, 10.776f, 2f, 10.5f)
            reflectiveCurveTo(2.224f, 10f, 2.5f, 10f)
            horizontalLineToRelative(2.123f)
            lineToRelative(1.896f, -6.637f)
            curveTo(6.581f, 3.147f, 6.78f, 2.998f, 7.004f, 3f)
            close()
        }
    }.build()
}
