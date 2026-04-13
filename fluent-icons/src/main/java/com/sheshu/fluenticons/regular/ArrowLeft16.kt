package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowLeft16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowLeft16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.5f, 8.5f)
            curveTo(13.776f, 8.5f, 14f, 8.276f, 14f, 8f)
            reflectiveCurveToRelative(-0.224f, -0.5f, -0.5f, -0.5f)
            horizontalLineTo(3.803f)
            lineToRelative(4.032f, -3.628f)
            curveTo(8.04f, 3.687f, 8.056f, 3.37f, 7.872f, 3.166f)
            curveTo(7.687f, 2.96f, 7.37f, 2.944f, 7.165f, 3.128f)
            lineToRelative(-5f, 4.5f)
            curveTo(2.06f, 7.723f, 2f, 7.858f, 2f, 8f)
            reflectiveCurveToRelative(0.06f, 0.277f, 0.166f, 0.372f)
            lineToRelative(5f, 4.5f)
            curveToRelative(0.205f, 0.184f, 0.52f, 0.168f, 0.706f, -0.037f)
            curveToRelative(0.184f, -0.206f, 0.168f, -0.522f, -0.037f, -0.707f)
            lineTo(3.803f, 8.5f)
            horizontalLineTo(13.5f)
            close()
        }
    }.build()
}
