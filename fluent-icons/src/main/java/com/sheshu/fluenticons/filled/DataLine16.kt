package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DataLine16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DataLine16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15f, 4f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            curveToRelative(-0.233f, 0f, -0.457f, -0.04f, -0.665f, -0.113f)
            lineToRelative(-1.64f, 2.05f)
            curveTo(10.887f, 8.245f, 11f, 8.609f, 11f, 9f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            curveToRelative(-0.439f, 0f, -0.845f, -0.141f, -1.175f, -0.381f)
            lineToRelative(-2.832f, 1.214f)
            curveTo(4.997f, 11.883f, 5f, 11.933f, 5f, 11.984f)
            verticalLineTo(12f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            reflectiveCurveToRelative(-2f, -0.895f, -2f, -2f)
            reflectiveCurveToRelative(0.895f, -2f, 2f, -2f)
            curveToRelative(0.692f, 0f, 1.303f, 0.352f, 1.662f, 0.887f)
            lineToRelative(2.51f, -1.076f)
            curveTo(7.061f, 9.563f, 7f, 9.29f, 7f, 9f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            curveToRelative(0.35f, 0f, 0.679f, 0.09f, 0.965f, 0.248f)
            lineToRelative(1.538f, -1.922f)
            curveTo(11.19f, 4.973f, 11f, 4.509f, 11f, 4f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            reflectiveCurveToRelative(2f, 0.895f, 2f, 2f)
            close()
        }
    }.build()
}
