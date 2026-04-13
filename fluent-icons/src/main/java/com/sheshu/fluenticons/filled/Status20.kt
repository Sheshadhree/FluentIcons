package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Status20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Status20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.354f, 2.647f)
            curveToRelative(-1.024f, -1.024f, -2.684f, -1.024f, -3.707f, 0f)
            lineToRelative(-5.5f, 5.5f)
            curveTo(8.082f, 8.21f, 8.037f, 8.29f, 8.014f, 8.379f)
            lineToRelative(-1f, 4f)
            curveToRelative(-0.043f, 0.17f, 0.007f, 0.35f, 0.131f, 0.475f)
            curveToRelative(0.125f, 0.124f, 0.305f, 0.174f, 0.475f, 0.131f)
            lineToRelative(4f, -1f)
            curveToRelative(0.088f, -0.022f, 0.168f, -0.067f, 0.233f, -0.131f)
            lineToRelative(5.5f, -5.5f)
            curveToRelative(1.023f, -1.024f, 1.023f, -2.684f, 0f, -3.707f)
            close()
            moveToRelative(-1.41f, 6.53f)
            curveTo(15.981f, 9.447f, 16f, 9.722f, 16f, 10f)
            curveToRelative(0f, 3.314f, -2.686f, 6f, -6f, 6f)
            reflectiveCurveToRelative(-6f, -2.686f, -6f, -6f)
            reflectiveCurveToRelative(2.686f, -6f, 6f, -6f)
            curveToRelative(0.28f, 0f, 0.554f, 0.02f, 0.823f, 0.056f)
            lineToRelative(0.854f, -0.854f)
            curveTo(11.139f, 3.07f, 10.577f, 3f, 10f, 3f)
            curveToRelative(-3.866f, 0f, -7f, 3.134f, -7f, 7f)
            reflectiveCurveToRelative(3.134f, 7f, 7f, 7f)
            reflectiveCurveToRelative(7f, -3.134f, 7f, -7f)
            curveToRelative(0f, -0.578f, -0.07f, -1.14f, -0.202f, -1.676f)
            lineToRelative(-0.854f, 0.854f)
            close()
        }
    }.build()
}
