package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowRight16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowRight16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.5f, 7.5f)
            curveTo(2.224f, 7.5f, 2f, 7.724f, 2f, 8f)
            reflectiveCurveToRelative(0.224f, 0.5f, 0.5f, 0.5f)
            horizontalLineToRelative(9.697f)
            lineToRelative(-4.031f, 3.628f)
            curveToRelative(-0.206f, 0.185f, -0.222f, 0.501f, -0.038f, 0.707f)
            curveToRelative(0.185f, 0.205f, 0.501f, 0.221f, 0.707f, 0.037f)
            lineToRelative(5f, -4.5f)
            curveTo(13.94f, 8.277f, 14f, 8.142f, 14f, 8f)
            reflectiveCurveToRelative(-0.06f, -0.277f, -0.165f, -0.372f)
            lineToRelative(-5f, -4.5f)
            curveTo(8.629f, 2.944f, 8.313f, 2.96f, 8.127f, 3.166f)
            curveTo(7.944f, 3.37f, 7.96f, 3.686f, 8.165f, 3.872f)
            lineTo(12.197f, 7.5f)
            horizontalLineTo(2.5f)
            close()
        }
    }.build()
}
