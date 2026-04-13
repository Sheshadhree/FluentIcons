package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.PortUsbC24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PortUsbC24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16f, 10.5f)
            curveToRelative(0.398f, 0f, 0.78f, 0.158f, 1.06f, 0.44f)
            curveToRelative(0.282f, 0.28f, 0.44f, 0.662f, 0.44f, 1.06f)
            reflectiveCurveToRelative(-0.158f, 0.78f, -0.44f, 1.06f)
            curveToRelative(-0.28f, 0.282f, -0.662f, 0.44f, -1.06f, 0.44f)
            horizontalLineTo(8f)
            curveToRelative(-0.398f, 0f, -0.78f, -0.158f, -1.06f, -0.44f)
            curveTo(6.657f, 12.78f, 6.5f, 12.399f, 6.5f, 12f)
            reflectiveCurveToRelative(0.158f, -0.78f, 0.44f, -1.06f)
            curveTo(7.22f, 10.657f, 7.601f, 10.5f, 8f, 10.5f)
            horizontalLineToRelative(8f)
            close()
            moveTo(16f, 9f)
            horizontalLineTo(8f)
            curveTo(7.204f, 9f, 6.441f, 9.316f, 5.879f, 9.879f)
            curveTo(5.316f, 10.44f, 5f, 11.204f, 5f, 12f)
            reflectiveCurveToRelative(0.316f, 1.559f, 0.879f, 2.121f)
            curveTo(6.44f, 14.684f, 7.204f, 15f, 8f, 15f)
            horizontalLineToRelative(8f)
            curveToRelative(0.796f, 0f, 1.559f, -0.316f, 2.121f, -0.879f)
            curveTo(18.684f, 13.56f, 19f, 12.796f, 19f, 12f)
            reflectiveCurveToRelative(-0.316f, -1.559f, -0.879f, -2.121f)
            curveTo(17.56f, 9.316f, 16.796f, 9f, 16f, 9f)
            close()
        }
    }.build()
}
