package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowDown16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowDown16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.5f, 2.5f)
            curveTo(8.5f, 2.224f, 8.276f, 2f, 8f, 2f)
            reflectiveCurveTo(7.5f, 2.224f, 7.5f, 2.5f)
            verticalLineToRelative(9.697f)
            lineTo(3.872f, 8.166f)
            curveTo(3.687f, 7.96f, 3.37f, 7.943f, 3.166f, 8.127f)
            curveTo(2.96f, 8.313f, 2.944f, 8.63f, 3.128f, 8.835f)
            lineToRelative(4.5f, 5f)
            curveTo(7.723f, 13.94f, 7.858f, 14f, 8f, 14f)
            reflectiveCurveToRelative(0.277f, -0.06f, 0.372f, -0.165f)
            lineToRelative(4.5f, -5f)
            curveToRelative(0.184f, -0.206f, 0.168f, -0.522f, -0.037f, -0.707f)
            curveToRelative(-0.206f, -0.184f, -0.522f, -0.168f, -0.707f, 0.037f)
            lineTo(8.5f, 12.197f)
            verticalLineTo(2.5f)
            close()
        }
    }.build()
}
